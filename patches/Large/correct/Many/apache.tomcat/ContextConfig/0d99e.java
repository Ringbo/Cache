diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index 3f5e979..296f69c 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -742,8 +742,7 @@
             docBase = cn.getBaseName();
 
             File file = null;
-            if (docBase.toLowerCase(Locale.ENGLISH).endsWith(".war")) {
-                // TODO - This is never executed. Bug or code to delete?
+            if (originalDocBase.toLowerCase(Locale.ENGLISH).endsWith(".war")) {
                 file = new File(System.getProperty("java.io.tmpdir"),
                         deploymentCount++ + "-" + docBase + ".war");
             } else {
