diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/sequence/SequenceActor.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/sequence/SequenceActor.java
index 3cf9d18..691b782 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/sequence/SequenceActor.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/sequence/SequenceActor.java
@@ -91,7 +91,7 @@
 
     @Deprecated
     private void onExecuteAfter(ExecuteAfter after) {
-        if (after.getSeq() <= this.seq) {
+        if (after.getSeq() <= this.finishedSeq) {
             after.getRunnable().run();
         } else {
             pendingRunnables.add(after);
