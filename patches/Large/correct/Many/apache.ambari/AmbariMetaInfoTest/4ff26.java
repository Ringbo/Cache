diff --git a/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java b/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
index 14c66a2..86ff0c9 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
@@ -1736,7 +1736,7 @@
 
     AlertDefinitionDAO dao = injector.getInstance(AlertDefinitionDAO.class);
     List<AlertDefinitionEntity> definitions = dao.findAll(clusterId);
-    assertEquals(9, definitions.size());
+    assertEquals(10, definitions.size());
 
     // figure out how many of these alerts were merged into from the
     // non-stack alerts.json
@@ -1749,7 +1749,7 @@
     }
 
     assertEquals(1, hostAlertCount);
-    assertEquals(8, definitions.size() - hostAlertCount);
+    assertEquals(9, definitions.size() - hostAlertCount);
 
     for (AlertDefinitionEntity definition : definitions) {
       definition.setScheduleInterval(28);
@@ -1759,7 +1759,7 @@
     metaInfo.reconcileAlertDefinitions(clusters);
 
     definitions = dao.findAll();
-    assertEquals(9, definitions.size());
+    assertEquals(10, definitions.size());
 
     for (AlertDefinitionEntity definition : definitions) {
       assertEquals(28, definition.getScheduleInterval().intValue());
@@ -1768,7 +1768,7 @@
     // find all enabled for the cluster should find 6 (the ones from HDFS;
     // it will not find the agent alert since it's not bound to the cluster)
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(8, definitions.size());
+    assertEquals(9, definitions.size());
 
     // create new definition
     AlertDefinitionEntity entity = new AlertDefinitionEntity();
@@ -1787,19 +1787,19 @@
 
     // verify the new definition is found (6 HDFS + 1 new one)
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(9, definitions.size());
+    assertEquals(10, definitions.size());
 
     // reconcile, which should disable our bad definition
     metaInfo.reconcileAlertDefinitions(clusters);
 
     // find all enabled for the cluster should find 6
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(8, definitions.size());
+    assertEquals(9, definitions.size());
 
     // find all should find 6 HDFS + 1 disabled + 1 agent alert + 2 server
     // alerts
     definitions = dao.findAll();
-    assertEquals(10, definitions.size());
+    assertEquals(11, definitions.size());
 
     entity = dao.findById(entity.getDefinitionId());
     assertFalse(entity.getEnabled());
