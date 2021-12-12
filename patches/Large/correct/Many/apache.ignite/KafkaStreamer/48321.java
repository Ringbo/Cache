diff --git a/modules/kafka/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java b/modules/kafka/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java
index 487c369..f46ee93 100644
--- a/modules/kafka/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java
+++ b/modules/kafka/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java
@@ -180,12 +180,12 @@
                                     getStreamer().addData(msg.key(), msg.message());
                                 }
                                 catch (Exception e) {
-                                    U.warn(log, "Message is ignored due to an error [msg=" + msg + ']', e);
+                                    U.error(log, "Message is ignored due to an error [msg=" + msg + ']', e);
                                 }
                             }
                         }
                         catch (Exception e) {
-                            U.warn(log, "Message can't be consumed from stream. Retry after " +
+                            U.error(log, "Message can't be consumed from stream. Retry after " +
                                 retryTimeout + " ms.", e);
 
                             try {
