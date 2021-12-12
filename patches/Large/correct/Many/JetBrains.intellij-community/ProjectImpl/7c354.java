diff --git a/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java b/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
index d1ce66c..40ee1f5 100644
--- a/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
@@ -288,7 +288,9 @@
     long time = System.currentTimeMillis() - start;
     LOG.info(getComponentConfigCount() + " project components initialized in " + time + " ms");
 
-    if (!isDefault() && !ApplicationManager.getApplication().isUnitTestMode()) {
+    if (!isDefault() &&
+        !ApplicationManager.getApplication().isUnitTestMode() &&
+        !ApplicationManager.getApplication().isHeadlessEnvironment()) {
       distributeProgress();
     }
     ApplicationManager.getApplication().getMessageBus().syncPublisher(ProjectLifecycleListener.TOPIC).projectComponentsInitialized(this);
