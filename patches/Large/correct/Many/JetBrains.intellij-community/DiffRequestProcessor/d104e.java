diff --git a/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java b/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
index 1a39c5b..0c66691 100644
--- a/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
+++ b/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
@@ -242,7 +242,7 @@
     IdRunnable task = new IdRunnable(this) {
       @Override
       public void run() {
-        if (myApplyData == null) return;
+        if (myApplyData == null || myDisposed) return;
         doApplyRequest(myApplyData.request, myApplyData.force, myApplyData.scrollToChangePolicy);
         myApplyData = null;
       }
