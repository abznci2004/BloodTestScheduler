/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.BloodTestScheduler to edit this template
 */
package BloodTestScheduler;

import javax.swing.SwingUtilities;

public class BloodTestScheduler {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BloodTestSchedulerGUI gui = new BloodTestSchedulerGUI();
            gui.setVisible(true);
        });
    }
}