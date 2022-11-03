/*
 * Created by JFormDesigner on Thu Nov 03 10:22:44 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Especificações extends JDialog {
    public Especificações(Window owner) {
        super(owner);
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
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        buttonBar = new JPanel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "fillx,insets dialog,hidemode 3,align center top",
                    // columns
                    "[80:80,shrink 0,fill]" +
                    "[240:240,shrink 0,center]" +
                    "[80:80,shrink 0,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Especifica\u00e7\u00e3o");
                contentPanel.add(label1, "cell 1 1");
                contentPanel.add(textField1, "cell 1 2,growx");

                //---- label2 ----
                label2.setText("Descri\u00e7\u00e3o");
                contentPanel.add(label2, "cell 1 3");
                contentPanel.add(textField2, "cell 1 4,growx");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }
                contentPanel.add(scrollPane1, "cell 1 6");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "fillx,insets dialog,align center center",
                    // columns
                    "[button,fill]",
                    // rows
                    null));

                //---- button1 ----
                button1.setText("OK");
                buttonBar.add(button1, "cell 0 0");
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
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel buttonBar;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
