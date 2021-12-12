diff --git a/jdisc_http_service/src/main/java/com/yahoo/jdisc/http/server/jetty/MetricReporter.java b/jdisc_http_service/src/main/java/com/yahoo/jdisc/http/server/jetty/MetricReporter.java
index 00b8b26..fc64e90 100644
--- a/jdisc_http_service/src/main/java/com/yahoo/jdisc/http/server/jetty/MetricReporter.java
+++ b/jdisc_http_service/src/main/java/com/yahoo/jdisc/http/server/jetty/MetricReporter.java
@@ -41,7 +41,7 @@
         UriPattern pattern = bindingMatch.matched();
         if (pattern == null) return;
         Map<String, Object> combinedDimensions = new HashMap<>(requestDimensions);
-        combinedDimensions.put(Metrics.HANDLER_DIMENSION, bindingMatch.toString());
+        combinedDimensions.put(Metrics.HANDLER_DIMENSION, pattern.toString());
         this.context = metric.createContext(combinedDimensions);
     }
 
