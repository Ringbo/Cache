diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/job/GridJobProcessor.java b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/job/GridJobProcessor.java
index 4511c95..56b1e68 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/job/GridJobProcessor.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/job/GridJobProcessor.java
@@ -1004,7 +1004,7 @@
                     catch (GridException e) {
                         GridException ex = new GridException("Failed to deserialize task attributes [taskName=" +
                             req.getTaskName() + ", taskClsName=" + req.getTaskClassName() + ", codeVer=" +
-                            req.getUserVersion() + ", taskClsLdr=" + dep.classLoader() + ']');
+                            req.getUserVersion() + ", taskClsLdr=" + dep.classLoader() + ']', e);
 
                         U.error(log, ex.getMessage(), e);
 
