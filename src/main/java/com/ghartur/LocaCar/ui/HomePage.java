/*
 * Created by JFormDesigner on Tue Nov 01 09:20:07 BRT 2022
 */

package com.ghartur.LocaCar.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

import com.ghartur.LocaCar.controller.RentalController;
import com.ghartur.LocaCar.model.Rental;
import com.ghartur.LocaCar.service.RentalService;
import com.ghartur.LocaCar.service.impl.RentalServiceImpl;
import net.miginfocom.swing.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author unknown
 */
public class HomePage extends JFrame {
    private RentalServiceImpl rentalService;

    public HomePage() {
        initComponents();
        HomePage.setDefaultLookAndFeelDecorated(true);
    }

    private void button1(ActionEvent e) {


    }

    private void button2(ActionEvent e) {
        // TODO add your code here
        Carros carros = new Carros();
        carros.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setMinimumSize(new Dimension(900, 700));
            dialogPane.setPreferredSize(new Dimension(900, 700));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3,align center center",
                    // columns
                    "[80:80,fill]" +
                    "[240:240,fill]" +
                    "[80:80,fill]",
                    // rows
                    "[60]" +
                    "[60]" +
                    "[60]" +
                    "[60]"));

                //---- button2 ----
                button2.setText("CARROS");
                button2.addActionListener(e -> button2(e));
                contentPanel.add(button2, "cell 1 0");

                //---- button3 ----
                button3.setText("CLIENTES");
                contentPanel.add(button3, "cell 1 1");

                //---- button4 ----
                button4.setText("ALUGUEL");
                contentPanel.add(button4, "cell 1 2");

                //---- button5 ----
                button5.setText("RELAT\u00d3RIOS");
                contentPanel.add(button5, "cell 1 3");
            }
            dialogPane.add(contentPanel, BorderLayout.LINE_START);

            //======== scrollPane1 ========
            {
                scrollPane1.setMinimumSize(new Dimension(300, 700));
                scrollPane1.setPreferredSize(new Dimension(300, 700));

                //---- list1 ----
                list1.setBorder(LineBorder.createBlackLineBorder());
                list1.setBackground(new Color(0x999999));
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
    private JPanel contentPanel;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
