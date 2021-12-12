diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
index 732a450..436a17a 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
@@ -131,7 +131,7 @@
         try {
             final InputStream stream = new FileInputStream(file);
             stream.close();
-            throw new Exception("File " + file.getPath() + " should not exist");
+            throw new IllegalStateException("File " + file.getPath() + " should not exist");
         }
         catch (FileNotFoundException ex) {
             return ex.getLocalizedMessage();
