diff --git a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/errors/LoggingExceptionMapper.java b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/errors/LoggingExceptionMapper.java
index 73117f2..da06482 100644
--- a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/errors/LoggingExceptionMapper.java
+++ b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/errors/LoggingExceptionMapper.java
@@ -27,7 +27,7 @@
             status = response.getStatus();
             errorMessage = new ErrorMessage(status, exception.getLocalizedMessage());
         } else {
-            final long id = logException(id, exception);
+            final long id = logException(exception);
             status = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
             errorMessage = new ErrorMessage(formatErrorMessage(id, exception));
         }
