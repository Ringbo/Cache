diff --git a/plugin/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java b/plugin/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
index cdcd965..bfef115 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
@@ -407,7 +407,7 @@
                 if (assignment.getExecutorNode() == null) {
                     String msg = "Could not open job because no suitable nodes were found, allocation explanation ["
                             + assignment.getExplanation() + "]";
-                    logger.warn("[{}] {}", msg);
+                    logger.warn("[{}] {}", request.getJobId(), msg);
                     auditor.warning(request.getJobId(), msg);
                     throw new ElasticsearchStatusException(msg, RestStatus.TOO_MANY_REQUESTS);
                 }
