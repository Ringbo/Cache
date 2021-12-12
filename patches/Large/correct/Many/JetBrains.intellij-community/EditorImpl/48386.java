diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 0f619c7..b69f7d1 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -1517,7 +1517,7 @@
     assertIsDispatchThread();
     if (!updatingSize) {
       updatingSize = true;
-      SwingUtilities.invokeLater(() -> {
+      ApplicationManager.getApplication().invokeLater(() -> {
         try {
           if (!isDisposed()) {
             myGutterComponent.updateSize();
@@ -1526,7 +1526,7 @@
         finally {
           updatingSize = false;
         }
-      });
+      }, __->isDisposed());
     }
   }
 
@@ -1613,7 +1613,7 @@
 
   public void stopDumbLater() {
     if (ApplicationManager.getApplication().isUnitTestMode()) return;
-    ApplicationManager.getApplication().invokeLater(this::stopDumb, ModalityState.current());
+    ApplicationManager.getApplication().invokeLater(this::stopDumb, ModalityState.current(), __ -> isDisposed());
   }
 
   private void stopDumb() {
