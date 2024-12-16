package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("OLAxd");
        System.out.println("new hellogit");
        System.out.println("prova dos");
        System.out.println("LOLOLOLOLO");
    // HEAD
        System.out.println("Nuevo commit en main despues de rama");
        System.out.println("Otro commit en main");
//=======
//<<<<<<< Updated upstream
        System.out.println("nuevo commit desde la nuev arama login ");
//=======
    // HEAD lo que hizo main
        System.out.println("Nuevo commit en main despues de rama");
        System.out.println("Otro commit en main");
//======= o
        System.out.println("nuevo commit desde la nuev arama login ");
//>>>>>>> login lo que hizo login

        System.out.println("probando slashxd");
//>>>>>>> Stashed changes
//>>>>>>> login

        System.out.println("Metiendo el proyecto a github");
        System.out.println("ya esta en github, ahora pruebo actualizarlo");
//<<<<<<< HEAD
        System.out.println("prueba conflicto desde local");
//=======
        System.out.println("Creando un nuevo mensaje desde la pagina de github");
//>>>>>>> 05cfdeec22e19aa99dd31249828c015ff1707196
        System.out.println("Nueva prueba con el git pull");
    }
}
