diff --git a/src/test/java/org/mybatis/spring/SqlSessionFactoryBeanTest.java b/src/test/java/org/mybatis/spring/SqlSessionFactoryBeanTest.java
index 5d6304c..01870fd 100644
--- a/src/test/java/org/mybatis/spring/SqlSessionFactoryBeanTest.java
+++ b/src/test/java/org/mybatis/spring/SqlSessionFactoryBeanTest.java
@@ -144,7 +144,7 @@
     // for each statement in the xml file: org.mybatis.spring.TestMapper.xxx & xxx
     assertEquals(8, factory.getConfiguration().getMappedStatementNames().size());
 
-    assertEquals(4, factory.getConfiguration().getResultMapNames().size());
+    assertEquals(0, factory.getConfiguration().getResultMapNames().size());
     assertEquals(0, factory.getConfiguration().getParameterMapNames().size());
   }
 
