package Problema1;

public class Main {
        public static void main(String[] args) {

            VideoJuegos juegoDeportivo = VideoJuegos.DEPORTIVOS;
            VideoJuegos juegoEstrategia = VideoJuegos.ESTRATEGIA;
            VideoJuegos juegoMusical = VideoJuegos.MUSICALES;
            VideoJuegos juegoAventura = VideoJuegos.AVENTURA;
            VideoJuegos juegoSimulacion = VideoJuegos.SIMULACION;

            System.out.println("Nombre del juego deportivo: " + juegoDeportivo.getNombrejuego());
            System.out.println("Cómo jugar al juego deportivo: " + juegoDeportivo.getComojugar());
            System.out.println("Año de creación del juego deportivo: " + juegoDeportivo.getAñodecreacion());
            System.out.println("Posición en el ranking: " + juegoDeportivo.mostrarPosicionRanking());
            System.out.println("Comprar monedas: " + juegoDeportivo.comprarMonedas());

            System.out.println("\nNombre del juego de estrategia: " + juegoEstrategia.getNombrejuego());
            System.out.println("Cómo jugar al juego de estrategia: " + juegoEstrategia.getComojugar());
            System.out.println("Año de creación del juego de estrategia: " + juegoEstrategia.getAñodecreacion());
            System.out.println("Posición en el ranking: " + juegoEstrategia.mostrarPosicionRanking());
            System.out.println("Comprar monedas: " + juegoEstrategia.comprarMonedas());


        }
    }


