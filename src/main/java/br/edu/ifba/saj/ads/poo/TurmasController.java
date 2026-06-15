package br.edu.ifba.saj.ads.poo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.edu.ifba.saj.ads.poo.model.Aluno;
import br.edu.ifba.saj.ads.poo.model.Professor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TurmasController implements Initializable {

    @FXML
    private TextField adcMateria;

    @FXML
    private TextField chbAlunos;

    @FXML
    private TextField chbProfessores;

    @FXML
    private ListView<Aluno> ltrAlunos;

    @FXML
    private ListView<Professor> ltrProfessores;

    private List<Professor> professores = new ArrayList<>();

    private List<Aluno> alunos = new ArrayList<>();





    @FXML
    void adcAlunos(ActionEvent event) {
        alunos.add(new Aluno(chbAlunos.getText()));
        ltrAlunos.setItems(FXCollections.observableList(alunos));
    }

    @FXML
    void adcProfessor(ActionEvent event) {
        professores.add(new Professor(chbProfessores.getText()));
        ltrProfessores.setItems(FXCollections.observableList(professores));
    }

    @FXML
    void adicionarMateria(ActionEvent event) {

    }

    @FXML
    void salvarInformacoes(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ltrProfessores.setCellFactory(valor -> new ListCell<Professor>(){
            protected void updateItem(Professor item, boolean empty) {
                super.updateItem(item, empty);
                if(empty || item == null){
                    setText(null);
                }else{
                    setText(item.getName());
                }
            };
        });
        ltrAlunos.setCellFactory(valor -> new ListCell<Aluno>(){
            protected void updateItem(Aluno aluno, boolean empty) {
                super.updateItem(aluno, empty);
                if(empty || aluno == null){
                    setText(null);
                }else{
                    setText(aluno.getName());
                }
            };
        });
    }

}
