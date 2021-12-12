diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Triggers.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Triggers.java
index d788ca2..ec82114 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Triggers.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Triggers.java
@@ -86,7 +86,7 @@
 
     private RunnerApi.Trigger convertSpecific(AfterWatermark.FromEndOfWindow v) {
       return RunnerApi.Trigger.newBuilder()
-          .setAfterEndOfWidow(RunnerApi.Trigger.AfterEndOfWindow.newBuilder())
+          .setAfterEndOfWindow(RunnerApi.Trigger.AfterEndOfWindow.newBuilder())
           .build();
     }
 
@@ -158,7 +158,7 @@
         builder.setLateFirings(toProto(v.getLateTrigger()));
       }
 
-      return RunnerApi.Trigger.newBuilder().setAfterEndOfWidow(builder).build();
+      return RunnerApi.Trigger.newBuilder().setAfterEndOfWindow(builder).build();
     }
 
     private RunnerApi.Trigger convertSpecific(AfterEach v) {
@@ -231,8 +231,8 @@
       case AFTER_EACH:
         return AfterEach.inOrder(
             protosToTriggers(triggerProto.getAfterEach().getSubtriggersList()));
-      case AFTER_END_OF_WIDOW:
-        RunnerApi.Trigger.AfterEndOfWindow eowProto = triggerProto.getAfterEndOfWidow();
+      case AFTER_END_OF_WINDOW:
+        RunnerApi.Trigger.AfterEndOfWindow eowProto = triggerProto.getAfterEndOfWindow();
 
         if (!eowProto.hasEarlyFirings() && !eowProto.hasLateFirings()) {
           return AfterWatermark.pastEndOfWindow();
@@ -240,18 +240,18 @@
 
         // It either has early or late firings or both; our typing in Java makes this a smidge
         // annoying
-        if (triggerProto.getAfterEndOfWidow().hasEarlyFirings()) {
+        if (triggerProto.getAfterEndOfWindow().hasEarlyFirings()) {
           AfterWatermarkEarlyAndLate trigger =
               AfterWatermark.pastEndOfWindow()
                   .withEarlyFirings(
                       (OnceTrigger)
-                          fromProto(triggerProto.getAfterEndOfWidow().getEarlyFirings()));
+                          fromProto(triggerProto.getAfterEndOfWindow().getEarlyFirings()));
 
-          if (triggerProto.getAfterEndOfWidow().hasLateFirings()) {
+          if (triggerProto.getAfterEndOfWindow().hasLateFirings()) {
             trigger =
                 trigger.withLateFirings(
                     (OnceTrigger)
-                        fromProto(triggerProto.getAfterEndOfWidow().getLateFirings()));
+                        fromProto(triggerProto.getAfterEndOfWindow().getLateFirings()));
           }
           return trigger;
         } else {
