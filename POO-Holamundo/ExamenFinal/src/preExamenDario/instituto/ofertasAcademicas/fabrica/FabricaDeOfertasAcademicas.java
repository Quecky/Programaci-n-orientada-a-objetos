package preExamenDario.instituto.ofertasAcademicas.fabrica;

import preExamenDario.instituto.ofertasAcademicas.Curso;
import preExamenDario.instituto.ofertasAcademicas.OfertaAcademica;
import preExamenDario.instituto.ofertasAcademicas.ProgramaIntensivo;

import java.util.List;

public class FabricaDeOfertasAcademicas {
    public static String CODIGO_CURSO = "curso";
    public static String CODIGO_PROGRAMA_INTENSIVO = "programa";

    public static OfertaAcademica crear(String tipo, String nombre, String descripcion, int cargaHorariaMensual, double valorHora, List<Curso> cursos) throws ErrorEnCreacionDeOfertaAcademica {
        if (tipo.equals(CODIGO_CURSO)) {
            return new Curso(nombre, descripcion, cargaHorariaMensual, valorHora);
        } else if (tipo.equals(CODIGO_PROGRAMA_INTENSIVO)) {
            return new ProgramaIntensivo(nombre, descripcion, cargaHorariaMensual, valorHora, cursos);
        }
        throw new ErrorEnCreacionDeOfertaAcademica();
    }
}
