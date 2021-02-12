import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
public class MenuWithJavaFX extends Application{
	Label response;
	public static void main(String args[]){
		launch(args);
	}
	public void start(Stage myStage){
		myStage.setTitle("JAVA FX MENUITEMS");
		BorderPane rootNode=new BorderPane();
		Scene myScene=new Scene(rootNode,300,300);
		myStage.setScene(myScene);
		response=new Label("MENU CODE");
		MenuBar mb=new MenuBar();
		//Country MENU
		Menu country=new Menu("COUNTRY");
		MenuItem india=new MenuItem("INDIA");
		MenuItem australia=new MenuItem("AUSTRALIA");
		MenuItem pakistan=new MenuItem("PAKISTAN");
		MenuItem germany=new MenuItem("GERMANY");
		MenuItem iceland=new MenuItem("ICELAND");
		MenuItem british=new MenuItem("BRITISH");
		MenuItem china=new MenuItem("CHINA");
		country.getItems().addAll(india,australia,pakistan,germany,iceland,british,china);
		india.setAccelerator(KeyCombination.keyCombination("shortcut+A"));
		australia.setAccelerator(KeyCombination.keyCombination("shortcut+B"));
		pakistan.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
		germany.setAccelerator(KeyCombination.keyCombination("shortcut+D"));
		iceland.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
		british.setAccelerator(KeyCombination.keyCombination("shortcut+F"));
		china.setAccelerator(KeyCombination.keyCombination("shortcut+G"));
		mb.getMenus().add(country);
		//FONT MENU
		Menu font=new Menu("FONT");
		Menu name=new Menu("NAME");
		MenuItem tim=new MenuItem("TimesRoman");
		MenuItem dia=new MenuItem("Dialog");
		MenuItem san=new MenuItem("SanSerif");
		MenuItem cou=new MenuItem("Courier");
		Menu type=new Menu("TYPE");
		MenuItem bold=new MenuItem("Bold");
		MenuItem italic=new MenuItem("Italic");
		Menu size=new Menu("SIZE");
		MenuItem a=new MenuItem("15");
		MenuItem b=new MenuItem("16");
		MenuItem c=new MenuItem("17");
		MenuItem d=new MenuItem("18");
		name.getItems().addAll(tim,dia,san,cou);
		tim.setAccelerator(KeyCombination.keyCombination("shortcut+H"));
		dia.setAccelerator(KeyCombination.keyCombination("shortcut+I"));
		san.setAccelerator(KeyCombination.keyCombination("shortcut+J"));
		cou.setAccelerator(KeyCombination.keyCombination("shortcut+K"));
		type.getItems().addAll(bold,italic);
		bold.setAccelerator(KeyCombination.keyCombination("shortcut+L"));
		italic.setAccelerator(KeyCombination.keyCombination("shortcut+M"));
		size.getItems().addAll(a,b,c,d);
		a.setAccelerator(KeyCombination.keyCombination("shortcut+N"));
		b.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		c.setAccelerator(KeyCombination.keyCombination("shortcut+P"));
		d.setAccelerator(KeyCombination.keyCombination("shortcut+Q"));
		font.getItems().addAll(name,type,size);
		mb.getMenus().add(font);
		//colours
		Menu colour=new Menu("COLOUR");
		MenuItem violet=new MenuItem("VIOLET");
		MenuItem indigo=new MenuItem("INDIGO");
		MenuItem blue=new MenuItem("BLUE");
		MenuItem green=new MenuItem("GREEN");
		MenuItem yellow=new MenuItem("YELLOW");
		MenuItem orange=new MenuItem("ORANGE");
		MenuItem red=new MenuItem("RED");
		colour.getItems().addAll(violet,indigo,blue,green,yellow,orange,red);
		violet.setAccelerator(KeyCombination.keyCombination("shortcut+R"));
		indigo.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		blue.setAccelerator(KeyCombination.keyCombination("shortcut+T"));
		green.setAccelerator(KeyCombination.keyCombination("shortcut+U"));
		yellow.setAccelerator(KeyCombination.keyCombination("shortcut+V"));
		orange.setAccelerator(KeyCombination.keyCombination("shortcut+W"));
		red.setAccelerator(KeyCombination.keyCombination("shortcut+X"));
		mb.getMenus().add(colour);
		EventHandler<ActionEvent> MEHandler = new
			EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ae)
				{
					String A=((MenuItem)ae.getSource()).getText();
					if(A.equals("INDIA")||A.equals("AUSTRALIA")||A.equals("PAKISTAN")||A.equals("GERMANY")||A.equals("ICELAND")||A.equals("BRITISH")||A.equals("CHINA"))
					{
						response.setText(((MenuItem)ae.getSource()).getText());
						response.setTextFill(Color.BLUE);
						response.setFont(Font.font("Dialog",FontPosture.ITALIC,18));
					}
					if(A.equals("TimesRoman"))
					{
						response.setFont(Font.font("Times NewRoman",FontPosture.ITALIC,18));
					}
					if(A.equals("Bold"))
					{
						response.setFont(Font.font("Times NewRoman",FontWeight.BOLD,18));
					}
					if(A.equals("Italic"))
					{
						response.setFont(Font.font("Times NewRoman",FontPosture.ITALIC,18));
					}
					if(A.equals("Dialog"))
					{
						response.setFont(Font.font("Dialog",FontPosture.ITALIC,18));
					}
					if(A.equals("SanSerif"))
					{
						response.setFont(Font.font("SanSerif",FontPosture.ITALIC,18));
					}
					if(A.equals("Courier"))
					{
						response.setFont(Font.font("Courier",FontPosture.ITALIC,18));
					}
					if(A.equals("Courier"))
					{
						response.setFont(Font.font("Courier",FontPosture.ITALIC,18));
					}
					if(A.equals("VIOLET"))
					{
						response.setTextFill(Color.VIOLET);
					}
					if(A.equals("INDIGO"))
					{
						response.setTextFill(Color.PURPLE);
					}
					if(A.equals("BLUE"))
					{
						response.setTextFill(Color.BLUE);
					}
					if(A.equals("GREEN"))
					{
						response.setTextFill(Color.GREEN);
					}
					if(A.equals("YELLOW"))
					{
						response.setTextFill(Color.YELLOW);
					}
					if(A.equals("ORANGE"))
					{
						response.setTextFill(Color.ORANGE);
					}
					if(A.equals("RED"))
					{
						response.setTextFill(Color.RED);
					}
				}
			} ;
		india.setOnAction(MEHandler);
		australia.setOnAction(MEHandler);
		pakistan.setOnAction(MEHandler);
		germany.setOnAction(MEHandler);
		iceland.setOnAction(MEHandler);
		british.setOnAction(MEHandler);
		china.setOnAction(MEHandler);
		tim.setOnAction(MEHandler);
		dia.setOnAction(MEHandler);
		san.setOnAction(MEHandler);
		cou.setOnAction(MEHandler);
		bold.setOnAction(MEHandler);
		italic.setOnAction(MEHandler);
		a.setOnAction(MEHandler);
		b.setOnAction(MEHandler);
		c.setOnAction(MEHandler);
		d.setOnAction(MEHandler);
		violet.setOnAction(MEHandler);
		indigo.setOnAction(MEHandler);
		blue.setOnAction(MEHandler);
		green.setOnAction(MEHandler);
		yellow.setOnAction(MEHandler);
		orange.setOnAction(MEHandler);
		red.setOnAction(MEHandler);
		rootNode.setTop(mb);
		rootNode.setCenter(response);
		myStage.show();
	}
}
