diff --git a/src/test/java/org/mybatis/spring/mapper/MapperScannerConfigurerTest.java b/src/test/java/org/mybatis/spring/mapper/MapperScannerConfigurerTest.java
index 436d950..5ccd2c0 100644
--- a/src/test/java/org/mybatis/spring/mapper/MapperScannerConfigurerTest.java
+++ b/src/test/java/org/mybatis/spring/mapper/MapperScannerConfigurerTest.java
@@ -78,7 +78,7 @@
     assertBeanNotLoaded("package-info");
     //        assertBeanNotLoaded("annotatedMapperZeroMethods"); // as of 1.1.0 mappers with no methods are loaded
     
-    applicationContext.destroy();
+    applicationContext.close();
   }
 
   @Test
