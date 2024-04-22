package com.miempresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        String[] nombre = new String[]{"Mirador", "Huentitan", "Zoológico", "Independencia Norte", "San Patricio", "Igualdad", "Monumental", "Monte Olivette",
                "Circunvalacion", "Facultad de Medicina", "Juan Alvarez", "Alameda", "San Juan De Dios", "Bicentenario", "Niños Heroes",
                "Agua Azul", "Cipres", "Heroes de Nacozari", "Lazaro Cardenas", "El Dean", "Zona Industrial", "Lopez de Legaspi", "Clemente Orozco",
                "Artes Plasticas", "Escultura", "Fray Angelico", "Basilica", "Sanatorio", "Colegio Victoria", "Plaza Patria", "Terranova", "Colon",
                "Lienzo Charro", "Mezquitan", "Panteon De Belen", "Procuraduria", "Facultad de Medicina", "Obrero", "Talpita", "El Jaraz", "Plutarco Elías Calles",
                "Haciendas", "Oblatos", "Bethel", "Periferico Norte", "Dermatologico", "Atemajac", "Division del Norte", "Avila Camacho", "Mezquitan", "Refugio",
                "Juarez", "Mexicaltzingo", "Washington", "Santa Filomena", "Unidad Deportiva", "Urdaneta", "18 De Marzo", "Isla Raza", "Patria Sur", "España",
                "Tesoro", "Periferico Sur", "Central Sur", "Vallarta", "Jardines De La Paz", "Universidad Panamericana", "Juan Palomar", "Seminario",
                "Camara De Comercio", "Minerva", "Centro Magno", "Americas", "Chapultepec", "Paraninfo", "Juarez", "Plaza Universidad", "San Juan De Dios",
                "Belisario Dominguez", "Oblatos", "Cristobal De Oñate", "San Andres", "San Jacinto", "La Aurora", "Tetlan",
                "San Isidro", "CUCEA", "Parque", "Seattle", "Zoquipan", "Country", "Hospital General", "Plaza Patria", "Colomos", "Plaza Pabellon",
                "San Javier", "3 de Marzo", "Jardinez Universidad", "Ferrocarril", "Seminario", "La Gran Plaza", "San Ignacio", "Estampida", "Chapalita",
                "Abastos", "Mandarina", "Ruiseñor", "Unidad Deportiva", "Plaza las Torres", "Cristo Rey", "El Dean", "Nogalera", "Alamo", "Textiles",
                "Tabachines", "Centro Cultural", "Zoquipan", "Patria Sur", "Division del Norte", "Lomas", "Plan de San Luis", "Colon", "Jose Maria Vigil",
                "Zarco", "Av. Mexico", "Ladron de Guevara", "Americas", "Lafayette", "Chapultepec", "Monumento", "Santa Eduwiges", "Dia", "Abastos",
                "Parque de las Estrellas", "Expo", "Plaza del Sol",
                "Arco del Triunfo", "Belenes", "Mercado del Mar","aapopan Centro", "Plaza Patria", "Circunvalacion", "Division del Norte", "Normal",
                "Santuario", "San Juan De Dios", "Independencia Sur", "Plaza de la Bandera", "CUCEI", "Plaza Revolucion", "Rio Nilo", "Tlaquepaque",
                "Nodo Revolucion", "Central Camionera",
                "Parque Metropolitano", "La Estancia", "Guadalupe", "UNIVA", "Juan Diego", "Estampida", "Inglaterra", "Embajada", "Monumento",
                "Argentina", "Francia", "Madrid", "Washington", "Carteros", "Agua Azul", "Gonzales Gallo", "CUCEI", "Medrano", "San Rafael",
                "Poetas",
                "Barranca de Huentitan", "Zoologico de Guadalajara", "Independencia Norte", "Lomas del Paraiso", "Rancho Nuevo", "La Experiencia",
                "El Batan", "Periferico Norte", "La Cantera", "Tabachines", "Constitucion", "CCU", "San Isidro", "Belenes", "Tuzania", "Santa Margarita",
                "Acueducto", "5 de Mayo", "San Juan De Ocotan", "Vallarta", "Estadio Chivaa", "Ciudad Judicial", "Ciudad Granja", "Parque Metropolitano",
                "Chapalita Inn", "El Colli", "Felipe Ruvalcaba", "Miramar", "Mariano Otero", "El Briseño", "Agricola", "Lopez Mateos", "ITESO",
                "Terminal de Autobuses", "Periferico Sur", "San Sebastianito", "8 de Julio", "Toluquilla", "Adolf Horn", "Artesanos", "Las Piñatas", "Carretera a Chapala",
                "Circuito Metropolitano", "Escobedo", "Cotijo", "Lomas Del Sur", "Carretera a Tlajomulco", "Concepcion", "Adolf Horn", "Periferico", "Fray Angelico"};



        int[] lineas = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                6, 6, 6, 6, 6, 6 ,6, 6, 6, 6, 6, 6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6,
                7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
                8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 ,9 ,9 ,9 ,9 ,9 ,9 ,9 ,9 ,9 ,9, 9, 9 ,9 ,9 ,9, 9, 9, 9,
                10, 10, 10, 10 , 10, 10, 10 , 10, 10};

        int[] ID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 ,14, 15, 16, 17, 18, 19, 20, 21, 22,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
                1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean[] isNode = new boolean[]{false, false, false, true, false, false, false, false, false, true, false ,false, true, false, false, true, false, false, false, true, false,false,false, false, false,true,
                false, false, false, true, false, true, false, true, false, false, true, false, false, false, false, false, false, false,
                true, false, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false,true,
                false, true, false, false, false, true, false, false, false, true, false, false, true, false, true, false, false, false, false, false, false, false,
                true, false, false, false, true, false, false, true, false, false, false, false, false, false, true, false, false, true, false, true, false, false,true, false, false, true, false, false, false,
                true, false, true, false, true, false, false, true, false, false, false, false, true, false, false, true, false, false, true, false, false, false,
                false, true, false, false, true, false, true, false, false, true, false, false, true, false, false, false, false, false,
                true, false, false, false, false, true, false, false, true, false, false, false,true, false, true, false, true, false, false, false,
                false, false, true, false, false,false, false, true, false, true, false, false, true, true, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false,false, true, false, false, false,true, false, false, false,
                false, false, false, false, false, false, true, false, true};


        String[] nombreNodos = new String[]{"San Isidro", "Belenes", "Tabachines",
                "Periferico Norte", "Independencia Norte", "Zoquipan",
                "Division del Norte", "Vallarta", "Colon",
                "Mezquitan",  "Facultad de Medicina",
                "Seminario", "Americas", "Juarez",
                "San Juan De Dios", "Washington", "Agua Azul", "Parque Metropolitano", "Estampida", "Monumento", "CUCEI",
                "Unidad Deportiva", "El Dean", "Abastos", "Fray Angelico", "Periferico Sur", "Adolf Horn", "Plaza Patria"};

        int[] IDNodos = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};


        final int METRO_CAPACIDAD = 225;
        ArrayList<Estaciones> metro = new ArrayList<>();
        Estaciones[] nodosArray = new Estaciones[28];
        final int NODOS_CAPCACIDAD = 28;
        ArrayList<Estaciones> nodos = new ArrayList<>();
        ArrayList<Estaciones> nodosParaMatriz = new ArrayList<>();
        for (int i = 0; i < METRO_CAPACIDAD ; i++) {
            Estaciones estacion = new Estaciones(nombre[i], ID[i], lineas[i], isNode[i]);
            metro.add(estacion);
            if (metro.get(i).isNode()) {
                nodos.add(estacion);
            }
        }

        for (int i = 0; i < NODOS_CAPCACIDAD; i++) {
            nodosArray[i] = new Estaciones(nombreNodos[i], IDNodos[i], -1,true);
            nodosParaMatriz.add(nodosArray[i]);
        }

        for(Estaciones estacion:
                metro) {
            System.out.println(estacion);
        }

        System.out.println("-----NODOS-------");
        for (Estaciones nodo:
                nodosArray){
            System.out.println(nodo);
        }


        int[][] matM = {{0,1,3,99,99,4,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99},//0  san isidro LISTO
                {1,0,99,99,99,99,99,6,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,3},//1  belenes  LISTO
                {3,99,0,2,99,2,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99},//2 tabachines  LISTO
                {99,99,2,0,5,99,3,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99},//3 peri norte  LISTO
                {99,99,99,5,0,99,99,99,99,99,6,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99},//4 inependencia norte LISTO
                {4,99,2,99,99,0,2,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,3},//5 zoquipan LISTO
                {99,99,99,3,99,2,0,99,3,2,99,99,99,99,3,99,99,99,99,99,99,99,99,99,99,99,99,2},//6 division del norte LISTO
                {99,6,99,99,99,99,99,0,99,99,99,4,99,99,99,99,99,4,99,99,99,99,99,99,99,99,99,99},//7 vallarta LISTO
                {99,99,99,99,99,99,3,99,0,2,99,99,5,99,99,99,99,99,99,99,99,99,99,99,99,99,99,2},//8 colon LISTO
                {99,99,99,99,99,99,2,99,2,0,3,99,99,2,99,99,99,99,99,99,99,99,99,99,99,99,99,99},//9 mezquitan LISTO
                {99,99,99,99,6,99,99,99,99,3,0,99,99,99,3,99,99,99,99,99,99,99,99,99,99,99,99,99},//10 facultad de medicina LISTO
                {99,99,99,99,99,99,99,4,99,99,99,0,4,99,99,99,99,99,3,99,99,99,99,99,99,99,99,7},//11 seminario  LISTO
                {99,99,99,99,99,99,99,99,5,99,99,4,0,3,99,99,99,99,99,3,99,99,99,99,99,99,99,99},//12 americas  LISTO
                {99,99,99,99,99,99,99,99,99,2,99,99,3,0,2,2,99,99,99,99,99,99,99,99,99,99,99,99},//13 juarez LISTO
                {99,99,99,99,99,99,3,99,99,99,3,99,99,2,0,99,3,99,99,99,3,99,99,99,99,99,99,99},//14 san jhonny LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,2,99,0,2,99,99,4,99,2,99,99,99,99,99,99},//15 washington LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,3,2,0,99,99,99,2,99,4,99,99,99,99,99},//16 agua azul LISTO
                {99,99,99,99,99,99,99,4,99,99,99,99,99,99,99,99,99,0,5,99,99,99,99,99,99,11,99,99},//17 parque metro LISTO
                {99,99,99,99,99,99,99,99,99,99,99,3,99,99,99,99,99,5,0,3,99,99,99,2,99,99,99,99},//18 estampida LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,3,99,99,4,99,99,3,0,99,99,99,3,99,99,99,99},//19 monumento LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,3,99,2,99,99,99,0,99,99,99,99,99,99,99},//20 CUCEI LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,2,99,99,99,99,99,0,3,3,99,7,99,99},//21 Unidad Derportiva LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,4,99,99,99,99,3,0,99,6,99,99,99},//22 El Dean LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,2,3,99,3,99,0,99,99,99,99},//23 Abastos LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,6,99,0,99,2,99},//24 Fray Angelico LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,11,99,99,99,7,99,99,99,0,4,99},//25 Peri Sur LISTO
                {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,2,4,0,99},//26 adolf horn LISTO
                {99,3,99,99,99,3,2,99,2,99,99,7,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,0}};//27 plaza patria   LISTO


        int[][] matT = new int[n][n];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matT[i][j] = Integer.MAX_VALUE;  // Inicialización con valor infinito
    }
}

          
        int k,i,j,n = matM.length;
        for(k=0;k<n;k++){  //Algoritmo de Floyd
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(matM[i][k]+matM[k][j] < matM[i][j]){
                        matM[i][j]=matM[i][k]+matM[k][j];
                        matT[i][j]=k;
                    }
                }
            }
        }

