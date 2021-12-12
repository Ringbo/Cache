diff --git a/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java b/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
index de56def..87f8af1 100644
--- a/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
+++ b/platform/platform-impl/src/com/intellij/execution/process/RunnerMediator.java
@@ -157,9 +157,9 @@
     }
 
     @Override
-    protected void doDestroyProcess() {
+    protected void destroyProcessImpl() {
       if (!RunnerMediator.destroyProcess(getProcess())) {
-        super.doDestroyProcess();
+        super.destroyProcessImpl();
       }
     }
   }
