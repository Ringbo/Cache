diff --git a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SubmitterMain.java b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SubmitterMain.java
index d145516..c69ddc9 100644
--- a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SubmitterMain.java
+++ b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SubmitterMain.java
@@ -493,7 +493,7 @@
         .put(Key.TOPOLOGY_DEFINITION,
             cloneWithNewNumContainers(initialTopology, packingNumStreamManagers));
 
-    String packingClass = Context.packingClass(initialConfig);
+    String packingClass = Context.packingClass(config);
     LOG.warning(String.format("The packing plan (generated by %s) calls for a different number of "
             + "containers (%d) than what was explicitly set in the topology configs (%d). "
             + "Overriding the configs to specify %d containers. When using %s do not explicitly "
