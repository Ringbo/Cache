diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
index 16c6b42..43713b6 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
@@ -179,7 +179,7 @@
         if (sub.isActive()) {
             throw new JMSException("Durable consumer is in use");
         } else {
-            durableSubscriptions.get(key);
+            durableSubscriptions.remove(key);
         }
 
         destinationsLock.readLock().lock();
