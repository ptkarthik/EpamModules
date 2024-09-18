package guice;

import java.util.HashMap;
import java.util.Map;

class SimpleInjector {
    private Map<Class<?>, Class<?>> bindings = new HashMap<>();

    public <T> T getInstance(Class<T> type) {
        Class<?> implClass = bindings.get(type);
        if (implClass == null) {
            throw new RuntimeException("No binding found for " + type.getName());
        }

        try {
            // Create a new instance of the implementation class
            return (T) implClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + implClass.getName(), e);
        }
    }

    public <T> void bind(Class<T> intf, Class<? extends T> impl) {
        bindings.put(intf, impl);
    }
}

// Simplified Guice-like framework
class SimpleGuice {
    public static SimpleInjector createInjector(SimpleModule module) {
        SimpleInjector injector = new SimpleInjector();
        module.configure(injector);  // Call the configure method of the module
        return injector;  // Return the injector with the bindings set up
    }
}

// Module where bindings are defined (similar to AbstractModule in Guice)
abstract class SimpleModule {
    public abstract void configure(SimpleInjector injector);
}

// Service interface and implementation
interface Service {
    void performAction();
}

class ServiceImpl implements Service {
    public void performAction() {
        System.out.println("Performing action in ServiceImpl");
    }
}

// AppModule where bindings are defined (like AppModule in Guice)
class AppModule extends SimpleModule {
    @Override
    public void configure(SimpleInjector injector) {
        injector.bind(Service.class, ServiceImpl.class);  // Bind Service to ServiceImpl
    }
}

// Main application
public class Application {
    public static void main(String[] args) {
        // Create the injector
        SimpleInjector injector = SimpleGuice.createInjector(new AppModule());

        // Get the Service instance (injected with dependencies)
        Service service = injector.getInstance(Service.class);

        // Call the method
        service.performAction();  // Outputs: Performing action in ServiceImpl
    }
}

