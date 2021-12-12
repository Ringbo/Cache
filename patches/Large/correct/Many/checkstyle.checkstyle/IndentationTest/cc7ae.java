diff --git a/src/it/java/com/google/checkstyle/test/chapter4formatting/rule4841indentation/IndentationTest.java b/src/it/java/com/google/checkstyle/test/chapter4formatting/rule4841indentation/IndentationTest.java
index 2543c7f..365d382 100644
--- a/src/it/java/com/google/checkstyle/test/chapter4formatting/rule4841indentation/IndentationTest.java
+++ b/src/it/java/com/google/checkstyle/test/chapter4formatting/rule4841indentation/IndentationTest.java
@@ -17,7 +17,7 @@
     private static ConfigurationBuilder builder;
 
     @BeforeClass
-    public static void setConfigurationBuilder() throws CheckstyleException {
+    public static void setConfigurationBuilder() {
         builder = new IndentationConfigurationBuilder(new File("src/it/"));
     }
 
