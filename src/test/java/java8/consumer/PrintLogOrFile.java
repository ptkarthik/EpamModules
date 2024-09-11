package java8.consumer;

import java8.predicates.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class PrintLogOrFile {

    public static void main(String[] args) throws IOException {
        Product tv = new Product("Sony Bravio", 54500, "Electronics", "A");
        printTheProductMedium(tv, true);


    }

    private static void printTheProductMedium(Product tv, boolean b) throws IOException {

        {
            Consumer<String> consumer = objectDetails -> System.out.println(objectDetails);
            String objectDetails = tv.toString();
            String userDir = System.getProperty("user.dir");
            File file = new File(userDir + "\\src\\main\\resources\\" + "logfile.txt");
            if (file.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                bw.write(objectDetails);
                bw.close();
                consumer.accept("the File has been written on File Log");
            } else {
                consumer.accept(objectDetails);
            }
        }
    }


}

