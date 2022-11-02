/*
 * Created by JFormDesigner on Tue Nov 01 10:00:49 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import java.awt.event.*;
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

    private void cancel(ActionEvent e) {
        // TODO add your code here
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
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
                contentPanel.setFont(new Font("Inconsolata", contentPanel.getFont().getStyle(), 16));
                contentPanel.setLayout(new MigLayout(
                    "flowy,insets dialog,hidemode 3,alignx left",
                    // columns
                    "[50:50,shrink 0,fill]" +
                    "[grow,fill]" +
                    "[grow,fill]" +
                    "[fill]",
                    // rows
                    "[40:40]"));

                //---- textField1 ----
                textField1.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
                contentPanel.add(textField1, "cell 1 2 2 1");
                contentPanel.add(textField2, "cell 1 3 2 1");
                contentPanel.add(textField3, "cell 1 4 2 1");
                contentPanel.add(textField4, "cell 1 5 2 1");
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
                cancelButton.addActionListener(e -> cancel(e));
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel buttonBar;
    private JProgressBar progressBar1;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
