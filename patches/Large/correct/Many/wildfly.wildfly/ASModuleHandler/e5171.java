diff --git a/cli/src/main/java/org/jboss/as/cli/handlers/module/ASModuleHandler.java b/cli/src/main/java/org/jboss/as/cli/handlers/module/ASModuleHandler.java
index ab6e08a..4f6084f 100644
--- a/cli/src/main/java/org/jboss/as/cli/handlers/module/ASModuleHandler.java
+++ b/cli/src/main/java/org/jboss/as/cli/handlers/module/ASModuleHandler.java
@@ -243,7 +243,7 @@
         final String[] resourceArr = (resourcePaths == null) ? new String[0] : resourcePaths.split(pathDelimiter);
         File[] resourceFiles = new File[resourceArr.length];
         for(int i = 0; i < resourceArr.length; ++i) {
-            final File f = new File(ctx.getCurrentDir(), resourceArr[i]);
+            final File f = new File(resourceArr[i]);
             if(!f.exists()) {
                 throw new CommandLineException("Failed to locate " + f.getAbsolutePath());
             }
