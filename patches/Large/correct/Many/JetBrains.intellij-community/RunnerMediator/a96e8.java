diff --git a/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java b/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
index cd695c1..ab35892 100644
--- a/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
+++ b/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
@@ -220,7 +220,7 @@
           return true;
         }
         else if (canSendSignals()) {
-          sendSigInt(myProcessUid);
+          sendSigKill(myProcessUid);
           return true;
         }
         else {
