diff --git a/src/test/java/org/mybatis/spring/annotation/MapperScanTest.java b/src/test/java/org/mybatis/spring/annotation/MapperScanTest.java
index e7d357b..27d222d 100644
--- a/src/test/java/org/mybatis/spring/annotation/MapperScanTest.java
+++ b/src/test/java/org/mybatis/spring/annotation/MapperScanTest.java
@@ -78,7 +78,7 @@
     // assertBeanNotLoaded("annotatedMapperZeroMethods"); // as of 1.1.0 mappers
     // with no methods are loaded
 
-    applicationContext.destroy();
+    applicationContext.close();
   }
 
   @Test
