diff --git a/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningFlowMetric.java b/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningFlowMetric.java
index 6f47f76..0db4363 100644
--- a/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningFlowMetric.java
+++ b/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningFlowMetric.java
@@ -25,7 +25,7 @@
 public class NumRunningFlowMetric extends AbstractMetric<Integer> {
   public static final String NUM_RUNNING_FLOW_METRIC_NAME = "NumRunningFlowMetric";
   public static final String NUM_RUNNING_FLOW_METRIC_TYPE = "uint16";
-  private static final int NUM_RUNNING_FLOW_INTERVAL = 60 * 1000; //milliseconds
+  private static final int NUM_RUNNING_FLOW_INTERVAL = 5 * 1000; //milliseconds TODO: increase frequency
 
   private FlowRunnerManager flowManager;
   private Timer timer = new Timer();
@@ -46,7 +46,7 @@
 
   }
 
-  public void UpdateValueAndNotifyManager() {
+  public synchronized void UpdateValueAndNotifyManager() {
     value = flowManager.getNumRunningFlows();
     notifyManager();
   }
