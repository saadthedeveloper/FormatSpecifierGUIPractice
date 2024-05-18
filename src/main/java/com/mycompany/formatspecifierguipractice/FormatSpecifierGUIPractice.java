/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formatspecifierguipractice;
import javax.swing.JOptionPane;
/**
 *
 * This is a practice program to understand how String.format method can be used with Dialogboxes
 */
public class FormatSpecifierGUIPractice {

    public static void main(String[] args) {
        Double annualSalary = 60000.0000;
        String output = String.format("Your Annual Salary is $%,.2f", annualSalary);
        
        JOptionPane.showMessageDialog(null, output);
    }
}
