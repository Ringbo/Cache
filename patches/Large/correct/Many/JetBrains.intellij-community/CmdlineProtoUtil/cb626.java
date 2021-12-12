diff --git a/jps/jps-builders/src/org/jetbrains/jps/api/CmdlineProtoUtil.java b/jps/jps-builders/src/org/jetbrains/jps/api/CmdlineProtoUtil.java
index c093a8e..69f1002 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/api/CmdlineProtoUtil.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/api/CmdlineProtoUtil.java
@@ -155,10 +155,10 @@
     if (offset >= 0L) {
       builder.setProblemLocationOffset(offset);
     }
-    if (line > 0L) {
+    if (line >= 0L) {
       builder.setLine(line);
     }
-    if (column > 0L) {
+    if (column >= 0L) {
       builder.setColumn(column);
     }
     if (done >= 0.0f) {
