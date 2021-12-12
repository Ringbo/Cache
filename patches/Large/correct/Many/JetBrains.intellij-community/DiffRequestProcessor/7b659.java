diff --git a/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java b/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
index b0ad3bb..9575e7f 100644
--- a/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
+++ b/platform/diff-impl/src/com/intellij/diff/impl/DiffRequestProcessor.java
@@ -654,7 +654,7 @@
         return;
       }
 
-      if (!isNavigationEnabled() || !hasNextChange()) return;
+      if (!isNavigationEnabled() || !hasPrevChange()) return;
 
       if (myIterationState != IterationState.PREV) {
         if (iterable != null) iterable.notify("Press again to go to the previous file");
