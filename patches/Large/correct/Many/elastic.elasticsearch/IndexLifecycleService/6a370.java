diff --git a/x-pack/plugin/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java b/x-pack/plugin/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
index a221ced..c4faa71 100644
--- a/x-pack/plugin/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
+++ b/x-pack/plugin/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
@@ -115,8 +115,8 @@
                         try {
                             policy.execute(new InternalIndexLifecycleContext(idxMeta.getIndex(), client, clusterService, nowSupplier));
                         } catch (ElasticsearchException e) {
-                            logger.error("Failed to execute lifecycle policy [{}] for index [{}]", policyName, idxMeta.getIndex().getName(),
-                                    policyName);
+                            logger.error("Failed to execute lifecycle policy [{}] for index [{}]", policyName,
+                                    idxMeta.getIndex().getName());
                         }
                     }
                 }
