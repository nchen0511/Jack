public class Runner {
    public static void main(String[] args){
        String[][] template = new String[][]{
                {" ","0","0","0","0","0"," "},
                {"0","=","0","0","0","=","0"},
                {"0","0","0","0","0","0","0"},
                {"0","0","0","0","0","0","0"},
                {"0","-","-","-","-","-","0"},
                {" ","0","0","0","0","0"," "},
        };
        JackOLantern jack = new JackOLantern(template);

        System.out.println(jack.toString());

        jack.fill("'");

        System.out.println(jack.toString());

        jack.edit("u",1,1);
        jack.edit("u",1,5);
        jack.edit("w",4,3);

        jack.edit(" ",0,0);
        jack.edit(" ",0,6);
        jack.edit(" ",5,0);
        jack.edit(" ",5,6);

        System.out.println(jack.toString());
    }
}
