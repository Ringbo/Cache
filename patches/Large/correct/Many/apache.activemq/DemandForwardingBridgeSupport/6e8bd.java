diff --git a/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java b/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
index fb7083e..b6404d5 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
@@ -895,7 +895,7 @@
 
     protected void addSubscription(DemandSubscription sub) throws IOException {
         if (sub != null) {
-            localBroker.request(sub.getLocalInfo());
+            localBroker.oneway(sub.getLocalInfo());
         }
     }
 
