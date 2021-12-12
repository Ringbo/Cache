diff --git a/jetty-start/src/main/java/org/eclipse/jetty/start/fileinits/UriFileInitializer.java b/jetty-start/src/main/java/org/eclipse/jetty/start/fileinits/UriFileInitializer.java
index 8582d5d..de57eba 100644
--- a/jetty-start/src/main/java/org/eclipse/jetty/start/fileinits/UriFileInitializer.java
+++ b/jetty-start/src/main/java/org/eclipse/jetty/start/fileinits/UriFileInitializer.java
@@ -107,7 +107,7 @@
                 throw new IOException("Directory in the way: " + file.toAbsolutePath());
             }
 
-            if (Files.isReadable(file))
+            if (!Files.isReadable(file))
             {
                 throw new IOException("File not readable: " + file.toAbsolutePath());
             }
