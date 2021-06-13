=>run:

	<strong>"../src/main/java/com/cognizant/truyum/dao/MenuItemDaoCollectionImplTest.java"</strong>
and

	<strong>"../src/main/java/com/cognizant/truyum/dao/MenuItemDaoSqlImplTest.java"</strong>
=>to get xml file from other folder use

		<code>AbstractApplicationContext context= new ClassPathXmlApplicationContext("file:src/spring-config.xml");</code>
for testing jpa and spring xml

=> for ..SQLImplTest to run : get bean

	<code>ApplicationContext context = SpringApplication.run(truYumApplication.class, args);
	menuItemDaoSqlImpl = context.getBean(MenuItemDaoSqlImpl.class);	</code>

=>application properties is present in src/main/resource

