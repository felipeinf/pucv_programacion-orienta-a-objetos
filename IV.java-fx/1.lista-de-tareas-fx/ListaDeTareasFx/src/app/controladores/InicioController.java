package app.controladores;

import app.modelos.ColeccionTareas;
import app.modelos.Tarea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Felipe Concha Almedida
 */
public class InicioController implements Initializable {
    private ColeccionTareas coleccionTareas;
    
    @FXML
    private ListView<Tarea> listViewTareas;
    @FXML
    private TextField textFieldTarea;
    @FXML
    private Button btnAgregarTarea;
    @FXML
    private Button btnElminarTarea;
    @FXML
    private Button btnModificarTarea;
    @FXML
    private Button btnGuardarTarea;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        coleccionTareas = new ColeccionTareas();
        listViewTareas.setItems(FXCollections.observableArrayList(coleccionTareas.getTareas()));
        btnGuardarTarea.setVisible(false);
    }    

    @FXML
    private void agregarTarea(ActionEvent event) {
        String contenido = textFieldTarea.getText();
        Tarea nuevaTarea = new Tarea(contenido);
        coleccionTareas.agregarTarea(nuevaTarea);
        listViewTareas.setItems(FXCollections.observableArrayList(coleccionTareas.getTareas()));
        textFieldTarea.clear();
    }

    @FXML
    private void eliminarTarea(ActionEvent event) {
        Tarea tareaSeleccionada = listViewTareas.getSelectionModel().getSelectedItem();
        coleccionTareas.eliminarTarea(tareaSeleccionada.getId());
        listViewTareas.setItems(FXCollections.observableArrayList(coleccionTareas.getTareas()));
    }

    @FXML
    private void modificarTarea(ActionEvent event) {
        Tarea tareaSeleccionada = listViewTareas.getSelectionModel().getSelectedItem();
        textFieldTarea.setText(tareaSeleccionada.getContenido());
        btnGuardarTarea.setVisible(true);
    }
    
    @FXML
    private void guardarTarea(ActionEvent event) {
        Tarea tareaSeleccionada = listViewTareas.getSelectionModel().getSelectedItem();
        String nuevoContenido = textFieldTarea.getText();
        coleccionTareas.modificarTarea(tareaSeleccionada.getId(), nuevoContenido);
        listViewTareas.setItems(FXCollections.observableArrayList(coleccionTareas.getTareas()));
        listViewTareas.refresh();
        btnGuardarTarea.setVisible(false);
        textFieldTarea.clear();
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
}
