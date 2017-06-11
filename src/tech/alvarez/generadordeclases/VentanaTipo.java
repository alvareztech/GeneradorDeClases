package tech.alvarez.generadordeclases;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Clase VentanaTipo
 * @author Daniel Alvarez (a3dany)
 */
public class VentanaTipo extends JDialog {

    private Tipo tipo;
    private VentanaPrincipal nucleo;
    private JButton botonAceptarYAdicionar;
    private JList listaTipos;
    private JScrollPane scrollListaTipos;
    private JTextField txtObjeto;
    private JTextField txtVector;
    private JTextField txtMatriz1;
    private JTextField txtMatriz2;
    private JRadioButton radioBasico;
    private JRadioButton radioVector;
    private JRadioButton radioMatriz;
    private ButtonGroup grupoArray;

    public VentanaTipo(VentanaPrincipal parent, boolean modal) {
        super(parent, modal);
        this.nucleo = parent;
        this.tipo = new Tipo("String", "no-array", "", "", false);
        configurarDialog();
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        botonAceptarYAdicionar = new JButton();
        DefaultListModel modelo = new DefaultListModel();
        String[] tipos = new String[]{"char", "byte", "short", "int", "long", "float", "double", "boolean", "String"};
        for (int i = 0; i < tipos.length; i++) {
            modelo.addElement(tipos[i]);
        }
        listaTipos = new JList(modelo);
        txtObjeto = new JTextField();
        txtVector = new JTextField();
        txtMatriz1 = new JTextField();
        txtMatriz2 = new JTextField();
        radioBasico = new JRadioButton();
        radioVector = new JRadioButton();
        radioMatriz = new JRadioButton();
        grupoArray = new ButtonGroup();

        // listaTipos.setBounds(10, 10, 120, 150);
        listaTipos.setFont(new Font("Consolas", Font.PLAIN, 12));
        listaTipos.setLayoutOrientation(JList.VERTICAL_WRAP);
        listaTipos.setVisibleRowCount(8);
        listaTipos.setSelectedIndex(8);
        listaTipos.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent evt) {
                txtObjeto.setForeground(Color.GRAY);
                txtObjeto.setText("Otro Tipo");
            }
        });

        scrollListaTipos = new JScrollPane(listaTipos);
        scrollListaTipos.setBounds(10, 10, 140, 160);
        // scrollListaTipos.setPreferredSize(new Dimension(120, 140));

        txtObjeto.setForeground(Color.GRAY);
        txtObjeto.setText("Otro Tipo");
        txtObjeto.setBounds(10, 170, 140, 25);
        txtObjeto.setFont(new Font("Consolas", Font.PLAIN, 12));
        txtObjeto.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent evt) {
                listaTipos.clearSelection();
                txtObjeto.setText("");
                txtObjeto.setForeground(Color.BLACK);
            }
        });

        radioBasico.setText("");
        radioBasico.setBounds(160, 40, 55, 20);
        radioBasico.setFont(new Font("Consolas", Font.PLAIN, 12));
        radioBasico.setSelected(true);

        radioVector.setText("[]");
        radioVector.setBounds(160, 70, 55, 20);
        radioVector.setFont(new Font("Consolas", Font.PLAIN, 12));
        radioVector.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent evt) {
                if (radioVector.isSelected()) {
                    txtVector.setVisible(true);
                } else {
                    txtVector.setVisible(false);
                }
            }
        });

        radioMatriz.setText("[][]");
        radioMatriz.setBounds(160, 100, 55, 20);
        radioMatriz.setFont(new Font("Consolas", Font.PLAIN, 12));
        radioMatriz.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent evt) {
                if (radioMatriz.isSelected()) {
                    txtMatriz1.setVisible(true);
                    txtMatriz2.setVisible(true);
                } else {
                    txtMatriz1.setVisible(false);
                    txtMatriz2.setVisible(false);
                }
            }
        });

        grupoArray.add(radioBasico);
        grupoArray.add(radioVector);
        grupoArray.add(radioMatriz);

        txtVector.setBounds(220, 70, 100, 25);
        txtVector.setFont(new Font("Consolas", Font.PLAIN, 12));

        txtMatriz1.setBounds(220, 100, 100, 25);
        txtMatriz1.setFont(new Font("Consolas", Font.PLAIN, 12));

        txtMatriz2.setBounds(220, 125, 100, 25);
        txtMatriz2.setFont(new Font("Consolas", Font.PLAIN, 12));

        botonAceptarYAdicionar.setText("Adicionar");
        botonAceptarYAdicionar.setBounds(190, 170, 140, 25);
        botonAceptarYAdicionar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actualizarTipo();
                nucleo.adicionarAtributo();
            }
        });

        //add(listaTipos);
        getContentPane().add(scrollListaTipos);
        add(txtObjeto);
        add(txtVector);
        add(txtMatriz1);
        add(txtMatriz2);
        add(radioBasico);
        add(radioVector);
        add(radioMatriz);
        add(botonAceptarYAdicionar);
    }

    private void configurarDialog() {
        setTitle("Tipo");
        setLayout(null);
        setSize(370, 235);
        setResizable(false);
        setLocationRelativeTo(nucleo);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {

            public void windowOpened(WindowEvent evt) {
                txtVector.setVisible(false);
                txtMatriz1.setVisible(false);
                txtMatriz2.setVisible(false);
            }
        });
    }

    public void actualizarTipo() {
        boolean objeto = txtObjeto.getText().equals("Otro Tipo") ? false : true;
        //boolean objeto = txtObjeto.getText().trim().equals("") ? false : true;
        //boolean objeto = !listaTipos.isSelectionEmpty() ? false : true;
        System.out.println("   " + objeto);
        String nombre = objeto ? Formato.nombreClase(txtObjeto.getText()) : listaTipos.getSelectedValue().toString();
        String array = radioBasico.isSelected() ? "no-array" : radioVector.isSelected() ? "vector" : "matriz";
        String variableArray1;
        String variableArray2;
        if (array.equals("vector")) {
            variableArray1 = txtVector.getText().trim().equals("") ? "7" : Formato.variable(txtVector.getText());
            variableArray2 = "";
        } else {
            if (array.equals("matriz")) {
                variableArray1 = txtMatriz1.getText().trim().equals("") ? "7" : Formato.variable(txtMatriz1.getText());
                variableArray2 = txtMatriz2.getText().trim().equals("") ? "7" : Formato.variable(txtMatriz2.getText());
            } else {
                variableArray1 = "";
                variableArray2 = "";
            }
        }
        tipo = new Tipo(nombre, array, variableArray1, variableArray2, objeto);
        nucleo.actualizar(tipo.getDefinicionJava());
        setVisible(false);
        // adicionamos en nuevo tipo siempre y cuando no este.
        DefaultListModel modelo = (DefaultListModel) listaTipos.getModel();
        boolean sw = false;
        for (int i = 0; i < modelo.size(); i++) {
            if (modelo.getElementAt(i).equals(nombre)) {
                sw = true; // esta en la lista
            }
        }
        if (!sw) {
            modelo.addElement(nombre);
        }
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
