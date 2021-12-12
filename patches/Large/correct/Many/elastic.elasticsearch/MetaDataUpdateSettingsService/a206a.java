diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataUpdateSettingsService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataUpdateSettingsService.java
index cd6be27..e9f46bb 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataUpdateSettingsService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataUpdateSettingsService.java
@@ -265,7 +265,7 @@
                     updatedState = newClusterStateBuilder().state(updatedState).routingResult(routingResult).build();
 
                     return updatedState;
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     listener.onFailure(e);
                     return currentState;
                 }
