/*
 * Created by JFormDesigner on Tue Nov 01 10:00:49 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Carros extends JFrame {
    public Carros() {
        initComponents();
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
        label7 = new JLabel();
        comboBox3 = new JComboBox();
        label5 = new JLabel();
        comboBox1 = new JComboBox();
        button1 = new JButton();
        buttonBar = new JPanel();
        progressBar1 = new JProgressBar();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setResizable(false);
        setTitle("Cadastro Carros");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setMinimumSize(new Dimension(700, 450));
            dialogPane.setPreferredSize(new Dimension(1000, 700));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(400, 300));
                contentPanel.setMinimumSize(new Dimension(400, 300));
                contentPanel.setLayout(new MigLayout(
                    "flowy,insets dialog,hidemode 3,alignx left",
                    // columns
                    "[50:50,shrink 0,fill]" +
                    "[grow,fill]" +
                    "[grow,fill]" +
                    "[fill]",
                    // rows
                    "[20:20]"));

                //---- label1 ----
                label1.setText("Nome");
                contentPanel.add(label1, "cell 1 1");
                contentPanel.add(textField1, "cell 1 2 2 1");

                //---- label2 ----
                label2.setText("Descri\u00e7\u00e3o");
                contentPanel.add(label2, "cell 1 3");
                contentPanel.add(textField2, "cell 1 4 2 1");

                //---- label3 ----
                label3.setText("Pre\u00e7o");
                contentPanel.add(label3, "cell 1 5");
                contentPanel.add(textField3, "cell 1 6 2 1");

                //---- label4 ----
                label4.setText("Placa");
                contentPanel.add(label4, "cell 1 7");
                contentPanel.add(textField4, "cell 1 8 2 1");

                //---- label7 ----
                label7.setText("text");
                contentPanel.add(label7, "cell 1 9");
                contentPanel.add(comboBox3, "cell 1 11 2 1");

                //---- label5 ----
                label5.setText("Marca");
                contentPanel.add(label5, "cell 1 12");
                contentPanel.add(comboBox1, "cell 1 13");

                //---- button1 ----
                button1.setText("text");
                contentPanel.add(button1, "cell 2 13");
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
    private JLabel label7;
    private JComboBox comboBox3;
    private JLabel label5;
    private JComboBox comboBox1;
    private JButton button1;
    private JPanel buttonBar;
    private JProgressBar progressBar1;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
