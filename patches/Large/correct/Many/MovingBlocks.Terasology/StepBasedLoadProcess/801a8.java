diff --git a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/StepBasedLoadProcess.java b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/StepBasedLoadProcess.java
index 6cb1458..7e920b1 100644
--- a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/StepBasedLoadProcess.java
+++ b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/StepBasedLoadProcess.java
@@ -23,14 +23,14 @@
 public abstract class StepBasedLoadProcess implements LoadProcess {
 
     private int stepsComplete;
-    private int totalSteps;
+    private int totalSteps = 1;
 
     protected void stepDone() {
         stepsComplete++;
     }
 
     protected void setTotalSteps(int amount) {
-        this.totalSteps = Math.min(1, amount);
+        this.totalSteps = Math.max(1, amount);
     }
 
     @Override
