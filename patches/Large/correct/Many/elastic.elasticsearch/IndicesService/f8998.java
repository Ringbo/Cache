diff --git a/core/src/main/java/org/elasticsearch/indices/IndicesService.java b/core/src/main/java/org/elasticsearch/indices/IndicesService.java
index 8f5d01d..0ab2f3c 100644
--- a/core/src/main/java/org/elasticsearch/indices/IndicesService.java
+++ b/core/src/main/java/org/elasticsearch/indices/IndicesService.java
@@ -602,7 +602,7 @@
                                                     "the cluster state [" + index.getIndexUUID() + "] [" + metaData.getIndexUUID() + "]");
                 }
                 deleteIndexStore(reason, metaData, clusterState);
-            } catch (IOException e) {
+            } catch (Exception e) {
                 logger.warn((Supplier<?>) () -> new ParameterizedMessage("[{}] failed to delete unassigned index (reason [{}])", metaData.getIndex(), reason), e);
             }
         }
@@ -764,14 +764,14 @@
             final IndexMetaData metaData;
             try {
                 metaData = metaStateService.loadIndexState(index);
-            } catch (IOException e) {
+            } catch (Exception e) {
                 logger.warn((Supplier<?>) () -> new ParameterizedMessage("[{}] failed to load state file from a stale deleted index, folders will be left on disk", index), e);
                 return null;
             }
             final IndexSettings indexSettings = buildIndexSettings(metaData);
             try {
                 deleteIndexStoreIfDeletionAllowed("stale deleted index", index, indexSettings, ALWAYS_TRUE);
-            } catch (IOException e) {
+            } catch (Exception e) {
                 // we just warn about the exception here because if deleteIndexStoreIfDeletionAllowed
                 // throws an exception, it gets added to the list of pending deletes to be tried again
                 logger.warn((Supplier<?>) () -> new ParameterizedMessage("[{}] failed to delete index on disk", metaData.getIndex()), e);
