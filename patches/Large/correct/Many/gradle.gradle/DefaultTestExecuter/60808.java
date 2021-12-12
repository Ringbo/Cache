diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/detection/DefaultTestExecuter.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/detection/DefaultTestExecuter.java
index c09ba36..d2b87db 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/detection/DefaultTestExecuter.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/detection/DefaultTestExecuter.java
@@ -37,11 +37,11 @@
  */
 public class DefaultTestExecuter implements TestExecuter {
     private final Factory<WorkerProcessBuilder> workerFactory;
-    private final ActorFactory actorFactor;
+    private final ActorFactory actorFactory;
 
-    public DefaultTestExecuter(Factory<WorkerProcessBuilder> workerFactory, ActorFactory actorFactor) {
+    public DefaultTestExecuter(Factory<WorkerProcessBuilder> workerFactory, ActorFactory actorFactory) {
         this.workerFactory = workerFactory;
-        this.actorFactor = actorFactor;
+        this.actorFactory = actorFactory;
     }
 
     public void execute(final Test testTask, TestResultProcessor testResultProcessor) {
@@ -60,7 +60,7 @@
         };
 
         TestClassProcessor processor = new MaxNParallelTestClassProcessor(testTask.getMaxParallelForks(),
-            reforkingProcessorFactory, actorFactor);
+            reforkingProcessorFactory, actorFactory);
 
         final FileTree testClassFiles = testTask.getCandidateClassFiles();
 
