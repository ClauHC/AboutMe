//M03-UF2
//Ejercicio 1 About Me
//Claudia Hernandez Colomer
//Fp DAW La Salle
//Profesora Marta Bella
//diciembre 2024

/*
Tarea 1 – Clase Perfil
Define la clase Perfil con las siguientes características:
• name: El nombre del perfil.
• story: La historia personal del perfil.
• hobbies: Colección de hobbies del perfil.
• foods: Colección de comidas favoritas del perfil.
• funFacts: Colección de datos curiosos.
*/

import java.util.ArrayList;
import java.util.Random;


// Clase Perfil
public class Perfil {

    //Atributos (los atributos de una clase deben ser de prefrerencia privados)
    //Strings simples
    private String name;
    private String story;
    //Arrays List de tipo Strings
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;


    // Constructor de una persona aburrida.
    //Esto me lo estoy inventando aparte de la orden del ejercicio, pensé que puede haber gente que no tenga hobbies, ni comidas favoritas, ni nada que contar... o les de pereza
    public Perfil(String name) {
        this.name = name;

        // Valores predeterminados
        this.story = ("Estoy muy Poff para escribir");

        this.hobbies = new ArrayList<>();
        this.hobbies.add ("No tengo hobbies");
        this.hobbies.add ("La pereza me puede como para buscarme un hobbie");

        this.foods = new ArrayList<>();
        this.foods.add ("No tengo comida favorita");
        this.foods.add ("Como cualquier cosa");

        this.funFacts = new ArrayList<>();
        this.funFacts.add ("No tengo nada que contar");
        this.funFacts.add ("¿La vida tiene cosas interesantes?");
    }

    // Constructor
    public Perfil(String name, String story, ArrayList<String> hobbies, ArrayList<String> foods, ArrayList<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    /*
    La clase deberá tener métodos para acceder a estos atributos
    */

    // Geetter method == read method. Cuando un métodoo permite obtener el valor de un atributo privado. Lee y devuelve (apunte de clase)
    // Modificados para que impriman por pantalla en lugar de hacer return


    public String getName() {
        return name;
    }

    public void printStory() {
        System.out.println("Sobre mi : " + story + "\n");
    }

    /*
    y métodos que devuelvan la información de manera formateada para que sea fácil de mostrar por consola la información
    Nota: Marta aquí casi la lio. Para mi formatear es dejar en blanco (como cuando formateas un disco duro)
    lo cual no me cuadraba con "que sea fácil de mostrar por consola la información".
    Nada que si no pregunto que había que hacer aquí te hubiera entregado un churro XD
    */

    /** Métod formatear hobbies
     * La variable formateado es para agregar la frase "Mis hobbies son: " al inicio e ir agregandole elementos del array list
     * se usa un for each para recorrer el array list completo
     * No necesita parametros de entrada
     * Imprime el array list ordenado y con saltos de linea por cada String que contiene
     */
    public void formatearHobbies() {
        String formateado = "Mis hobbies son:\n";
        for (String hobby : hobbies) {
            formateado += hobby + "\n";
        }
        System.out.println(formateado);
    }

    /** Métod formatear foods
     * La variable formateado es para agregar la frase "Mis comidas favoritas son: " al inicio e ir agregandole elementos del array list
     * se usa un for each para recorrer el array list completo
     * No necesita parametros de entrada
     * Imprime el array list ordenado y con saltos de linea por cada String que contiene
     */
    public void formatearFoods() {
        String formateado = "Mis comidas favoritas son:\n";
        for (String food : foods) {
            formateado += food + "\n";
        }
        System.out.println(formateado);
    }

    /** Métod randomFunFacts
     * La variable formateado es para agregar la frase ""Te cuento una cosa curiosa: " al inicio e ir agregandole elementos del array list
     * se crea un random para coger un elemento del array list al azar
     * No necesita parametros de entrada
     * @return retorna un string del array list elejido de forma aleatoria
     */
    public String randomFunFacts() {
        String formateado = "Te cuento una cosa curiosa:\n";
        int indice = new Random(). nextInt(funFacts.size());
        formateado += funFacts.get(indice) + "\n";
        return formateado;
    }
}



