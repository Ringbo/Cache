diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/ChunkOutputFrame.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/ChunkOutputFrame.java
index 68e0444..e025026 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/ChunkOutputFrame.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/ChunkOutputFrame.java
@@ -96,7 +96,7 @@
          {
             Element body = getDocument().getBody();
 
-            if (body.getChildCount() > 0) {
+            if (body != null && body.getChildCount() > 0) {
                command.execute();
             } else if (retryCount_ < 50) {
                retryCount_++;
