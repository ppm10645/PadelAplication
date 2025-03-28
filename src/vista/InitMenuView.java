/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.InitMenuController;
import java.util.Scanner;

/**
 *
 * @author joao.pedro.pereira
 */
public class InitMenuView {

    private InitMenuController controller;
    private Scanner scanner;

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showInvalidUser() {
        System.out.println("Os datos non son correctos");
    }

    public boolean showLoginMenu() {
        System.out.println("Introduzca o id de usuario para iniciar sesión, deixe baleiro para sair da aplicación");
        
        String loginpasswrd;
        String loginid = scanner.nextLine();
        
        if(loginid.isEmpty()){
            return true;
        } else {
            System.out.println("Introduzca o contrasinal");
            loginpasswrd = scanner.nextLine();
            controller.login(loginid, loginpasswrd);
        }
        return false;  
    }
}
