diff --git a/java/org/apache/coyote/AbstractProcessor.java b/java/org/apache/coyote/AbstractProcessor.java
index b9f7b53..35b7d93 100644
--- a/java/org/apache/coyote/AbstractProcessor.java
+++ b/java/org/apache/coyote/AbstractProcessor.java
@@ -78,11 +78,12 @@
     protected void setErrorState(ErrorState errorState, Throwable t) {
         boolean blockIo = this.errorState.isIoAllowed() && !errorState.isIoAllowed();
         this.errorState = this.errorState.getMostSevere(errorState);
-        if (blockIo && !ContainerThreadMarker.isContainerThread()) {
-            // The error occurred on a non-container thread which means not all
-            // of the necessary clean-up will have been completed. Dispatch to
-            // a container thread to do the clean-up. Need to do it this way to
-            // ensure that all the necessary clean-up is performed.
+        if (blockIo && !ContainerThreadMarker.isContainerThread() && isAsync()) {
+            // The error occurred on a non-container thread during async
+            // processing which means not all of the necessary clean-up will
+            // have been completed. Dispatch to a container thread to do the
+            // clean-up. Need to do it this way to ensure that all the necessary
+            // clean-up is performed.
             if (response.getStatus() < 400) {
                 response.setStatus(500);
             }
