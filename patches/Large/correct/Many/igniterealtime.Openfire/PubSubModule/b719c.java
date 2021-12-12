diff --git a/src/java/org/jivesoftware/openfire/pubsub/PubSubModule.java b/src/java/org/jivesoftware/openfire/pubsub/PubSubModule.java
index b6bf704..cb4279f 100644
--- a/src/java/org/jivesoftware/openfire/pubsub/PubSubModule.java
+++ b/src/java/org/jivesoftware/openfire/pubsub/PubSubModule.java
@@ -427,7 +427,7 @@
             leafDefaultConfiguration.setNotifyDelete(true);
             leafDefaultConfiguration.setNotifyRetract(true);
             leafDefaultConfiguration.setPersistPublishedItems(false);
-            leafDefaultConfiguration.setMaxPublishedItems(-1);
+            leafDefaultConfiguration.setMaxPublishedItems(1);
             leafDefaultConfiguration.setPresenceBasedDelivery(false);
             leafDefaultConfiguration.setSendItemSubscribe(true);
             leafDefaultConfiguration.setSubscriptionEnabled(true);
