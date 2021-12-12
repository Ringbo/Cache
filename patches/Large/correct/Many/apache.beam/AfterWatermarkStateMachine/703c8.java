diff --git a/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/AfterWatermarkStateMachine.java b/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/AfterWatermarkStateMachine.java
index 5ad6214..524c057 100644
--- a/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/AfterWatermarkStateMachine.java
+++ b/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/AfterWatermarkStateMachine.java
@@ -93,11 +93,11 @@
       this.lateTrigger = lateTrigger;
     }
 
-    public TriggerStateMachine withEarlyFirings(OnceTriggerStateMachine earlyTrigger) {
+    public AfterWatermarkEarlyAndLate withEarlyFirings(OnceTriggerStateMachine earlyTrigger) {
       return new AfterWatermarkEarlyAndLate(earlyTrigger, lateTrigger);
     }
 
-    public TriggerStateMachine withLateFirings(OnceTriggerStateMachine lateTrigger) {
+    public AfterWatermarkEarlyAndLate withLateFirings(OnceTriggerStateMachine lateTrigger) {
       return new AfterWatermarkEarlyAndLate(earlyTrigger, lateTrigger);
     }
 
