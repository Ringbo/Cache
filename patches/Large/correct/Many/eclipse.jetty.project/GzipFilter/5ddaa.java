diff --git a/jetty-servlets/src/main/java/org/eclipse/jetty/servlets/GzipFilter.java b/jetty-servlets/src/main/java/org/eclipse/jetty/servlets/GzipFilter.java
index db36f51..94d50de 100644
--- a/jetty-servlets/src/main/java/org/eclipse/jetty/servlets/GzipFilter.java
+++ b/jetty-servlets/src/main/java/org/eclipse/jetty/servlets/GzipFilter.java
@@ -350,7 +350,7 @@
         {
             for (String excludedPath : _excludedPaths)
             {
-                if (requestURI.contains(excludedPath))
+                if (requestURI.startsWith(excludedPath))
                 {
                     return true;
                 }
