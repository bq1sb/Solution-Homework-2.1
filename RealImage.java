class RealImage implements Image {
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Изображение высокого разрешения: " + filename);
    }

    public void display() {
        System.out.println("Отображение изображения :" + filename);
    }

    public void upload(User user) {
        System.out.println("Изображение " + filename + " загружено");

    }
}
