/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartphone.store;

import Connection.DBConnection;
import Frame.ProductFrame;

/**
 *
 * @author hp
 */
public class SmartphoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection con = new DBConnection();
                System.out.println(con.open());

        ProductFrame frame1 = new ProductFrame();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
    
}
