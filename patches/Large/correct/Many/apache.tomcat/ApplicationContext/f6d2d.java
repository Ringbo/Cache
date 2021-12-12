diff --git a/java/org/apache/catalina/core/ApplicationContext.java b/java/org/apache/catalina/core/ApplicationContext.java
index d4f0b02..6bcd9e4 100644
--- a/java/org/apache/catalina/core/ApplicationContext.java
+++ b/java/org/apache/catalina/core/ApplicationContext.java
@@ -507,7 +507,7 @@
     public InputStream getResourceAsStream(String path) {
 
         path = normalize(path);
-        if (path == null)
+        if (path == null || !path.startsWith("/"))
             return (null);
 
         DirContext resources = context.getResources();
@@ -865,7 +865,7 @@
 
         String normalized = path;
 
-        // Normalize the slashes and add leading slash if necessary
+        // Normalize the slashes
         if (normalized.indexOf('\\') >= 0)
             normalized = normalized.replace('\\', '/');
 
