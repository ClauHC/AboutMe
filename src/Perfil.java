/*
Tarea 1 – Clase Perfil
Define la clase Perfil con las siguientes características:
• name: El nombre del perfil.
• story: La historia personal del perfil.
• hobbies: Colección de hobbies del perfil.
• foods: Colección de comidas favoritas del perfil.
• funFacts: Colección de datos curiosos.
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

    /*
    // Constructor de una persona aburrida.
    //Esto me lo estoy inventando aparte de la orden del ejercicio, pens&eacute; que puede haber gente que no tenga hobbies, ni comidas favoritas ni nada que contar.
    public Perfil(String name, String story) {
        this.name = name;
        this.story = story;
        // Valores predeterminados
        this.hobbies = new String[] {"No tengo hobbies", "La pereza me puede como para buscarme un hobbie"};
        this.foods = new String[] {"No tengo comida favorita", "Como cualquier cosa"};
        this.funFacts = new String[] {"No tengo nada que contar"};
    }
    */

    // Constructor
    public Perfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

/*
La clase deberá tener métodos para acceder a estos atributos y métodos que devuelvan la información
de manera formateada para que sea fácil de mostrar por consola la información
 */

    // Geetter method == read method. Cuando un métodoo permite obtener el valor de un atributo privado (apunte de clase)
    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public String[] getFoods() {
        return foods;
    }

    public String[] getFunFacts() {
        return funFacts;
    }
}


