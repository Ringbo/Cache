diff --git a/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java b/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
index 9d58b94..80ab0fe 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
@@ -66,7 +66,7 @@
   public void testLoadingServertAlerts() {
     AmbariServiceAlertDefinitions ambariServiceAlertDefinitions = m_injector.getInstance(AmbariServiceAlertDefinitions.class);
     List<AlertDefinition> definitions = ambariServiceAlertDefinitions.getServerDefinitions();
-    Assert.assertEquals(2, definitions.size());
+    Assert.assertEquals(3, definitions.size());
 
     for (AlertDefinition definition : definitions) {
       Assert.assertEquals(Components.AMBARI_SERVER.name(),
