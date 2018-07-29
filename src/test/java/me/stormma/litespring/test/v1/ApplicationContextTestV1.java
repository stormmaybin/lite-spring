package me.stormma.litespring.test.v1;

import me.stormma.litespring.context.ApplicationContext;
import me.stormma.litespring.context.support.ClassPathXmlApplicationContext;
import me.stormma.litespring.context.support.FileSystemXmlApplicationContext;
import me.stormma.litespring.test.v1.entity.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author stormma stormmaybin@gmail.com
 */
public class ApplicationContextTestV1 {

    @Test
    public void testGetBeanUseClassPathApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("petstore-v1.xml");
        PetStoreService petStoreService = (PetStoreService) context.getBean("petStore");
        Assert.assertNotNull(petStoreService);
        petStoreService.petStoreService();
    }

    @Test
    public void testGetBeanUseFileSystemXmlApplicationContext() {
        ApplicationContext context = new FileSystemXmlApplicationContext("/Users/stormma/coding/java-project/lite-spring/src/test/resources/petstore-v1.xml");
        PetStoreService petStoreService = (PetStoreService) context.getBean("petStore");
        Assert.assertNotNull(petStoreService);
        petStoreService.petStoreService();
    }
}
