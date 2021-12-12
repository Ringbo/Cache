diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
index 9d76533..6c32a98 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
@@ -203,7 +203,7 @@
                     MetaData.Builder builder = newMetaDataBuilder().metaData(currentState.metaData());
                     builder.put(newIndexMetaDataBuilder(indexMetaData).putMapping(new MappingMetaData(updatedMapper)));
                     return newClusterStateBuilder().state(currentState).metaData(builder).build();
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     logger.warn("failed to dynamically update the mapping in cluster_state from shard", e);
                     listener.onFailure(e);
                     return currentState;
@@ -256,7 +256,7 @@
 
                     notifyOnPostProcess.set(true);
                     return ClusterState.builder().state(currentState).metaData(builder).build();
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     listener.onFailure(e);
                     return currentState;
                 }
@@ -404,7 +404,7 @@
                     }
                     mappingCreatedAction.add(new CountDownListener(counter, listener), request.timeout);
                     return updatedState;
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     listener.onFailure(e);
                     return currentState;
                 } finally {
