import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.text.DecimalFormat;
public class FXInsurance extends Application
{
private final double HMO = 200,PPO=600;
private final double DENTAL_COVERAGE = 75;
private final double VISION_CARE = 20;
@Override
public void start(Stage primaryStage) throws Exception
{
HBox box1 = new HBox();
box1.setPadding(new Insets(10,10,10,10));
HBox box2 = new HBox();
box2.setPadding(new Insets(10,10,10,10)); box2.setSpacing(10);
box1.setSpacing(10);
//Radio Buttons
RadioButton rdbHMO = new RadioButton("HMO");
RadioButton rdbPPO = new RadioButton("PPO");
ToggleGroup group = new ToggleGroup();
rdbHMO.setToggleGroup(group);
rdbPPO.setToggleGroup(group);
box1.getChildren().add(rdbHMO); box1.getChildren().add(rdbPPO);
CheckBox chkDentalInsurance = new CheckBox("Dental Insurance");
CheckBox chkVisionInsurance = new CheckBox("Vision Insurance");
box2.getChildren().add(chkDentalInsurance);
box2.getChildren().add(chkVisionInsurance);
HBox box3 = new HBox();
box3.setPadding(new Insets(10,10,10,10));
TextArea txtResult = new TextArea();
txtResult.setEditable(false);
txtResult.setPrefColumnCount(300);
txtResult.setPrefRowCount(400);
box3.getChildren().add(txtResult);
HBox box4 = new HBox(); box4.setPadding(new Insets(10,10,10,10));
Button btnCalculate = new Button("Display");
box4.getChildren().add(btnCalculate);
VBox vBox = new VBox();
vBox.setPadding(new Insets(10,10,10,10));
vBox.getChildren().add(box1);
vBox.getChildren().add(box2);
vBox.getChildren().add(box3); vBox.getChildren().add(box4);
Scene scene = new Scene(vBox,350,250);
primaryStage.setScene(scene);
primaryStage.setTitle("FXInsurance"); primaryStage.show();
btnCalculate.setOnAction(new EventHandler<ActionEvent>()
{ double price ;
String result ;
@Override
public void handle(ActionEvent event) { result="";
price =0;
if(rdbHMO.isSelected())
{
result+="Insurance:Health maintenance organization,";
price+=HMO;
}
if(rdbPPO.isSelected())
{
result+="Insurance:Preferred provider organization,";
price+=PPO;
}
if(chkDentalInsurance.isSelected())
{
result+="\nDental insurance,";
price+=DENTAL_COVERAGE;
}
if(chkVisionInsurance.isSelected())
{
result+="\nVision insurance,";
price+=VISION_CARE;
}
txtResult.setText(result+"\nInsurance Price:"+DecimalFormat.getCurrencyInstance().format(price));
} });}
public static void main(String[] args)
{
launch(args);
}
}