diff --git a/src/org/traccar/BasePipelineFactory.java b/src/org/traccar/BasePipelineFactory.java
index 615251d..837712e 100644
--- a/src/org/traccar/BasePipelineFactory.java
+++ b/src/org/traccar/BasePipelineFactory.java
@@ -229,7 +229,7 @@
             pipeline.addLast("AlertEventHandler", alertEventHandler);
         }
 
-        if (alertEventHandler != null) {
+        if (ignitionEventHandler != null) {
             pipeline.addLast("IgnitionEventHandler", ignitionEventHandler);
         }
 
