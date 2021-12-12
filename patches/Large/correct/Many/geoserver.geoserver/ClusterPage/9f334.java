diff --git a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/web/ClusterPage.java b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/web/ClusterPage.java
index 68b6472..b0a520c 100644
--- a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/web/ClusterPage.java
+++ b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/web/ClusterPage.java
@@ -55,27 +55,28 @@
 
         // add broker URL setting
         final TextField<String> brokerURL = new TextField<String>(
-                BrokerConfiguration.BROKER_URL_KEY);
+                BrokerConfiguration.BROKER_URL_KEY, String.class);
         form.add(brokerURL);
 
         // add group name setting
         final TextField<String> instanceName = new TextField<String>(
-                JMSConfiguration.INSTANCE_NAME_KEY);
+                JMSConfiguration.INSTANCE_NAME_KEY, String.class);
         form.add(instanceName);
         
         // add instance name setting
         final TextField<String> group = new TextField<String>(
-                JMSConfiguration.GROUP_KEY);
+                JMSConfiguration.GROUP_KEY, String.class);
         form.add(group);
 
         // add topic name setting
-        final TextField<String> topicName = new TextField<String>(TopicConfiguration.TOPIC_NAME_KEY);
+        final TextField<String> topicName = new TextField<String>(
+                TopicConfiguration.TOPIC_NAME_KEY, String.class);
         topicName.setType(String.class);
         form.add(topicName);
 
         // add connection status info
         final TextField<String> connectionInfo = new TextField<String>(
-                ConnectionConfiguration.CONNECTION_KEY);
+                ConnectionConfiguration.CONNECTION_KEY, String.class);
 
         // https://issues.apache.org/jira/browse/WICKET-2426
         connectionInfo.setType(String.class);
@@ -256,7 +257,7 @@
     private void addToggle(final String configKey, final ToggleType type, final String textFieldId,
             final String buttonId, final Form<?> form, final FeedbackPanel fp) {
 
-        final TextField<String> toggleInfo = new TextField<String>(textFieldId);
+        final TextField<String> toggleInfo = new TextField<String>(textFieldId, String.class);
 
         // https://issues.apache.org/jira/browse/WICKET-2426
         // toggleInfo.setType(String.class);
