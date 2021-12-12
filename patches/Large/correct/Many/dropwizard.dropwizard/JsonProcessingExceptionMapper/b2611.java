diff --git a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/jackson/JsonProcessingExceptionMapper.java b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/jackson/JsonProcessingExceptionMapper.java
index b52baad..8eac209 100644
--- a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/jackson/JsonProcessingExceptionMapper.java
+++ b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/jackson/JsonProcessingExceptionMapper.java
@@ -48,7 +48,7 @@
         /*
          * Otherwise, it's those pesky users.
          */
-        LOGGER.debug("Unable to process JSON", exception);
+        LOGGER.warn("Unable to process JSON", exception);
         final ErrorMessage errorMessage = new ErrorMessage(Response.Status.BAD_REQUEST.getStatusCode(),
                 "Unable to process JSON", showDetails ? message : null);
         return Response.status(Response.Status.BAD_REQUEST)
