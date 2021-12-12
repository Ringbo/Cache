diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java b/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
index 3bc5b48..1aee17e 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/config/ClientConfig.java
@@ -227,7 +227,7 @@
         return this;
     }
 
-    public Collection<String> getAddressList() {
+    public List<String> getAddresses() {
         if (addressList.size() == 0) {
             addAddress("localhost");
         }
