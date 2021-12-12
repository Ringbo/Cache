diff --git a/hazelcast/src/main/java/com/hazelcast/nio/ssl/BasicSSLContextFactory.java b/hazelcast/src/main/java/com/hazelcast/nio/ssl/BasicSSLContextFactory.java
index 480f067..ad84d51 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/ssl/BasicSSLContextFactory.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/ssl/BasicSSLContextFactory.java
@@ -49,7 +49,7 @@
         String trustStore = getProperty(properties, "trustStore", keyStore);
         String trustStorePassword = getProperty(properties, "trustStorePassword", keyStorePassword);
 
-        String keyManagerAlgorithm = properties.getProperty("keyManagerAlgorithm", TrustManagerFactory.getDefaultAlgorithm());
+        String keyManagerAlgorithm = properties.getProperty("keyManagerAlgorithm", KeyManagerFactory.getDefaultAlgorithm());
         String trustManagerAlgorithm = properties.getProperty("trustManagerAlgorithm", TrustManagerFactory.getDefaultAlgorithm());
         String protocol = properties.getProperty("protocol", "TLS");
 
