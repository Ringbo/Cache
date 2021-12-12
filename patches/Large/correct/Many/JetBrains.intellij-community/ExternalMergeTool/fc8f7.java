diff --git a/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalMergeTool.java b/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalMergeTool.java
index c47ee15..de2d5a3 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalMergeTool.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/external/ExternalMergeTool.java
@@ -56,7 +56,7 @@
     catch (ProcessCanceledException ignore) {
     }
     catch (Throwable e) {
-      LOG.error(e);
+      LOG.warn(e);
       Messages.showErrorDialog(project, e.getMessage(), "Can't Show Merge In External Tool");
     }
   }
