package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import desserts.IceCream;
import desserts.brownies.WalnutBrownie;
import juices.OrangeJuice;
import milkshakes.MongoMilkShake;

public class PureAnnotationBasedConfigurationExampleMain {

	public static void main(String[] args) {
		Class<SpringConfig3> configClass = SpringConfig3.class;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClass);
		Class<MyComponent> componentType = MyComponent.class;
		MyComponent myCompRef= context.getBean(componentType);
		myCompRef.testMyComponent();

		Class<OrangeJuice> juiceComp = OrangeJuice.class;
		OrangeJuice juiceRef = context.getBean(juiceComp);
		juiceRef.testOrangeJuice();
		
		Class<MongoMilkShake> shakeComp= MongoMilkShake.class;
		MongoMilkShake shakeRef=context.getBean(shakeComp);
		shakeRef.testMongoMilkShake();
		
		Class<IceCream> iceCreamComp=IceCream.class;
		IceCream iceCreamRef=context.getBean(iceCreamComp);
		iceCreamRef.testMangoIceCream();
		
		Class<WalnutBrownie> walnutBrownieComp=WalnutBrownie.class;
		WalnutBrownie brownieRef=context.getBean(walnutBrownieComp);
		brownieRef.testWalnutBrownie();
		

	}

}
