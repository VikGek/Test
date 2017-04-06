/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadrurav;

import java.util.Scanner;

/**
 *
 * @author Виктория Гек
 */
public class KvadrUrav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		int a, b, c, D;
		double x1, x2;
		System.out.println("Введите коэфициенты a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		D = b * b - (4 * a * c);
		if (D > 0) {
			System.out.println("Дискриминант D = " + D + "> 0, уравнение имеет 2 корня");
			x1 = (-b + Math.sqrt(D)) / 2 * a;
			x2 = (-b - Math.sqrt(D)) / 2 * a;
			System.out.print("x1=" + x1 + "; " + "x2=" + x2);
		} else {
			if (D == 0) {
				System.out.println("Дискриминант D = " + D + ", уравнение имеет 1 корень");
				x1 = -b / 2 * a;
				System.out.print("x1=" + x1);
			} else {
				System.out.println("Дискриминант D =" + D + "< 0, уравнение не имеет корней");

			}
		}

	}

}
        // TODO code application logic here
    
    
