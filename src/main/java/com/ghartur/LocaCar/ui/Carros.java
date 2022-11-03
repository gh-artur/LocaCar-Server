/*
 * Created by JFormDesigner on Tue Nov 01 10:00:49 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Carros extends JFrame {
    public Carros() {
        initComponents();
    }

    private void cancel(ActionEvent e) {
        // TODO add your code here
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        comboBox1 = new JComboBox();
        button1 = new JButton();
        label6 = new JLabel();
        comboBox2 = new JComboBox();
        button2 = new JButton();
        label7 = new JLabel();
        comboBox3 = new JComboBox();
        panel1 = new JPanel();
        buttonBar = new JPanel();
        progressBar1 = new JProgressBar();
        okButton = new JButton();
        cancelButton = new JButton();
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        setResizable(false);
        setTitle("Cadastro Carros");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setMinimumSize(new Dimension(800, 700));
            dialogPane.setPreferredSize(new Dimension(800, 700));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(400, 300));
                contentPanel.setMinimumSize(new Dimension(400, 300));
                contentPanel.setFont(new Font("Inconsolata", contentPanel.getFont().getStyle(), 16));
                contentPanel.setLayout(new MigLayout(
                    "flowy,insets dialog,hidemode 3,alignx left",
                    // columns
                    "[20:20,shrink 0,fill]" +
                    "[170:170,grow,fill]" +
                    "[20:46,grow,fill]" +
                    "[20:20,fill]",
                    // rows
                    "[]20" +
                    "[]" +
                    "[]" +
                    "[40:40]" +
                    "[]" +
                    "[40:40]" +
                    "[]" +
                    "[40:40]" +
                    "[]" +
                    "[40:40]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[40:40]"));

                //---- label1 ----
                label1.setText("Nome");
                contentPanel.add(label1, "cell 1 2");

                //---- textField1 ----
                textField1.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
                contentPanel.add(textField1, "cell 1 3 2 1");

                //---- label2 ----
                label2.setText("Descri\u00e7\u00e3o");
                contentPanel.add(label2, "cell 1 4");
                contentPanel.add(textField2, "cell 1 5 2 1");

                //---- label3 ----
                label3.setText("Pre\u00e7o");
                contentPanel.add(label3, "cell 1 6");
                contentPanel.add(textField3, "cell 1 7 2 1");

                //---- label4 ----
                label4.setText("Placa");
                contentPanel.add(label4, "cell 1 8");
                contentPanel.add(textField4, "cell 1 9 2 1");

                //---- label5 ----
                label5.setText("Marca");
                contentPanel.add(label5, "cell 1 10");
                contentPanel.add(comboBox1, "cell 1 11");

                //---- button1 ----
                button1.setText("Adicionar");
                contentPanel.add(button1, "cell 2 11");

                //---- label6 ----
                label6.setText("Categoria");
                contentPanel.add(label6, "cell 1 12");
                contentPanel.add(comboBox2, "cell 1 13");

                //---- button2 ----
                button2.setText("Adicionar");
                contentPanel.add(button2, "cell 2 13");

                //---- label7 ----
                label7.setText("Cor");
                contentPanel.add(label7, "cell 1 14");
                contentPanel.add(comboBox3, "cell 1 15");

                //======== panel1 ========
                {
                    panel1.setBorder(new EtchedBorder());
                    panel1.setMaximumSize(new Dimension(85, 30));
                    panel1.setMinimumSize(new Dimension(85, 30));
                    panel1.setPreferredSize(new Dimension(85, 30));
                    panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
                }
                contentPanel.add(panel1, "cell 2 15,align center center,grow 0 0");
            }
            dialogPane.add(contentPanel, BorderLayout.WEST);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));
                buttonBar.add(progressBar1, "cell 0 0 20 1,growx");

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, "cell 20 0");

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, "cell 21 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== scrollPane1 ========
            {
                scrollPane1.setMinimumSize(new Dimension(400, 300));
                scrollPane1.setMaximumSize(new Dimension(400, 300));
                scrollPane1.setPreferredSize(new Dimension(400, 300));
                scrollPane1.setBorder(null);

                //---- list1 ----
                list1.setSelectionBackground(new Color(0xff6600));
                scrollPane1.setViewportView(list1);
            }
            dialogPane.add(scrollPane1, BorderLayout.EAST);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JComboBox comboBox1;
    private JButton button1;
    private JLabel label6;
    private JComboBox comboBox2;
    private JButton button2;
    private JLabel label7;
    private JComboBox comboBox3;
    private JPanel panel1;
    private JPanel buttonBar;
    private JProgressBar progressBar1;
    private JButton okButton;
    private JButton cancelButton;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
