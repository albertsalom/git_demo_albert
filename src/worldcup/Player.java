/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldcup;

/**
 * @author AdministradorCIFO
 *         This the class to define a player
 */
public class Player extends Person {
        String position;

        public void passBall() {
                System.out.println("plassing to Vicente :)");
        }
        public boolean injuried(boolean injury) {
        	if (injury==true) {
				return true;
			}else {
				return false;
			}
        }
}
