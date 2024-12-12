//M03-UF2
//Ejercicio 1 About Me
//Claudia Hernandez Colomer
//Fp DAW La Salle
//Profesora Marta Bella
//diciembre 2024


import java.util.ArrayList;

public class Main {

    //métodoo principal main
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    //métodoo que llama al main. Aqui va lo que iría en el Main. Cambio necesario para poder usar programacion modular
    public void inicio(){

        // Persona aburrida
        String name1 = "Lily";

        // Objeto Perfil persona aburrida
        Perfil Perfil1 = new Perfil (name1);
        Perfil1.printName();
        Perfil1.printStory();
        Perfil1.formatearHobbies();


        // Información de mi perfil
        String name2 = "Claudia";
        String story = "💾🎨 Soy Diseñadora de Comunicación Visual y estudiante de DAW.";

        String hobbie1 = "📚 Leer. Especialmente fantasía y ciencia ficción.";
        String hobbie2 = "🎨 Dibujar, soy graduada de arte y gráfico así que dibujo todo el tiempo.";
        String hobbie3 = "🎮 Jugar videojuegos, me gustan los RPG de plataforma abierta (unque casi nunca tengo tiempo 😭).";

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add(hobbie1);
        hobbies.add(hobbie2);
        hobbies.add(hobbie3);

        String food1 = "🍖🌽🥔 Barbacoa, todo lo que se haga a las brazas.";
        String food2 = "╰(*°▽°*)╯ la comida criolla cubana.";
        String food3 = "🍣 Me encanta el Sushi, el Ramen y los Dumplins.";

        ArrayList<String> foods = new ArrayList<>();
        foods.add(food1);
        foods.add(food2);
        foods.add(food3);

        String funFact1 = "📚 Jorge Martin nombró a Brandon Sanderson como su heredero para que continue su obra si el muere y es el único al que ha contado el final de Juego de Tronos.";
        String funFact2 = "🐣 Un pollito y un huevo pueden ser la causa del primer Hellow World de la historia.";
        String funFact3 = "😈 Después de muchos años de especulación Ryan Reynolds dejó escapar por accidente que fué el quien filtró las tomas de Deadpool que volvieron locos a los fans e hicieron imposible que cancelaran la película.";

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add(funFact1);
        funFacts.add(funFact2);
        funFacts.add(funFact3);


        // Objeto Perfil yo
        Perfil Perfil2 = new Perfil (name2, story, hobbies, foods, funFacts);
        Perfil2.printName();
        Perfil2.printStory();
        Perfil2.formatearHobbies();
    }
}