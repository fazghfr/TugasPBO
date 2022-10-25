import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Ahmad Fauzan Alghifari 5025211091

public class tugas_091 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //instantiate buttons
	Button btn1 = new Button();
        Button btn2 = new Button();
        
        //instantiate VBox root
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        
        btn1.setText("Tombol Pertama");
        btn2.setText("Tombol kedua");
        
        //setting button action
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("Tombol Pertama berhasil di-klik, jumlah klik : " +count);
                btn1.setText("Tombol Pertama berhasil di klik sebanyak " +count +" kali");
                count += 1;
            }
            
            int count = 1;
        });
        
        
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("Tombol Kedua berhasil di-klik, jumlah klik : " +count);
                btn2.setText("Tombol Kedua berhasil di klik sebanyak " +count +" kali");
                count += 1;
            }
            
            int count = 1;
        });
        
        //menambahkan btn1 dan btn2 ke root
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        
        //setting scene
        Scene scene = new Scene(root, 400, 350);
        
        //setting primarystage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tugas Ahmad Fauzan Alghifari 5025211091");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
