diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
index 4afe079..a29829b 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/TopicRegion.java
@@ -130,7 +130,7 @@
     @Override
     public void removeSubscription(ConnectionContext context, RemoveSubscriptionInfo info) throws Exception {
         SubscriptionKey key = new SubscriptionKey(info.getClientId(), info.getSubscriptionName());
-        DurableTopicSubscription sub = durableSubscriptions.get(key);
+        DurableTopicSubscription sub = durableSubscriptions.remove(key);
         if (sub == null) {
             throw new InvalidDestinationException("No durable subscription exists for: " + info.getSubscriptionName());
         }
