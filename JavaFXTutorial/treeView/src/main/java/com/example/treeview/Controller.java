package com.example.treeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TreeView treeView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(new Image("file:/C:/Users/Kacper/Desktop/java_work/JavaFXTutorial/treeView/src/main/resources/com/example/treeview/folder.png")));
        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leafItem1 = new TreeItem<>("photo1");
        TreeItem<String> leafItem2 = new TreeItem<>("photo2");
        TreeItem<String> leafItem3 = new TreeItem<>("video1");
        TreeItem<String> leafItem4 = new TreeItem<>("video2");
        TreeItem<String> leafItem5= new TreeItem<>("music1");
        TreeItem<String> leafItem6 = new TreeItem<>("music2");

        branchItem1.getChildren().addAll(leafItem1,leafItem2);
        branchItem2.getChildren().addAll(leafItem3,leafItem4);
        branchItem3.getChildren().addAll(leafItem5,leafItem6);


        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

        treeView.setRoot(rootItem);

    }

    public void selectItem() {

        TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();

        if (item != null) {
            System.out.println(item.getValue());
        }
    }

}
