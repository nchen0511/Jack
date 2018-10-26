public class JackOLantern {
    private String[][] face;
    public JackOLantern(String[][] face){
        this.face = face;
    }

    public void edit (String str, int row, int col){
        this.face[row][col] = str;
    }

    public void fill (String str){
        for(int i=0;i<this.face.length;i++){
            for(int n=0;n<this.face[i].length;n++){
                this.face[i][n] = str;
            }
        }
    }

    public String toString(){
        String face = "";
        for(int i=0;i<this.face.length;i++){
            for(int n=0;n<this.face[i].length;n++){
                face += this.face[i][n];
            }
            face+="\n";
        }
        return face;
    }
}
