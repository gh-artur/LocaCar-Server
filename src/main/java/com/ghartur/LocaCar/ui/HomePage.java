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

    }

    private void clientesBtn(ActionEvent e) {
        // TODO add your code here
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
    }

    private void aluguelBtn(ActionEvent e) {
        // TODO add your code here
        Aluguel aluguel = new Aluguel();
        aluguel.setVisible(true);
    }

    private void relatoriosBtn(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        carrosBtn = new JButton();
        clientesBtn = new JButton();
        aluguelBtn = new JButton();
        relatoriosBtn = new JButton();
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

                //---- carrosBtn ----
                carrosBtn.setText("CARROS");
                carrosBtn.addActionListener(e -> button2(e));
                contentPanel.add(carrosBtn, "cell 1 0");

                //---- clientesBtn ----
                clientesBtn.setText("CLIENTES");
                clientesBtn.addActionListener(e -> clientesBtn(e));
                contentPanel.add(clientesBtn, "cell 1 1");

                //---- aluguelBtn ----
                aluguelBtn.setText("ALUGUEL");
                aluguelBtn.addActionListener(e -> aluguelBtn(e));
                contentPanel.add(aluguelBtn, "cell 1 2");

                //---- relatoriosBtn ----
                relatoriosBtn.setText("RELAT\u00d3RIOS");
                relatoriosBtn.addActionListener(e -> relatoriosBtn(e));
                contentPanel.add(relatoriosBtn, "cell 1 3");
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
    private JButton carrosBtn;
    private JButton clientesBtn;
    private JButton aluguelBtn;
    private JButton relatoriosBtn;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
