diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/ZkWorker.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/ZkWorker.java
index a20e324..3c65cc9 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/ZkWorker.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/ZkWorker.java
@@ -85,7 +85,7 @@
     return worker;
   }
 
-  @JsonProperty
+  @JsonProperty("runningTasks")
   public Map<String, TaskStatus> getRunningTasks()
   {
     Map<String, TaskStatus> retVal = Maps.newHashMap();
@@ -99,8 +99,8 @@
     return retVal;
   }
 
-  @JsonProperty("currCapacity")
-  public int getCurrCapacity()
+  @JsonProperty("currCapacityUsed")
+  public int getCurrCapacityUsed()
   {
     int currCapacity = 0;
     for (TaskStatus taskStatus : getRunningTasks().values()) {
@@ -132,12 +132,12 @@
 
   public boolean isAtCapacity()
   {
-    return getCurrCapacity() >= worker.getCapacity();
+    return getCurrCapacityUsed() >= worker.getCapacity();
   }
 
   public boolean canRunTask(Task task)
   {
-    return (worker.getCapacity() - getCurrCapacity() >= task.getTaskResource().getRequiredCapacity()
+    return (worker.getCapacity() - getCurrCapacityUsed() >= task.getTaskResource().getRequiredCapacity()
             && !getAvailabilityGroups().contains(task.getTaskResource().getAvailabilityGroup()));
   }
 
