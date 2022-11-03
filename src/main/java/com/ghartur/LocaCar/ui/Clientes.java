/*
 * Created by JFormDesigner on Thu Nov 03 10:35:04 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Clientes extends JFrame {
    public Clientes() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel2 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        label6 = new JLabel();
        textField6 = new JTextField();
        button2 = new JButton();
        buttonBar = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setMinimumSize(new Dimension(800, 700));
            dialogPane.setPreferredSize(new Dimension(800, 700));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel2 ========
            {
                contentPanel2.setMinimumSize(new Dimension(400, 300));
                contentPanel2.setPreferredSize(new Dimension(400, 300));
                contentPanel2.setLayout(new MigLayout(
                    "fillx,insets dialog,hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[center]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]10" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Nome");
                contentPanel2.add(label1, "cell 1 1");
                contentPanel2.add(textField1, "cell 1 2,growx");

                //---- label2 ----
                label2.setText("Data de Nascimento");
                contentPanel2.add(label2, "cell 1 3");
                contentPanel2.add(textField2, "cell 1 4,growx");

                //---- label3 ----
                label3.setText("Email");
                contentPanel2.add(label3, "cell 1 5");
                contentPanel2.add(textField3, "cell 1 6,growx");

                //---- label4 ----
                label4.setText("CNH");
                contentPanel2.add(label4, "cell 1 7");
                contentPanel2.add(textField4, "cell 1 8,growx");

                //---- label5 ----
                label5.setText("Endere\u00e7o");
                contentPanel2.add(label5, "cell 1 9");
                contentPanel2.add(textField5, "cell 1 10,growx");

                //---- label6 ----
                label6.setText("Telefone");
                contentPanel2.add(label6, "cell 1 11");
                contentPanel2.add(textField6, "cell 1 12,growx");

                //---- button2 ----
                button2.setText("Adicionar");
                contentPanel2.add(button2, "cell 1 13");
            }
            dialogPane.add(contentPanel2, BorderLayout.LINE_START);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "flowy,fillx,insets dialog,alignx center",
                    // columns
                    "[fill]",
                    // rows
                    null));

                //---- button1 ----
                button1.setText("OK");
                buttonBar.add(button1, "cell 0 0,growx");
            }
            dialogPane.add(buttonBar, BorderLayout.PAGE_END);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(list1);
            }
            dialogPane.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel2;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JLabel label6;
    private JTextField textField6;
    private JButton button2;
    private JPanel buttonBar;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
