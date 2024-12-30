import java.util.Scanner;;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author root
 */
public class Input {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		System.out.printf("Hello world! %s \n",input);
	}
}

