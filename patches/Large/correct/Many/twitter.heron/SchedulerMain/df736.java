diff --git a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SchedulerMain.java b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SchedulerMain.java
index 1fa8b47..3a02e73 100644
--- a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SchedulerMain.java
+++ b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/SchedulerMain.java
@@ -62,7 +62,7 @@
   public SchedulerMain(
       Config config,
       TopologyAPI.Topology topology,
-      int schedulerServerPort) throws IOException {
+      int schedulerServerPort) {
     // initialize the options
     this.config = config;
     this.topology = topology;
