diff --git a/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java b/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
index 86f5820..dfeb933 100644
--- a/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
+++ b/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
@@ -123,7 +123,7 @@
         // Set timeout option. Defaults to 5mn. See cloud.azure.storage.timeout or cloud.azure.storage.xxx.timeout
         try {
             int timeout = (int) azureStorageSettings.getTimeout().getMillis();
-            client.getDefaultRequestOptions().setTimeoutIntervalInMs(timeout);
+            client.getDefaultRequestOptions().setMaximumExecutionTimeInMs(timeout);
         } catch (ClassCastException e) {
             throw new IllegalArgumentException("Can not cast [" + azureStorageSettings.getTimeout() + "] to int.");
         }
