diff --git a/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java b/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
index cbc5e69..7378b8c 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/metadata/AgentAlertDefinitionsTest.java
@@ -60,7 +60,7 @@
   public void testLoadingAgentHostAlerts() {
     AmbariServiceAlertDefinitions ambariServiceAlertDefinitions = m_injector.getInstance(AmbariServiceAlertDefinitions.class);
     List<AlertDefinition> definitions = ambariServiceAlertDefinitions.getAgentDefinitions();
-    Assert.assertEquals(2, definitions.size());
+    Assert.assertEquals(3, definitions.size());
 
     for( AlertDefinition definition : definitions){
       Assert.assertEquals(Components.AMBARI_AGENT.name(),
