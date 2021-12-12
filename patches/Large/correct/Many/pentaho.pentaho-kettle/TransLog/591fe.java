diff --git a/src-ui/org/pentaho/di/ui/spoon/trans/TransLog.java b/src-ui/org/pentaho/di/ui/spoon/trans/TransLog.java
index b64b2f2..9350c63 100644
--- a/src-ui/org/pentaho/di/ui/spoon/trans/TransLog.java
+++ b/src-ui/org/pentaho/di/ui/spoon/trans/TransLog.java
@@ -465,7 +465,7 @@
 	}
     
     private void showStepPerformanceGraph() {
-    	if (trans.getStepPerformanceSnapShots()!=null) {
+    	if (trans!=null && trans.getStepPerformanceSnapShots()!=null) {
 			StepPerformanceSnapShotDialog dialog = new StepPerformanceSnapShotDialog(
 				shell, 
 				transMeta.getName(), 
