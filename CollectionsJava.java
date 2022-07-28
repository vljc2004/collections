public class CollectionsJava {

    private  Persona persona1;
    private  Persona persona2;
    private  Persona persona3;
    private  Persona persona4;

    public static void main(String[] args) {
        // TODO: IMPLEMENT THE LOGIC
        eliminarUsuarioDuplicados();
        ordenarMayorMenorPorEdad();
        ordenarMenorMayorPorEdad();
        buscarPersonaPorNombre();
        removerPersonaMayorA22anios();
        agregarNuevaPersonayOrdenarPorNOmbre();
        crearMapaConLlaveNombreyMostrarEquipoFavorito();
        crearMapaConLlaveNombreyMostrarEquipoFavoritoOrdenado();
    }

    private static void ordenarMayorMenorPorEdad() {
        // TODO: Leer de sort, comparable y comparator
    }

    private static void ordenarMenorMayorPorEdad() {
        // TODO: Leer de sort, comparable y comparator
    }

    private static void buscarPersonaPorNombre() {
    }

    private static void removerPersonaMayorA22anios() {
    }

    private static void crearMapaConLlaveNombreyMostrarEquipoFavoritoOrdenado() {
        // TODO: Leer de TreeMap
    }

    private static void agregarNuevaPersonayOrdenarPorNOmbre() {
    }

    private static void crearMapaConLlaveNombreyMostrarEquipoFavorito() {
        // TODO: Leer de Map
    }

    private static void eliminarUsuarioDuplicados(){

        //TODO: OBTENER UNA LISTA ELIMINANDO LOS EQUIPOS REPETIDOS (equipoFavorito). TIP: SET

    }


    private void populatePersona(){

        persona1 = new Persona("Julio","Vasquez","Lagunes",39,"Tiburones Rojos");
        persona2 = new Persona("Joel","Padua","Rey",22,"Tiburones Rojos");
        persona3 = new Persona("Miguel","Vasquez","Lagunes",12,"Tigres");
        persona4 = new Persona("Francisco","Vasquez","Lagunes",50,"Rayados");
    }


}
