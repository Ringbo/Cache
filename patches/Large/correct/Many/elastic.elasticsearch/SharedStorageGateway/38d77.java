diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/shared/SharedStorageGateway.java b/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/shared/SharedStorageGateway.java
index 7400cd3..920692c 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/shared/SharedStorageGateway.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/shared/SharedStorageGateway.java
@@ -162,11 +162,11 @@
                                     }
 
                                     @Override public void onFailure(Throwable t) {
-                                        logger.error("failed to create index [{}]", indexMetaData.index(), t);
+                                        logger.error("failed to create index [{}]", t, indexMetaData.index());
                                     }
                                 });
                     } catch (IOException e) {
-                        logger.error("failed to create index [{}]", indexMetaData.index(), e);
+                        logger.error("failed to create index [{}]", e, indexMetaData.index());
                     }
                 }
             }
