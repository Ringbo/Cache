diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/kafka/KafkaProperties.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/kafka/KafkaProperties.java
index d4e0774..356c9fb 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/kafka/KafkaProperties.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/kafka/KafkaProperties.java
@@ -43,6 +43,7 @@
  *
  * @author Gary Russell
  * @author Stephane Nicoll
+ * @author Artem Bilan
  * @since 1.5.0
  */
 @ConfigurationProperties(prefix = "spring.kafka")
@@ -199,7 +200,7 @@
 		 * Frequency in milliseconds that the consumer offsets are auto-committed to Kafka
 		 * if 'enable.auto.commit' true.
 		 */
-		private Long autoCommitInterval;
+		private Integer autoCommitInterval;
 
 		/**
 		 * What to do when there is no initial offset in Kafka or if the current offset
@@ -264,11 +265,11 @@
 			return this.ssl;
 		}
 
-		public Long getAutoCommitInterval() {
+		public Integer getAutoCommitInterval() {
 			return this.autoCommitInterval;
 		}
 
-		public void setAutoCommitInterval(Long autoCommitInterval) {
+		public void setAutoCommitInterval(Integer autoCommitInterval) {
 			this.autoCommitInterval = autoCommitInterval;
 		}
 
