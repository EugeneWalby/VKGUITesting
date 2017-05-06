package test.vk.properties;

import org.aeonbits.owner.Config;

public interface VKConfig extends Config {
	String url();
	String email();
	String password();
	String friendHref();
	String message();
	String driverKey();
	String driverValue();
}
