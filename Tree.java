import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Tree extends Application 
{
	public void start(Stage stage) 
	{
		TreeItem root1 = new TreeItem("Sales Department");
		TreeItem item1 = new TreeItem("Ethan Williams");
		TreeItem item2 = new TreeItem("Emma Jhones");
		TreeItem item3 = new TreeItem("Michale Brown");
		TreeItem item = new TreeItem("Anna Black");
     
		root1.getChildren().addAll(item1, item2, item3, item);
		TreeItem root2 = new TreeItem("IT Department");
		TreeItem item4 = new TreeItem("Miche Gharam");
		TreeItem item5 = new TreeItem("Judy Mayer");
		TreeItem item6 = new TreeItem("Georgry Smith");
      
		root2.getChildren().addAll(item4, item5, item6);
		TreeItem root3 = new TreeItem("Accounts Department");
		TreeItem item7 = new TreeItem("Jacob Smith");
		TreeItem item8 = new TreeItem("Jhonson");
	
		root3.getChildren().addAll(item7, item8);
     
		TreeItem<String> base = new TreeItem<String>("Technologies");
		base.setExpanded(true);
		base.getChildren().addAll(root1, root2, root3);
     
		TreeView view = new TreeView(base);
		view.setPrefHeight(300);
		VBox pane = new VBox(10);
		pane.setPadding(new Insets(5, 5, 5, 50));
		pane.getChildren().addAll(view);
     
		Group node = new Group(pane);
		Scene scene = new Scene(node, 595, 320, Color.BEIGE);
		stage.setTitle("List View Example");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}