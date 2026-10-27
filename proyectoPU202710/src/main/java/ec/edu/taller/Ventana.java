package ec.edu.taller;

import javax.swing.*;

public class Ventana {
    private JTabbedPane tabbedPane1;
    private JTextField txtIngresarCodigo;
    private JComboBox cmbSolicitante;
    private JTextField txtIngresarDocumento;
    private JSpinner spnPrioridad;
    private JButton btnRegistrar;
    private JButton btnLimpiar;
    private JLabel lblCodigo;
    private JTextArea txtCodigo;
    private JTextArea txtSolicitante;
    private JTextArea txtDocumento;
    private JTextArea txtPrioridad;
    private JTextArea txtEstado;
    private JTextArea txtTPendientes;
    private JTextArea txtPendientes;
    private JTextArea txtDisponibles;
    private JTextArea txtCapacidad;
    private JLabel lblSolicitante;
    private JLabel lblDocumento;
    private JLabel lblPrioridad;
    private JLabel lblEstado;
    private JLabel lblTPendientes;
    private JLabel lblPendientes;
    private JLabel lblDisponibles;
    private JLabel lblCapacidad;
    private JButton btnProcesar;
    private JButton btnListar;
    private JButton btnConsultar;

   private final GestorImpresiones gestor;
   private TrabajoImpresion trabajoActual;

    public Ventana(GestorImpresiones gestor) {
        this.gestor = gestor;

        cargarDatosIniciales();

    }

    private void configurarComponentes(){
        cmbSolicitante.addItem("ESTUDIANTE");
        cmbSolicitante.addItem("DOCENTE");
        cmbSolicitante.addItem("ADMINISTRATIVO");
    }

    private void cargarDatosIniciales(){
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-01", "DOCENTE", "Examen", 1));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-02", "ADMINISTRATIVO", "Acta de grado", 2));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-03", "ESTUDIANTE", "Tesis", 5));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-04", "DOCENTE", "Laboratorio", 3));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-05", "ADMINISTRATIVO", "Matricula", 4));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-06", "ESTUDIANTE", "Informe", 2));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-07", "DOCENTE", "Rubrica", 2));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-08", "ADMINISTRATIVO", "Presupuesto", 3));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-09", "ESTUDIANTE", "Articulo", 1));
        gestor.registrarTrabajo(new TrabajoImpresion("IMP-10", "DOCENTE", "Material de clase", 4));
    }


}
