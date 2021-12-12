diff --git a/domain/src/main/java/org/jboss/as/deployment/module/ClassifyingModuleLoaderService.java b/domain/src/main/java/org/jboss/as/deployment/module/ClassifyingModuleLoaderService.java
index 410d0aa..e891ce8 100644
--- a/domain/src/main/java/org/jboss/as/deployment/module/ClassifyingModuleLoaderService.java
+++ b/domain/src/main/java/org/jboss/as/deployment/module/ClassifyingModuleLoaderService.java
@@ -51,7 +51,7 @@
      *
      * @param context The start context
      */
-    public void start(StartContext context) throws StartException {
+    public synchronized void start(StartContext context) throws StartException {
         classifyingModuleLoader = new ClassifyingModuleLoader(delegates, Module.getCurrentLoader());
         Module.setModuleLoaderSelector(new SimpleModuleLoaderSelector(classifyingModuleLoader));
     }
