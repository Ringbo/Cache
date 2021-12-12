diff --git a/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalDiffTool.java b/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalDiffTool.java
index 7a7ced9..65d610d 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalDiffTool.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalDiffTool.java
@@ -94,7 +94,7 @@
     catch (ProcessCanceledException ignore) {
     }
     catch (Throwable e) {
-      LOG.error(e);
+      LOG.warn(e);
       Messages.showErrorDialog(project, e.getMessage(), "Can't Show Diff In External Tool");
     }
   }
