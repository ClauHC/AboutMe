/*
Tarea 1 – Clase Perfil
Define la clase Perfil con las siguientes características:
• name: El nombre del perfil.
• story: La historia personal del perfil.
• hobbies: Colección de hobbies del perfil.
• foods: Colección de comidas favoritas del perfil.
• funFacts: Colección de datos curiosos.
*/

import java.util.Random;

// Atributos (los atributos de una clase deben ser de prefrerencia privados)
public class Perfil {
    //Strings simples
    private String name;
    private String story;
    //Arrays de tipo Strings
    private String[] hobbies;
    private String[] foods;
    private String[] funFacts;


    // Constructor de una persona aburrida.
    //Esto me lo estoy inventando aparte de la orden del ejercicio, pensé que puede haber gente que no tenga hobbies, ni comidas favoritas, ni nada que contar... o les de pereza
    public Perfil(String name) {
        this.name = name;
        // Valores predeterminados
        this.story = new String ("Estoy muy Poff para escribir");
        this.hobbies = new String[] {"No tengo hobbies", "La pereza me puede como para buscarme un hobbie"};
        this.foods = new String[] {"No tengo comida favorita", "Como cualquier cosa"};
        this.funFacts = new String[] {"No tengo nada que contar", "¿La vida tiene cosas interesantes?"};
    }

    // Constructor
    public Perfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

/*
La clase deberá tener métodos para acceder a estos atributos
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
    public String formatearHobbies() {
        String formateado = "Hobbies: ";
        for (String hobby : hobbies) {
            formateado += hobby + " ";
        }
        return formateado;
    }

    /** Métod formatear foods
     * La variable formateado es para agregar la palabra Foods: al inicio y guardar el contenido del array en un solo String
     * se usa un for each para recorrer el array completo
     * @return Retorna el contenido del array en un String ordenado y con espacios entre cada elemento
     * Se nota que es tres cuartos de lo mismo del anterior
     */
    public String formatearFoods() {
        String formateado = "Foods: ";
        for (String food : foods) {
            formateado += food + " ";
        }
        return formateado;
    }

    /** Métod formatear funFacts
     * La variable formateado es para agregar la palabra Foods: al inicio y guardar el contenido del array en un solo String
     * se usa un for each para recorrer el array completo
     * @return Retorna el contenido del array en un String ordenado y con espacios entre cada elemento
     * Más de lo mismo
     */
    public String formatearFunFacts() {
        String formateado = "Fun Facts: ";
        for (String funFact : funFacts) {
            formateado += funFact + " ";
        }
        return formateado;
    }


}



