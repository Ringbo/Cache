diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/collapser/RequestBatch.java b/hystrix-core/src/main/java/com/netflix/hystrix/collapser/RequestBatch.java
index 3098bb0..fbbdf0b 100644
--- a/hystrix-core/src/main/java/com/netflix/hystrix/collapser/RequestBatch.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/collapser/RequestBatch.java
@@ -121,7 +121,7 @@
                                 } else {
                                     ee = new RuntimeException("Throwable caught while executing batch and mapping responses.", e);
                                 }
-                                logger.error("Exception mapping responses to requests.", e);
+                                logger.debug("Exception mapping responses to requests.", e);
                                 // if a failure occurs we want to pass that exception to all of the Futures that we've returned
                                 for (CollapsedRequest<ResponseType, RequestArgumentType> request : requests) {
                                     try {
