import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Menunu extends Application 
{
   public void start(Stage stage) 
   {
      Menu fileMenu = new Menu("File");
      MenuItem item1 = new MenuItem("Create New File");
      MenuItem item2 = new MenuItem("Open File");
      MenuItem item3 = new MenuItem("Edit File");
      MenuItem item4 = new MenuItem("Delete File");
      MenuItem item5 = new MenuItem("Exit");
      fileMenu.getItems().addAll(item1, item2, item3, item4, item5);
      MenuBar menuBar = new MenuBar(fileMenu);
      menuBar.setTranslateX(200);
      menuBar.setTranslateY(20);
      Group root = new Group(menuBar);
      Scene scene = new Scene(root, 595, 200, Color.BEIGE);
      stage.setTitle("Menu Example");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[])
   {
      launch(args);
   }
}
