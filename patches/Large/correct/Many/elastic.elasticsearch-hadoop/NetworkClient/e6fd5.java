diff --git a/mr/src/main/java/org/elasticsearch/hadoop/rest/NetworkClient.java b/mr/src/main/java/org/elasticsearch/hadoop/rest/NetworkClient.java
index 1bee43e..d1cc5a1 100644
--- a/mr/src/main/java/org/elasticsearch/hadoop/rest/NetworkClient.java
+++ b/mr/src/main/java/org/elasticsearch/hadoop/rest/NetworkClient.java
@@ -56,7 +56,7 @@
     private final Stats stats = new Stats();
 
     public NetworkClient(Settings settings) {
-        this(settings,(SettingsUtils.hasJobTransportPoolingKey(settings) ? new CommonsHttpTransportFactory() : PooledTransportManager.getTransportFactory(settings)));
+        this(settings, (!SettingsUtils.hasJobTransportPoolingKey(settings) ? new CommonsHttpTransportFactory() : PooledTransportManager.getTransportFactory(settings)));
     }
 
     public NetworkClient(Settings settings, TransportFactory transportFactory) {
