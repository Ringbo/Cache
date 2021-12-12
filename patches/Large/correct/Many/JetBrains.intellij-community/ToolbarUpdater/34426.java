diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ToolbarUpdater.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ToolbarUpdater.java
index 9c28956..6bcfe8b 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ToolbarUpdater.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ToolbarUpdater.java
@@ -184,7 +184,7 @@
       ToolbarUpdater updater = myUpdaterRef.get();
       if (updater == null) return;
 
-      if (!updater.myComponent.isShowing() && !ApplicationManager.getApplication().isUnitTestMode()) {
+      if (!updater.myComponent.isVisible() && !ApplicationManager.getApplication().isUnitTestMode()) {
         return;
       }
 
