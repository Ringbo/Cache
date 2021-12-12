diff --git a/h2/src/test/org/h2/test/TestBase.java b/h2/src/test/org/h2/test/TestBase.java
index 4f7a471..6c909a5 100644
--- a/h2/src/test/org/h2/test/TestBase.java
+++ b/h2/src/test/org/h2/test/TestBase.java
@@ -1453,9 +1453,9 @@
      *
      * @return the path to java
      */
-    private String getJVM() {
-        return System.getProperty("java.home") + File.separatorChar + "bin" +
-                                                 File.separator + "java";
+    private static String getJVM() {
+        return System.getProperty("java.home") + File.separatorChar + "bin"
+                + File.separator + "java";
     }
 
     /**
