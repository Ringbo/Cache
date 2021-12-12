diff --git a/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java b/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
index cd201e7..697f05e 100644
--- a/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
+++ b/plugins/repository-azure/src/main/java/org/elasticsearch/cloud/azure/storage/AzureStorageServiceImpl.java
@@ -175,7 +175,7 @@
             blobContainer.createIfNotExists();
         } catch (IllegalArgumentException e) {
             logger.trace((Supplier<?>) () -> new ParameterizedMessage("fails creating container [{}]", container), e);
-            throw new RepositoryException(container, e.getMessage());
+            throw new RepositoryException(container, e.getMessage(), e);
         }
     }
 
