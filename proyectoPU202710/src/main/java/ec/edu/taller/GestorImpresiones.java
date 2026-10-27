package ec.edu.taller;

import java.util.*;

/** Completar la logica respetando el contrato descrito en README.md. */
public class GestorImpresiones {
    private Queue<TrabajoImpresion> colaTrabajos;
    private int capacidadMaxima;

    public GestorImpresiones(int capacidadMaxima) {
        // TODO: guardar la capacidad e inicializar una cola con prioridad.
        this.colaTrabajos=new LinkedList<>();
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean registrarTrabajo(TrabajoImpresion trabajo) {
        // TODO: validar, comprobar duplicados y capacidad, y registrar.
        if (trabajo == null){
            return false;
        }

        String codigo = trabajo.getCodigo();
        if (codigo == null || codigo.trim().isEmpty()){
            return false;
        }

        if (colaTrabajos.size() >= capacidadMaxima){
            return false;
        }

        return colaTrabajos.offer(trabajo);
    }

    public boolean existeTrabajo(String codigo) {
        // TODO: buscar por codigo entre los trabajos pendientes.
        if (codigo == null || codigo.trim().isEmpty()){
            return false;
        }

        for (TrabajoImpresion t : colaTrabajos){
            if (t != null && codigo.equals(t.getCodigo())){
                return true;
            }
        }
        return false;
    }

    public TrabajoImpresion consultarSiguienteTrabajo() {
        // TODO: consultar el trabajo de mayor prioridad sin retirarlo.
        return colaTrabajos.peek();
    }

    public TrabajoImpresion procesarSiguienteTrabajo() {
        // TODO: retirar el de mayor prioridad y cambiar su estado a PROCESADO.
        TrabajoImpresion trabajo =colaTrabajos.poll();
        if (trabajo!=null ){
            trabajo.setEstado("PROCESADO");
        }
        return trabajo;
    }

    public int contarTrabajosPendientes() {
        // TODO: devolver la cantidad de trabajos en la cola.
        return colaTrabajos.size();
    }

    public int consultarEspaciosDisponibles() {
        // TODO: devolver capacidad maxima menos trabajos pendientes.
        return capacidadMaxima - colaTrabajos.size();
    }

    public List<TrabajoImpresion> listarTrabajos() {
        // TODO: devolver una lista ordenada por prioridad sin alterar la cola.
        List<TrabajoImpresion> lista = new ArrayList<>(colaTrabajos);
        lista.sort(Comparator.comparingInt(TrabajoImpresion::getPrioridad));
        return lista;
    }
}
