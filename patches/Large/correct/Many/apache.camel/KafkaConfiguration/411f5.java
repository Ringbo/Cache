diff --git a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConfiguration.java b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConfiguration.java
index 1a068c3..9e3b39d 100644
--- a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConfiguration.java
+++ b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConfiguration.java
@@ -120,7 +120,7 @@
     private String keySerializerClass;
 
     @UriParam(label = "producer", defaultValue = "1")
-    private Integer requestRequiredAcks = 1;
+    private String requestRequiredAcks = "1";
     //buffer.memory
     @UriParam(label = "producer", defaultValue = "33554432")
     private Integer bufferMemorySize = 33554432;
@@ -867,7 +867,7 @@
         this.bufferMemorySize = bufferMemorySize;
     }
 
-    public Integer getRequestRequiredAcks() {
+    public String getRequestRequiredAcks() {
         return requestRequiredAcks;
     }
 
@@ -884,7 +884,7 @@
      * acks=all This means the leader will wait for the full set of in-sync replicas to acknowledge the record. This guarantees that the
      * record will not be lost as long as at least one in-sync replica remains alive. This is the strongest available guarantee.
      */
-    public void setRequestRequiredAcks(Integer requestRequiredAcks) {
+    public void setRequestRequiredAcks(String requestRequiredAcks) {
         this.requestRequiredAcks = requestRequiredAcks;
     }
 
