/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visokgod;

import java.util.Scanner;

/**
 *
 * @author Виктория Гек
 */
public class VisokGod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int god;
        Scanner sc = new Scanner(System.in);
        god = sc.nextInt();
        if ((god % 4 == 0) && (god % 100 != 0) ||(god % 400 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // TODO code application logic here
    }

}
