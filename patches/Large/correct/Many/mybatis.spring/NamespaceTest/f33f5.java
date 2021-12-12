diff --git a/src/test/java/org/mybatis/spring/config/NamespaceTest.java b/src/test/java/org/mybatis/spring/config/NamespaceTest.java
index 229ba74..09bcc59 100644
--- a/src/test/java/org/mybatis/spring/config/NamespaceTest.java
+++ b/src/test/java/org/mybatis/spring/config/NamespaceTest.java
@@ -64,7 +64,7 @@
     // assertBeanNotLoaded("annotatedMapperZeroMethods"); // as of 1.1.0 mappers
     // with no methods are loaded
 
-    applicationContext.destroy();
+    applicationContext.close();
   }
 
   @Test
