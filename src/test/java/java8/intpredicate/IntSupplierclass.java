package java8.intpredicate;

import lombok.Data;

import java.security.SecureRandom;
import java.util.function.IntSupplier;

@Data
public class IntSupplierclass {
    public static void main(String[] args) {

        IntSupplier supplier= () ->
        { SecureRandom random = new SecureRandom();
            return random.nextInt(5000); };

System.out.println(supplier.getAsInt());
    }
}
