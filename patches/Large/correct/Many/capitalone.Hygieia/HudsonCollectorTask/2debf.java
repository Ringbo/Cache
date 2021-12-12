diff --git a/jenkins-build-collector/src/main/java/com/capitalone/dashboard/collector/HudsonCollectorTask.java b/jenkins-build-collector/src/main/java/com/capitalone/dashboard/collector/HudsonCollectorTask.java
index aab54c3..e82e970 100644
--- a/jenkins-build-collector/src/main/java/com/capitalone/dashboard/collector/HudsonCollectorTask.java
+++ b/jenkins-build-collector/src/main/java/com/capitalone/dashboard/collector/HudsonCollectorTask.java
@@ -86,7 +86,7 @@
      * @param collector the {@link HudsonCollector}
      */
 
-    @SuppressWarnings("PMD.AvoidDeeplyNestedIfStmts") // PMD is right, fixme
+    @SuppressWarnings("PMD.UnnecessaryFullyQualifiedName")
     private void clean(HudsonCollector collector) {
 
         // First delete jobs that will be no longer collected because servers have moved etc.
@@ -95,7 +95,7 @@
         for (com.capitalone.dashboard.model.Component comp : dbComponentRepository
                 .findAll()) {
             if (comp.getCollectorItems() == null
-                    || !comp.getCollectorItems().isEmpty()) continue;
+                    || comp.getCollectorItems().isEmpty()) continue;
             List<CollectorItem> itemList = comp.getCollectorItems().get(
                     CollectorType.Build);
             if (itemList == null) continue;
