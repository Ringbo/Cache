diff --git a/hazelcast-cloud/src/main/java/com/hazelcast/aws/AWSClient.java b/hazelcast-cloud/src/main/java/com/hazelcast/aws/AWSClient.java
index 2644317..ac573bf 100644
--- a/hazelcast-cloud/src/main/java/com/hazelcast/aws/AWSClient.java
+++ b/hazelcast-cloud/src/main/java/com/hazelcast/aws/AWSClient.java
@@ -42,12 +42,12 @@
     }
 
     public Collection<String> getPrivateIpAddresses() throws Exception {
-        final Map<String, String> result = new DescribeInstances(awsConfig).execute(endpoint);
+        final Map<String, String> result = new DescribeInstances(awsConfig).execute();
         return result.keySet();
     }
 
     public Map<String, String> getAddresses() throws Exception {
-        return new DescribeInstances(awsConfig).execute(endpoint);
+        return new DescribeInstances(awsConfig).execute();
     }
 
     public void setEndpoint(String s) {
