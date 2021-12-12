diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/api/jmx/FileSystem.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/api/jmx/FileSystem.java
index 0c64a5a..fde9aaa 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/api/jmx/FileSystem.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/api/jmx/FileSystem.java
@@ -36,7 +36,7 @@
     private final String path;
 
     public FileSystem() {
-        fs = new File(System.getProperty("karaf.data"));
+        fs = new File(System.getProperty("karaf.data", "karaf-data"));
         String path;
         try {
             path = fs.getCanonicalPath();
