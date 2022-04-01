boolean backgroundLoading = true;

Image image = new Image(url, backgroundLoading);
ImageView imageView = new ImageView(image);

stackPane.getChildren().add(imageView);       
stackPane.setStyle("-fx-background-color: #3270B7");
