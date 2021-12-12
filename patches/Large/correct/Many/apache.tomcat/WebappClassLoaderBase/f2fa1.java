diff --git a/java/org/apache/catalina/loader/WebappClassLoaderBase.java b/java/org/apache/catalina/loader/WebappClassLoaderBase.java
index bfa3f3c..85bae59 100644
--- a/java/org/apache/catalina/loader/WebappClassLoaderBase.java
+++ b/java/org/apache/catalina/loader/WebappClassLoaderBase.java
@@ -2417,12 +2417,12 @@
 
             WebResource webResource = entry.webResource;
             if (webResource == null) {
-                webResource = resources.getResource(path);
+                webResource = resources.getClassLoaderResource(path);
             } else {
                 entry.webResource = null;
             }
 
-            if (webResource == null) {
+            if (!webResource.exists()) {
                 return null;
             }
 