//        System.out.println("MATRIZ M");
//        System.out.println("[00]\t[01]\t[02]\t[03]\t[04]\t[05]\t[06]\t[07]\t[08]\t[09]\t[10]\t[11]\t[12]\t[13]\t[14]\t" +
//                "[15]\t[16]\t[17]\t[18]\t[19]\t[20]\t[21]\t[22]\t[23]\t[24]\t[25]\t[26]\t[27]");
//        for(i=0;i<n;i++){
//            for(j=0;j<n;j++)
//                System.out.print(matM[i][j]+"\t");
//            System.out.println();
//        }
//        System.out.println("\n\n");
//        System.out.println("MATRIZ T");
//        System.out.println("   [00]\t  [01]\t[02]\t[03]\t[04]\t[05]\t[06]\t[07]\t[08]\t[09]\t[10]\t[11]\t[12]\t[13]\t[14]\t" +
//                "[15]\t[16]\t[17]\t[18]\t[19]\t[20]\t[21]\t[22]\t[23]\t[24]\t[25]\t[26]\t[27]");
//        for(i=0;i<n;i++){
//            //System.out.print("["+i+"]");
//            for(j=0;j<n;j++)
//                System.out.print(matT[i][j]+"\t");
//            System.out.println();
//        }

        ruta(metro, nodos, nodosParaMatriz, matT);

    }

    static int linearSearchMain(ArrayList<Estaciones> metro, String nombre) {
        int resultados = Estaciones.linearSearch( metro, nombre);
        if (resultados == -1)
            System.out.println("Estacion Incorrecta cheque la lista de estasciones validas o cheque la orografia!");
        return resultados;
    }

   static void ruta(ArrayList<Estaciones> metro, ArrayList<Estaciones> nodos, ArrayList<Estaciones> nodosParaMatriz, int[][] matT){
       String opcion;
       String opcionRuta;
       int inicialInter, finalIndInter;
       do {
           int inicial;
           int finalInd;
           do {
               System.out.println("Donde te encuentras?");
               String estacionInicial = scanner.nextLine();
               inicial = linearSearchMain(metro, estacionInicial);
           } while (inicial == -1);
           do {
               System.out.println("A donde quieres ir?");
               String estacionFinal = scanner.nextLine();
               finalInd = linearSearchMain(metro, estacionFinal);
           } while (finalInd == -1);
           System.out.println("Buscas trazladarte por una ruta intermedia? Escribe \"si\" para ruta intermedia, cualquier otra frase para seguir.");
           opcionRuta = scanner.nextLine();
           if (opcionRuta.equals("si")) {
               do {
                   System.out.println("Estacion inicial de ruta intermedia");
                   String estacionInicialInter = scanner.nextLine();
                   inicialInter = linearSearchMain(metro, estacionInicialInter);
               } while (inicialInter == -1);
               do {
                   System.out.println("Estacion final de ruta intermedia");
                   String estacionFinalInter = scanner.nextLine();
                   finalIndInter = linearSearchMain(metro, estacionFinalInter);
               } while (finalIndInter == -1);
               System.out.println("Ruta Final de Inicial a primera intermedia");
               Estaciones.buscarRutaLogica(matT, inicial, inicialInter, metro, nodos, nodosParaMatriz);
               System.out.println("Ruta Final de final intermedia a destino");
               Estaciones.buscarRutaLogica(matT, finalIndInter, finalInd, metro, nodos, nodosParaMatriz);
           } else {
               Estaciones.buscarRutaLogica(matT, inicial, finalInd, metro, nodos, nodosParaMatriz);
               System.out.println("\nPreciona cero para buscar otra ruta o cualquier otra tecla para salir");
           }
           opcion = scanner.nextLine();
       }while(opcion.equals("0"));
   }
}
