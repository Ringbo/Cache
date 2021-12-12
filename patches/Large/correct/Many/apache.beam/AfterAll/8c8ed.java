diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterAll.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterAll.java
index e76c14b..a404546 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterAll.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterAll.java
@@ -76,11 +76,11 @@
     // trigger itself was already finished in some window.
     // FIRE_AND_FINISH otherwise: It means this trigger is ready to fire (because all subtriggers
     // are satisfied) but has never fired as a whole.
-    boolean anyContinue = true;
+    boolean anyContinue = false;
     boolean alreadyFinished = true;
     for (ExecutableTrigger<W> subTrigger : c.trigger().subTriggers()) {
       MergeResult result = subTrigger.invokeMerge(c);
-      anyContinue |= !(result.isFire() && result.isFinish());
+      anyContinue |= !result.isFire() && !result.isFinish();
       alreadyFinished &= !result.isFire() && result.isFinish();
     }
 
