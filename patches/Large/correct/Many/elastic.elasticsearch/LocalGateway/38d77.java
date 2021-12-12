diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/local/LocalGateway.java b/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/local/LocalGateway.java
index 7337bc4..b364d77 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/local/LocalGateway.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/gateway/local/LocalGateway.java
@@ -193,11 +193,11 @@
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
