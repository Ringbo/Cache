diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/QueueSubscription.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/QueueSubscription.java
index 3e08636..1dee6e8 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/QueueSubscription.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/QueueSubscription.java
@@ -153,7 +153,7 @@
             // If the message was dispatched, it could be getting dispatched async, so we
             // can only drop the reference count when that completes @see onDispatch
             if( !rc ) {
-                node.incrementReferenceCount();
+                node.decrementReferenceCount();
             }
         }
         return rc;
