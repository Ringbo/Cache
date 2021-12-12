diff --git a/platform/platform-api/src/com/intellij/openapi/vfs/VirtualFile.java b/platform/platform-api/src/com/intellij/openapi/vfs/VirtualFile.java
index c8631df..38d98e3 100644
--- a/platform/platform-api/src/com/intellij/openapi/vfs/VirtualFile.java
+++ b/platform/platform-api/src/com/intellij/openapi/vfs/VirtualFile.java
@@ -603,7 +603,7 @@
     if (modalityState != ModalityState.NON_MODAL) {
       LOG.error("Refresh with non-modal modality state is not implemented for file: " + this);
     }
-    refresh(asynchronous, recursive, postRunnable, ModalityState.NON_MODAL);
+    refresh(asynchronous, recursive, postRunnable);
   }
 
   public String getPresentableName() {
