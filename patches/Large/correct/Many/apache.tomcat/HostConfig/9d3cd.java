diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index cc1db42..ee1f113 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -545,10 +545,11 @@
         boolean isExternalWar = false;
         boolean isExternal = false;
         File expandedDocBase = null;
-        try {
+
+        try (FileInputStream fis = new FileInputStream(contextXml)) {
             synchronized (digester) {
                 try {
-                    context = (Context) digester.parse(contextXml);
+                    context = (Context) digester.parse(fis);
                 } catch (Exception e) {
                     log.error(sm.getString(
                             "hostConfig.deployDescriptor.error",
