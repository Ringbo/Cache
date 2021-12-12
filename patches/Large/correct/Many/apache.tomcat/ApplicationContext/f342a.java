diff --git a/java/org/apache/catalina/core/ApplicationContext.java b/java/org/apache/catalina/core/ApplicationContext.java
index aac5515..8061362 100644
--- a/java/org/apache/catalina/core/ApplicationContext.java
+++ b/java/org/apache/catalina/core/ApplicationContext.java
@@ -519,7 +519,7 @@
             String fullPath = context.getPath() + normPath;
             String hostName = context.getParent().getName();
             try {
-                resources.lookup(path);
+                resources.lookup(normPath);
                 return new URL
                     ("jndi", "", 0, getJNDIUri(hostName, fullPath),
                      new DirContextURLStreamHandler(resources));
