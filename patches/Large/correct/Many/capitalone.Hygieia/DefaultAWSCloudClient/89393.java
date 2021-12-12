diff --git a/aws-cloud-collector/src/main/java/com/capitalone/dashboard/collector/DefaultAWSCloudClient.java b/aws-cloud-collector/src/main/java/com/capitalone/dashboard/collector/DefaultAWSCloudClient.java
index 20bfe1c..8541b24 100644
--- a/aws-cloud-collector/src/main/java/com/capitalone/dashboard/collector/DefaultAWSCloudClient.java
+++ b/aws-cloud-collector/src/main/java/com/capitalone/dashboard/collector/DefaultAWSCloudClient.java
@@ -68,7 +68,7 @@
     }
 
 
-    protected void setClients() {
+    public final void setClients() {
         System.getProperties().put("http.proxyHost", settings.getProxyHost());
         System.getProperties().put("http.proxyPort", settings.getProxyPort());
         System.getProperties().put("https.proxyHost", settings.getProxyHost());
