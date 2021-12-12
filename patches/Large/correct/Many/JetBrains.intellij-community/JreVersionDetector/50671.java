diff --git a/execution/impl/com/intellij/execution/util/JreVersionDetector.java b/execution/impl/com/intellij/execution/util/JreVersionDetector.java
index 2dc6ab4..6057230 100644
--- a/execution/impl/com/intellij/execution/util/JreVersionDetector.java
+++ b/execution/impl/com/intellij/execution/util/JreVersionDetector.java
@@ -35,7 +35,7 @@
       return myLastIsJre50;
     } else {
       final Module module = configuration.getConfigurationModule().getModule();
-      if (module != null) {
+      if (module != null && !module.isDisposed()) {
         final ModuleRootManager rootManager = ModuleRootManager.getInstance(module);
         final ProjectJdk jdk = rootManager.getJdk();
         if (jdk == null) return false;
