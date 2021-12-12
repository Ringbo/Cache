diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java b/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
index 657f9f7..4c9f92a 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
@@ -197,7 +197,7 @@
                 info.setSubscriptionName(sub.getConsumerInfo().getSubscriptionName());
                 info.setDestination(sub.getConsumerInfo().getDestination());
                 info.setSelector(sub.getSelector());
-                addInactiveSubscription(key, info);
+                addInactiveSubscription(key, info, sub);
             } else {
                 if (sub.getConsumerInfo().isDurable()) {
                     view = new DurableSubscriptionView(this, context.getClientId(), sub);
@@ -484,7 +484,7 @@
                 info.setSubscriptionName(subscriptionKey.getSubscriptionName());
                 info.setDestination(new ActiveMQTopic(view.getDestinationName()));
                 info.setSelector(view.getSelector());
-                addInactiveSubscription(subscriptionKey, info);
+                addInactiveSubscription(subscriptionKey, info, (brokerService.isKeepDurableSubsActive() ? view.subscription : null));
             }
         }
     }
