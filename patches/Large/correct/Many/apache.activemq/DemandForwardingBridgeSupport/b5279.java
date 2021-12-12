diff --git a/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java b/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
index 8e08f95..ad6fd61 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/network/DemandForwardingBridgeSupport.java
@@ -348,7 +348,7 @@
         try {
             remoteBrokerInfo = futureRemoteBrokerInfo.get();
             if (remoteBrokerInfo == null) {
-                fireBridgeFailed(new Throwable("remoteBrokerInfo is null"));
+                serviceLocalException(new Throwable("remoteBrokerInfo is null"));
                 return;
             }
         } catch (Exception e) {
@@ -359,7 +359,7 @@
         try {
             localBrokerInfo = futureLocalBrokerInfo.get();
             if (localBrokerInfo == null) {
-                fireBridgeFailed(new Throwable("localBrokerInfo is null"));
+                serviceLocalException(new Throwable("localBrokerInfo is null"));
                 return;
             }
 
