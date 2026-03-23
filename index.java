package pasta2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class index {

    public static void main(String[] args) throws Exception {

        
            FileWriter escrevWriter = new FileWriter("arquivo.txt");
            BufferedWriter escritor = new BufferedWriter(escrevWriter);

           escritor.write("ola tudo bem ?\n");
           escritor.write("como voce esta na escola ?\n os professores da escola de stanbun excelentes mestres.");
           escritor.write("voce consegui mais uma vez !!!");


           escritor.close();


    }
}
