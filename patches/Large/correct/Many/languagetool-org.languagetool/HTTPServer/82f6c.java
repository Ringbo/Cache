diff --git a/languagetool-server/src/main/java/org/languagetool/server/HTTPServer.java b/languagetool-server/src/main/java/org/languagetool/server/HTTPServer.java
index e98a185..d7f6645 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/HTTPServer.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/HTTPServer.java
@@ -126,7 +126,7 @@
   }
 
   public static void main(String[] args) {
-    if (args.length > 5 || usageRequested(args)) {
+    if (args.length > 7 || usageRequested(args)) {
       System.out.println("Usage: " + HTTPServer.class.getSimpleName() + " [--config propertyFile] [--port|-p port] [--public]");
       System.out.println("  --config FILE  a Java property file (one key=value entry per line) with values for:");
       printCommonConfigFileOptions();
