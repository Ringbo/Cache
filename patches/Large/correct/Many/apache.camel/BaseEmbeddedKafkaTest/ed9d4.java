diff --git a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/BaseEmbeddedKafkaTest.java b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/BaseEmbeddedKafkaTest.java
index c7b4f45..b3fc0cf 100644
--- a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/BaseEmbeddedKafkaTest.java
+++ b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/BaseEmbeddedKafkaTest.java
@@ -80,7 +80,7 @@
         CamelContext context = super.createCamelContext();
         context.addComponent("properties", new PropertiesComponent("ref:prop"));
 
-        KafkaComponent kafka = new KafkaComponent();
+        KafkaComponent kafka = new KafkaComponent(context);
         kafka.setBrokers("localhost:" + getKafkaPort());
         context.addComponent("kafka", kafka);
 
