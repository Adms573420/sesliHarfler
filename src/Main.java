public class Main {

    public static void main(String[] args) {
        char harf = 'E';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin Sesli Harf");
                break;
            default:
                System.out.println("Ince Sesli Harf");
        }
    }
}
