diff --git a/plugins/vertx/src/main/java/com/navercorp/pinpoint/plugin/vertx/interceptor/AsyncContextSpanEventEndPointInterceptor.java b/plugins/vertx/src/main/java/com/navercorp/pinpoint/plugin/vertx/interceptor/AsyncContextSpanEventEndPointInterceptor.java
index ffecf2b..3072a6d 100644
--- a/plugins/vertx/src/main/java/com/navercorp/pinpoint/plugin/vertx/interceptor/AsyncContextSpanEventEndPointInterceptor.java
+++ b/plugins/vertx/src/main/java/com/navercorp/pinpoint/plugin/vertx/interceptor/AsyncContextSpanEventEndPointInterceptor.java
@@ -99,7 +99,7 @@
             logger.debug("Asynchronous invocation. asyncContext={}", asyncContext);
         }
 
-        final Trace trace = asyncContext.continueAsyncTraceObject();
+        final Trace trace = asyncContext.currentAsyncTraceObject();
         if (trace == null) {
             return;
         }
