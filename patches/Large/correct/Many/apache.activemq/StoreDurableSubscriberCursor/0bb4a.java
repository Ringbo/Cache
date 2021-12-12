diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java b/activemq-broker/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
index 269bde3..7864556 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
@@ -188,7 +188,7 @@
             Message msg = node.getMessage();
             if (isStarted()) {
                 if (!msg.isPersistent()) {
-                    nonPersistent.addMessageLast(node);
+                    nonPersistent.tryAddMessageLast(node, wait);
                 }
             }
             if (msg.isPersistent()) {
