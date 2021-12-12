diff --git a/modules/core/src/main/java/org/apache/ignite/internal/GridProperties.java b/modules/core/src/main/java/org/apache/ignite/internal/GridProperties.java
index bf8f93e..89110af 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/GridProperties.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/GridProperties.java
@@ -36,14 +36,15 @@
     static {
         PROPS = new Properties();
 
-        readProperties(FILE_PATH, true);
+        readProperties(FILE_PATH, PROPS, true);
     }
 
     /**
      * @param path Path.
+     * @param props Properties.
      * @param throwExc Flag indicating whether to throw an exception or not.
      */
-    public static void readProperties(String path, boolean throwExc) {
+    public static void readProperties(String path, Properties props, boolean throwExc) {
         try (InputStream is = IgniteVersionUtils.class.getClassLoader().getResourceAsStream(path)) {
             if (is == null) {
                 if (throwExc)
@@ -52,7 +53,7 @@
                     return;
             }
 
-            PROPS.load(is);
+            props.load(is);
         }
         catch (IOException e) {
             throw new RuntimeException("Failed to read properties file: " + path, e);
