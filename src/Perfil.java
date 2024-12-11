/*
Tarea 1 – Clase Perfil
Define la clase Perfil con las siguientes características:
• name: El nombre del perfil.
• story: La historia personal del perfil.
• hobbies: Colección de hobbies del perfil.
• foods: Colección de comidas favoritas del perfil.
• funFacts: Colección de datos curiosos.
La clase deberá tener métodos para acceder a estos atributos y métodos que devuelvan la información
de manera formateada para que sea fácil de mostrar por consola la información
 */

// Atributos (los atributos de una clase deben ser de prefrerencia privados)
public class Perfil {
    //Strings simples
    private String name;
    private String story;
    //Arrays de tipo Strings
    private String[] hobbies;
    private String[] foods;
    private String[] funFacts;

    // Constructor
    public Perfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }
}


