diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java b/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
index 9087608..51de350 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
@@ -229,7 +229,7 @@
         return this;
     }
 
-    public Collection<String> getAddressList() {
+    public List<String> getAddresses() {
         if (addressList.size() == 0) {
             addAddress("localhost");
         }
