diff --git a/hazelcast/src/main/java/com/hazelcast/instance/DelegatingAddressPicker.java b/hazelcast/src/main/java/com/hazelcast/instance/DelegatingAddressPicker.java
index 3b4f8da..8fc8d8e 100644
--- a/hazelcast/src/main/java/com/hazelcast/instance/DelegatingAddressPicker.java
+++ b/hazelcast/src/main/java/com/hazelcast/instance/DelegatingAddressPicker.java
@@ -60,7 +60,7 @@
     public void pickAddress() throws Exception {
         try {
             bindAddress = memberAddressProvider.getBindAddress();
-            logger.info("Using bind address: " + publicAddress);
+            logger.info("Using bind address: " + bindAddress);
 
             publicAddress = memberAddressProvider.getPublicAddress();
             validatePublicAddress(publicAddress);
