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

// Atributos (los atributos de una clase deben ser de prefrerencia privados)
public class Perfil {
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
    public void printName() {
        System.out.println(name);
    }

    public void printStory() {
        System.out.println(story);
    }

/*
y métodos que devuelvan la información de manera formateada para que sea fácil de mostrar por consola la información
Nota: Marta aquí casi la lio. Para mi formatear es dejar en blanco (como cuando formateas un disco duro)
lo cual no me cuadraba con "que sea fácil de mostrar por consola la información".
Nada que si no pregunto que había que hacer aquí te hubiera entregado un churro XD
*/

    /** Métod formatear hobbies
     * La variable formateado es para agregar la palabra Hobbies: al inicio y guardar el contenido del array en un solo String
     * se usa un for each para recorrer el array completo
     * @return Retorna el contenido del array en un String ordenado y con espacios entre cada elemento
     */
    public void formatearHobbies() {
        String result = "Hobbies: ";
        for (String hobby : hobbies) {
            result += hobby + " ";
        }
        System.out.println(result);
    }

    /*
    public String formatearHobbies() {
        return "Hobbies: " + String.join(", ", hobbies);
    }
     */

    /** Métod formatear foods
     * La variable formateado es para agregar la palabra Foods: al inicio y guardar el contenido del array en un solo String
     * se usa un for each para recorrer el array completo
     * @return Retorna el contenido del array en un String ordenado y con espacios entre cada elemento
     * Se nota que es tres cuartos de lo mismo del anterior
     */
    public void formatearFoods() {
        String result = "Foods: ";
        for (String food : foods) {
            result += food + " ";
        }
        System.out.println(result);
    }

    /*
    public String formatearFoods() {
        return "Foods: " + String.join(", ", foods);
    }
     */

    /** Métod formatear funFacts
     * La variable formateado es para agregar la palabra Foods: al inicio y guardar el contenido del array en un solo String
     * se usa un for each para recorrer el array completo
     * @return Retorna el contenido del array en un String ordenado y con espacios entre cada elemento
     * Más de lo mismo
     */
    public void formatearFunFacts() {
        String result = "Fun Facts: ";
        for (String funFact : funFacts) {
            result += funFact + " ";
        }
        System.out.println(result);
    }

    /*
    public String formatearFunFacts() {
        return "Fun Facts: " + String.join(", ", funFacts);
    }
     */
}



