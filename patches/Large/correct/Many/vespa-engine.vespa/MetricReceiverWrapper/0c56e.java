diff --git a/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/metrics/MetricReceiverWrapper.java b/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/metrics/MetricReceiverWrapper.java
index b943a2a..26cbaff 100644
--- a/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/metrics/MetricReceiverWrapper.java
+++ b/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/metrics/MetricReceiverWrapper.java
@@ -66,7 +66,7 @@
             while (dimensionsIterator.hasNext()) {
                 Dimensions dimension = dimensionsIterator.next();
                 if (dimension.dimensionsMap.containsKey("host") && dimension.dimensionsMap.get("host").equals(hostname)) {
-                    metricsByDimensions.remove(dimension);
+                    dimensionsIterator.remove();
                 }
             }
         }
