diff --git a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaEndpoint.java b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaEndpoint.java
index eb03493..ec75c4b 100644
--- a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaEndpoint.java
+++ b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaEndpoint.java
@@ -419,7 +419,7 @@
         configuration.setSslKeyPassword(sslKeyPassword);
     }
 
-    public Integer getRequestRequiredAcks() {
+    public String getRequestRequiredAcks() {
         return configuration.getRequestRequiredAcks();
     }
 
@@ -479,7 +479,7 @@
         return configuration.getSslCipherSuites();
     }
 
-    public void setRequestRequiredAcks(Integer requestRequiredAcks) {
+    public void setRequestRequiredAcks(String requestRequiredAcks) {
         configuration.setRequestRequiredAcks(requestRequiredAcks);
     }
 
