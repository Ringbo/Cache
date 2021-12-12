diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataDeleteIndexService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataDeleteIndexService.java
index 9859040..3a8da74 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataDeleteIndexService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataDeleteIndexService.java
@@ -129,7 +129,7 @@
                     });
 
                     return newClusterStateBuilder().state(currentState).routingResult(routingResult).metaData(newMetaData).blocks(blocks).build();
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     listener.onFailure(e);
                     return currentState;
                 }
