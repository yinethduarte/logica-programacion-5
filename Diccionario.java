import java.util.*;
public class Diccionario {
        public static void main(String[] args) {
            HashMap<String, String> diccionario = new HashMap<>();
            diccionario.put("hormiga", "ant");
            diccionario.put("perro", "dog");
            diccionario.put("gato", "cat");
            diccionario.put("carro", "car");
            diccionario.put("calle", "street");
            diccionario.put("agua", "water");
            diccionario.put("fuego", "fire");
            diccionario.put("tierra", "earth");
            diccionario.put("aire", "air");
            diccionario.put("libro", "book");
            diccionario.put("lápiz", "pencil");
            diccionario.put("mesa", "table");
            diccionario.put("silla", "chair");
            diccionario.put("puerta", "door");
            diccionario.put("ventana", "window");
            diccionario.put("sol", "sun");
            diccionario.put("luna", "moon");
            diccionario.put("estrella", "star");
            diccionario.put("mar", "sea");
            diccionario.put("montaña", "mountain");

            List<String> palabras = new ArrayList<>(diccionario.keySet());
            Collections.shuffle(palabras);
            List<String> palabrasSeleccionadas = palabras.subList(0, 5);


            Scanner scanner = new Scanner(System.in);
            int correctas = 0;
            int incorrectas = 0;

            for (String palabra : palabrasSeleccionadas) {
                System.out.println("Traduce al inglés la palabra: " + palabra);
                String respuesta = scanner.nextLine().trim().toLowerCase();

                if (diccionario.get(palabra).equals(respuesta)) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }

            System.out.println("Respuestas correctas: " + correctas);
            System.out.println("Respuestas incorrectas: " + incorrectas);


            scanner.close();
        }
    }

