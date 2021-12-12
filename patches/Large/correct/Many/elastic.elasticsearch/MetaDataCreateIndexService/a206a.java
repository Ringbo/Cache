diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
index 2482325..e51530f 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
@@ -140,7 +140,7 @@
                 try {
                     try {
                         validate(request, currentState);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         listener.onFailure(e);
                         return currentState;
                     }
