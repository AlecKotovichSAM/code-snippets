public class App extends Application {
 
    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
 
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setTitle("SaM Solutions JavaFX App");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch();
    }
 
}
