diff --git a/activemq-core/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java b/activemq-core/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
index c920d0a..ae5da09 100644
--- a/activemq-core/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
@@ -983,7 +983,7 @@
                             this.topicStore.doAcknowledge(context, key, this.message.getMessageId());
                         }
                     }
-                    removeQueueTask(this.message.getMessageId());
+                    removeTopicTask(this.message.getMessageId());
                     this.future.complete();
                 }
             } catch (Exception e) {
