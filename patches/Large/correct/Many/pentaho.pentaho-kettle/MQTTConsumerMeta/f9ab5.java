diff --git a/plugins/streaming/impls/mqtt/src/main/java/org/pentaho/di/trans/step/mqtt/MQTTConsumerMeta.java b/plugins/streaming/impls/mqtt/src/main/java/org/pentaho/di/trans/step/mqtt/MQTTConsumerMeta.java
index e48c15a..8b16131 100644
--- a/plugins/streaming/impls/mqtt/src/main/java/org/pentaho/di/trans/step/mqtt/MQTTConsumerMeta.java
+++ b/plugins/streaming/impls/mqtt/src/main/java/org/pentaho/di/trans/step/mqtt/MQTTConsumerMeta.java
@@ -195,27 +195,27 @@
     this.mqttServer = mqttServer;
   }
 
-  List<String> getTopics() {
+  public List<String> getTopics() {
     return topics;
   }
 
-  void setTopics( List<String> topics ) {
+  public void setTopics( List<String> topics ) {
     this.topics = topics;
   }
 
-  String getMsgOutputName() {
+  public String getMsgOutputName() {
     return msgOutputName;
   }
 
-  void setMsgOutputName( String msgOutputName ) {
+  public void setMsgOutputName( String msgOutputName ) {
     this.msgOutputName = msgOutputName;
   }
 
-  String getTopicOutputName() {
+  public String getTopicOutputName() {
     return topicOutputName;
   }
 
-  void setTopicOutputName( String topicOutputName ) {
+  public void setTopicOutputName( String topicOutputName ) {
     this.topicOutputName = topicOutputName;
   }
 
@@ -243,84 +243,84 @@
     this.password = password;
   }
 
-  Map<String, String> getSslConfig() {
+  public Map<String, String> getSslConfig() {
     return conf( sslKeys, sslValues ).asMap();
   }
 
-  void setSslConfig( Map<String, String> sslConfig ) {
+  public void setSslConfig( Map<String, String> sslConfig ) {
     sslKeys = conf( sslConfig ).keys();
     sslValues = conf( sslConfig ).vals();
   }
 
-  boolean isUseSsl() {
+  public boolean isUseSsl() {
     return useSsl;
   }
 
-  void setUseSsl( boolean useSsl ) {
+  public void setUseSsl( boolean useSsl ) {
     this.useSsl = useSsl;
   }
 
-  String getKeepAliveInterval() {
+  public String getKeepAliveInterval() {
     return keepAliveInterval;
   }
 
-  void setKeepAliveInterval( String keepAliveInterval ) {
+  public void setKeepAliveInterval( String keepAliveInterval ) {
     this.keepAliveInterval = keepAliveInterval;
   }
 
-  String getMaxInflight() {
+  public String getMaxInflight() {
     return maxInflight;
   }
 
-  void setMaxInflight( String maxInflight ) {
+  public void setMaxInflight( String maxInflight ) {
     this.maxInflight = maxInflight;
   }
 
-  String getConnectionTimeout() {
+  public String getConnectionTimeout() {
     return connectionTimeout;
   }
 
-  void setConnectionTimeout( String connectionTimeout ) {
+  public void setConnectionTimeout( String connectionTimeout ) {
     this.connectionTimeout = connectionTimeout;
   }
 
-  String getCleanSession() {
+  public String getCleanSession() {
     return cleanSession;
   }
 
-  void setCleanSession( String cleanSession ) {
+  public void setCleanSession( String cleanSession ) {
     this.cleanSession = cleanSession;
   }
 
-  String getStorageLevel() {
+  public String getStorageLevel() {
     return storageLevel;
   }
 
-  void setStorageLevel( String storageLevel ) {
+  public void setStorageLevel( String storageLevel ) {
     this.storageLevel = storageLevel;
   }
 
-  String getServerUris() {
+  public String getServerUris() {
     return serverUris;
   }
 
-  void setServerUris( String serverUris ) {
+  public void setServerUris( String serverUris ) {
     this.serverUris = serverUris;
   }
 
-  String getMqttVersion() {
+  public String getMqttVersion() {
     return mqttVersion;
   }
 
-  void setMqttVersion( String mqttVersion ) {
+  public void setMqttVersion( String mqttVersion ) {
     this.mqttVersion = mqttVersion;
   }
 
-  String getAutomaticReconnect() {
+  public String getAutomaticReconnect() {
     return automaticReconnect;
   }
 
-  void setAutomaticReconnect( String automaticReconnect ) {
+  public void setAutomaticReconnect( String automaticReconnect ) {
     this.automaticReconnect = automaticReconnect;
   }
 
