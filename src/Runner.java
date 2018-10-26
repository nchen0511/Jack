public class Runner {
    public static void main(String[] args){
        String[][] template = new String[6][3];
        JackOLantern jack = new JackOLantern(template);

        System.out.println(jack.toString());

        jack.fill("x");

        System.out.println(jack.toString());
    }
}
