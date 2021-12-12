diff --git a/runners/core-java/src/test/java/org/apache/beam/runners/core/triggers/TriggerStateMachinesTest.java b/runners/core-java/src/test/java/org/apache/beam/runners/core/triggers/TriggerStateMachinesTest.java
index 497a3c2..7ff3478 100644
--- a/runners/core-java/src/test/java/org/apache/beam/runners/core/triggers/TriggerStateMachinesTest.java
+++ b/runners/core-java/src/test/java/org/apache/beam/runners/core/triggers/TriggerStateMachinesTest.java
@@ -84,7 +84,7 @@
   public void testStateMachineForAfterWatermark() {
     RunnerApi.Trigger trigger =
         RunnerApi.Trigger.newBuilder()
-            .setAfterEndOfWidow(RunnerApi.Trigger.AfterEndOfWindow.getDefaultInstance())
+            .setAfterEndOfWindow(RunnerApi.Trigger.AfterEndOfWindow.getDefaultInstance())
             .build();
     AfterWatermarkStateMachine.FromEndOfWindow machine =
         (AfterWatermarkStateMachine.FromEndOfWindow)
@@ -197,7 +197,7 @@
   public void testAfterWatermarkEarlyTranslation() {
     RunnerApi.Trigger trigger =
         RunnerApi.Trigger.newBuilder()
-            .setAfterEndOfWidow(
+            .setAfterEndOfWindow(
                 RunnerApi.Trigger.AfterEndOfWindow.newBuilder().setEarlyFirings(subtrigger1))
             .build();
     AfterWatermarkStateMachine.AfterWatermarkEarlyAndLate machine =
@@ -213,7 +213,7 @@
   public void testAfterWatermarkEarlyLateTranslation() {
     RunnerApi.Trigger trigger =
         RunnerApi.Trigger.newBuilder()
-            .setAfterEndOfWidow(
+            .setAfterEndOfWindow(
                 RunnerApi.Trigger.AfterEndOfWindow.newBuilder()
                     .setEarlyFirings(subtrigger1)
                     .setLateFirings(subtrigger2))
