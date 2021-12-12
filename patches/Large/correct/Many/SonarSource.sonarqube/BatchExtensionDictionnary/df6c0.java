diff --git a/sonar-batch/src/main/java/org/sonar/batch/bootstrap/BatchExtensionDictionnary.java b/sonar-batch/src/main/java/org/sonar/batch/bootstrap/BatchExtensionDictionnary.java
index 17de993..e2f074b 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/bootstrap/BatchExtensionDictionnary.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/bootstrap/BatchExtensionDictionnary.java
@@ -78,7 +78,7 @@
     return result;
   }
 
-  private Phase.Name evaluatePhase(Object extension) {
+  private static Phase.Name evaluatePhase(Object extension) {
     Object extensionToEvaluate;
     if (extension instanceof SensorWrapper) {
       extensionToEvaluate = ((SensorWrapper) extension).wrappedSensor();
@@ -172,7 +172,7 @@
     return result;
   }
 
-  private void completePhaseDependencies(DirectAcyclicGraph dag, Object extension) {
+  private static void completePhaseDependencies(DirectAcyclicGraph dag, Object extension) {
     Phase.Name phase = evaluatePhase(extension);
     dag.add(extension, phase);
     for (Phase.Name name : Phase.Name.values()) {
