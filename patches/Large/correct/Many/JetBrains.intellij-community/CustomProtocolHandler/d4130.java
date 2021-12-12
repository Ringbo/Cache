diff --git a/platform/platform-impl/src/com/intellij/ui/CustomProtocolHandler.java b/platform/platform-impl/src/com/intellij/ui/CustomProtocolHandler.java
index cfeb9cb..e2a99dc 100644
--- a/platform/platform-impl/src/com/intellij/ui/CustomProtocolHandler.java
+++ b/platform/platform-impl/src/com/intellij/ui/CustomProtocolHandler.java
@@ -38,7 +38,7 @@
 
   public boolean openLink(@NotNull URI uri) {
     final List<String> args = getOpenArgs(uri);
-    return !args.isEmpty() && CommandLineProcessor.processExternalCommandLine(args) != null;
+    return !args.isEmpty() && CommandLineProcessor.processExternalCommandLine(args, null) != null;
   }
 
   @NotNull
