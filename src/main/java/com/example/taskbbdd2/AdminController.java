package com.example.taskbbdd2;

import com.example.taskbbdd2.ViewsControllers.ControllerView;
import com.example.taskbbdd2.models.User;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AdminController extends ControllerView {

    @FXML
    public Tab tabCrearUsuario;

    @FXML

    public Tab tabModificarUsuario;


    @FXML
    public Label lblBien;

    @FXML
    public Button btnGuardar;

    @FXML
    public Button btnSalirAdmin;
    @FXML
    public Tab tabTaskview;
    @FXML
    public Button btnBorrarUsuario;
    @FXML
    public Tab tabUserview;
    @FXML
    public PasswordField txtRepPass;
    @FXML
    public PasswordField txtNewPass;
    @FXML
    public TextField txtModUser;
    @FXML
    public Label lblRepPass;
    @FXML
    public Label lblNewPass;
    @FXML
    public Label lblModUser;
    @FXML
    public ComboBox ComboRol;
    @FXML
    public Label lblIdrol;
    @FXML
    public Label lblPass;
    @FXML
    public Label lblUsername;
    @FXML

    public TextField txtCrearUsuario;
    @FXML
    public TextField txtCrearPass;



    public void CrearUsuario(Event event) {
        taskController.createUser(txtCrearUsuario.getText(),txtCrearPass.getText(), Integer.parseInt(lblIdrol.getId()));

    }

    public void ModificarUsuario(Event event) {
        taskController.editPassword(txtModUser.getText(),txtRepPass.getText());

    }

    public void BorrarUsuario(Event event) {
        //unir con boton de borrar. Que borre la seleccion

    }
    public void VerTareas(Event event) {
        //generar listado de tareas desde la base de datos

    }
    public void VerUsuarios(Event event) {
        //generar listado de usuarios
    }


    public void Guardartodo(ActionEvent actionEvent) {

        taskController.createUser(txtCrearUsuario.getText(),txtCrearPass.getText(),1);
    }

    public void SalirAdmin(ActionEvent actionEvent) {

    }



}