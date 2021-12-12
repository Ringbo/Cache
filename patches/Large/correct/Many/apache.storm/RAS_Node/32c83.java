diff --git a/storm-core/src/jvm/org/apache/storm/scheduler/resource/RAS_Node.java b/storm-core/src/jvm/org/apache/storm/scheduler/resource/RAS_Node.java
index 0bb36e8..f3ffa45 100644
--- a/storm-core/src/jvm/org/apache/storm/scheduler/resource/RAS_Node.java
+++ b/storm-core/src/jvm/org/apache/storm/scheduler/resource/RAS_Node.java
@@ -250,7 +250,7 @@
     private void freeCPU(double amount) {
         LOG.debug("freeing {} CPU on node...avail CPU: {}", amount, getHostname(), _availCPU);
         if ((_availCPU + amount) > getTotalCpuResources()) {
-            LOG.warn("Freeing more CPU than there exists! CPU trying to free: {} Total CPU on Node: {}", (_availMemory + amount), getTotalCpuResources());
+            LOG.warn("Freeing more CPU than there exists! CPU trying to free: {} Total CPU on Node: {}", (_availCPU + amount), getTotalCpuResources());
             return;
         }
         _availCPU += amount;
