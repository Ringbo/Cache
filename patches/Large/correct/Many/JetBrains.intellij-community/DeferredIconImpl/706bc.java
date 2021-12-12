diff --git a/platform/lang-impl/src/com/intellij/ui/DeferredIconImpl.java b/platform/lang-impl/src/com/intellij/ui/DeferredIconImpl.java
index e84957f..d0480d0 100644
--- a/platform/lang-impl/src/com/intellij/ui/DeferredIconImpl.java
+++ b/platform/lang-impl/src/com/intellij/ui/DeferredIconImpl.java
@@ -127,7 +127,7 @@
               setDone(result);
 
               Component actualTarget = target.get();
-              if (SwingUtilities.getWindowAncestor(actualTarget) == null) {
+              if (actualTarget != null && SwingUtilities.getWindowAncestor(actualTarget) == null) {
                 actualTarget = paintingParent.get();
                 if (actualTarget == null || SwingUtilities.getWindowAncestor(actualTarget) == null) {
                   actualTarget = null;
