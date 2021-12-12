diff --git a/graylog2-inputs/src/main/java/org/graylog2/inputs/radio/RadioKafkaInput.java b/graylog2-inputs/src/main/java/org/graylog2/inputs/radio/RadioKafkaInput.java
index a583539..b217631 100644
--- a/graylog2-inputs/src/main/java/org/graylog2/inputs/radio/RadioKafkaInput.java
+++ b/graylog2-inputs/src/main/java/org/graylog2/inputs/radio/RadioKafkaInput.java
@@ -39,7 +39,7 @@
  */
 public class RadioKafkaInput extends KafkaInput {
 
-    private static final Logger LOG = LoggerFactory.getLogger(KafkaInput.class);
+    private static final Logger LOG = LoggerFactory.getLogger(RadioKafkaInput.class);
 
     public static final String NAME = "Graylog2 Radio Input (Kafka)";
 
