package se.vasakronan.demomodule;

import com.microsoft.azure.gateway.core.Broker;
import com.microsoft.azure.gateway.core.GatewayModule;
import com.microsoft.azure.gateway.messaging.Message;

public class DemoModule extends GatewayModule {
    /**
     * Constructs a {@link GatewayModule} from the provided address and {@link Broker}. A {@link GatewayModule} should always call this super
     * constructor before any module-specific constructor code.
     * <p>
     * The {@code address} parameter must be passed to the super constructor but can be ignored by the module-implementor when writing a module implementation.
     *
     * @param address       The address of the native module pointer.
     * @param broker        The {@link Broker} to which this module belongs
     * @param configuration The module-specific configuration
     */
    public DemoModule(long address, Broker broker, String configuration) {
        super(address, broker, configuration);

        System.out.println("MY CUSTOM MODULE IS EXECUTED!!!!!!");
    }

    @Override
    public void receive(Message message) {

        System.out.println("MY Module received : " + new String(message.getContent()));

    }

    @Override
    public void destroy() {

    }
}
