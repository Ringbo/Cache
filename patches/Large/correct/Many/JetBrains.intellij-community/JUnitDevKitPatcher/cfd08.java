diff --git a/plugins/devkit/src/run/JUnitDevKitPatcher.java b/plugins/devkit/src/run/JUnitDevKitPatcher.java
index 94ef585..2b086f8 100644
--- a/plugins/devkit/src/run/JUnitDevKitPatcher.java
+++ b/plugins/devkit/src/run/JUnitDevKitPatcher.java
@@ -15,7 +15,7 @@
 
   public void patchJavaParameters(JavaParameters javaParameters) {
     final ProjectJdk jdk = javaParameters.getJdk();
-    if (!(jdk.getSdkType() instanceof IdeaJdk)) {
+    if (jdk == null || !(jdk.getSdkType() instanceof IdeaJdk)) {
       return;
     }
     String libPath = jdk.getHomePath() + File.separator + "lib";
