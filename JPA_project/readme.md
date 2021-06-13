=>run "../src/main/java/com/cognizant/truyum/dao/MenuItemDaoCollectionImplTest.java"
and
"../src/main/java/com/cognizant/truyum/dao/MenuItemDaoSqlImplTest.java"
for testing jpa and spring xml
=> for ..SQLImplTest to run : get bean
ApplicationContext context = SpringApplication.run(truYumApplication.class, args);

		menuItemDaoSqlImpl = context.getBean(MenuItemDaoSqlImpl.class);

=>application properties is present in src/main/resource
=>to get xml file from other folder use
AbstractApplicationContext context= new ClassPathXmlApplicationContext("file:src/spring-config.xml");
