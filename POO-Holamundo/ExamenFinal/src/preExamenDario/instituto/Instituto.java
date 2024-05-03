package preExamenDario.instituto;

import preExamenDario.instituto.ofertasAcademicas.Curso;
import preExamenDario.instituto.ofertasAcademicas.OfertaAcademica;
import preExamenDario.instituto.ofertasAcademicas.fabrica.ErrorEnCreacionDeOfertaAcademica;
import preExamenDario.instituto.ofertasAcademicas.fabrica.FabricaDeOfertasAcademicas;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(String tipo, String nombre, String descripcion, int cargaHorariaMensual, double valorHora, List<Curso> cursos) {
        try {
            OfertaAcademica nuevaOfertaAcademica = FabricaDeOfertasAcademicas.crear(tipo, nombre, descripcion, cargaHorariaMensual, valorHora, cursos);
            this.ofertasAcademicas.add(nuevaOfertaAcademica);
        } catch(ErrorEnCreacionDeOfertaAcademica e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void reporte() {
        System.out.println("----Reporte----");
        this.ofertasAcademicas.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("----" + this.nombre + "----");
    }
}
