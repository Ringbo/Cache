diff --git a/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java b/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
index f1af66f..9ff7def 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/api/services/AmbariMetaInfoTest.java
@@ -1935,7 +1935,7 @@
 
     AlertDefinitionDAO dao = injector.getInstance(AlertDefinitionDAO.class);
     List<AlertDefinitionEntity> definitions = dao.findAll(clusterId);
-    assertEquals(11, definitions.size());
+    assertEquals(12, definitions.size());
 
     // figure out how many of these alerts were merged into from the
     // non-stack alerts.json
@@ -1947,7 +1947,7 @@
       }
     }
 
-    assertEquals(2, hostAlertCount);
+    assertEquals(3, hostAlertCount);
     assertEquals(9, definitions.size() - hostAlertCount);
 
     for (AlertDefinitionEntity definition : definitions) {
@@ -1958,7 +1958,7 @@
     metaInfo.reconcileAlertDefinitions(clusters);
 
     definitions = dao.findAll();
-    assertEquals(11, definitions.size());
+    assertEquals(12, definitions.size());
 
     for (AlertDefinitionEntity definition : definitions) {
       assertEquals(28, definition.getScheduleInterval().intValue());
@@ -1967,7 +1967,7 @@
     // find all enabled for the cluster should find 6 (the ones from HDFS;
     // it will not find the agent alert since it's not bound to the cluster)
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(10, definitions.size());
+    assertEquals(11, definitions.size());
 
     // create new definition
     AlertDefinitionEntity entity = new AlertDefinitionEntity();
@@ -1986,19 +1986,19 @@
 
     // verify the new definition is found (6 HDFS + 1 new one)
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(11, definitions.size());
+    assertEquals(12, definitions.size());
 
     // reconcile, which should disable our bad definition
     metaInfo.reconcileAlertDefinitions(clusters);
 
     // find all enabled for the cluster should find 6
     definitions = dao.findAllEnabled(cluster.getClusterId());
-    assertEquals(10, definitions.size());
+    assertEquals(11, definitions.size());
 
     // find all should find 6 HDFS + 1 disabled + 1 agent alert + 2 server
     // alerts
     definitions = dao.findAll();
-    assertEquals(12, definitions.size());
+    assertEquals(13, definitions.size());
 
     entity = dao.findById(entity.getDefinitionId());
     assertFalse(entity.getEnabled());
