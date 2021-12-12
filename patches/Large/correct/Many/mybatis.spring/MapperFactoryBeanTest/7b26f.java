diff --git a/src/test/java/org/mybatis/spring/MapperFactoryBeanTest.java b/src/test/java/org/mybatis/spring/MapperFactoryBeanTest.java
index daf77fc..34593b2 100644
--- a/src/test/java/org/mybatis/spring/MapperFactoryBeanTest.java
+++ b/src/test/java/org/mybatis/spring/MapperFactoryBeanTest.java
@@ -199,7 +199,7 @@
         // SqlSessionFactory could change for each test
         MapperFactoryBean<TestMapper> mapper = new MapperFactoryBean<TestMapper>();
         mapper.setMapperInterface(TestMapper.class);
-        mapper.setSqlSession(sqlSessionTemplate);
+        mapper.setSqlSessionTemplate(sqlSessionTemplate);
         mapper.setAddToConfig(addToConfig);
         mapper.afterPropertiesSet();
 
