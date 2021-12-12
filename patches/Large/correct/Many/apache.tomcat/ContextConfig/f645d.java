diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index a38d90c..5af4394 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -1672,7 +1672,7 @@
         for (WebXml fragment : fragments) {
             URL url = fragment.getURL();
             try {
-                if ("jar".equals(url.getProtocol())) {
+                if ("jar".equals(url.getProtocol()) || url.toString().endsWith(".jar")) {
                     try (Jar jar = JarFactory.newInstance(url)) {
                         jar.nextEntry();
                         String entryName = jar.getEntryName();
