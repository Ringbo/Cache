diff --git a/server/sonar-server/src/main/java/org/sonar/server/computation/step/PersistMeasuresStep.java b/server/sonar-server/src/main/java/org/sonar/server/computation/step/PersistMeasuresStep.java
index b28e155..5ad32bb 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/computation/step/PersistMeasuresStep.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/computation/step/PersistMeasuresStep.java
@@ -93,8 +93,7 @@
     protected void visitAny(Component component) {
       int componentRef = component.getRef();
       List<BatchReport.Measure> measures = reportReader.readComponentMeasures(componentRef);
-      persistMeasures(measures, dbIdsRepository.getComponentId(component), dbIdsRepository.getComponentId(component));
-
+      persistMeasures(measures, dbIdsRepository.getComponentId(component), dbIdsRepository.getSnapshotId(component));
     }
 
     private void persistMeasures(List<BatchReport.Measure> batchReportMeasures, long componentId, long snapshotId) {
