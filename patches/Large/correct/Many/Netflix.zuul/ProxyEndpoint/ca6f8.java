diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/endpoint/ProxyEndpoint.java b/zuul-core/src/main/java/com/netflix/zuul/filters/endpoint/ProxyEndpoint.java
index e1c92a3..7a27ad2 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/endpoint/ProxyEndpoint.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/endpoint/ProxyEndpoint.java
@@ -255,7 +255,7 @@
             // To act the same as Ribbon, we must do this before starting execution (as well as before each attempt).
             IClientConfig requestConfig = origin.getExecutionContext(zuulRequest).getRequestConfig();
             originalReadTimeout = requestConfig.getProperty(ReadTimeout, null);
-            setReadTimeoutOnContext(requestConfig);
+            setReadTimeoutOnContext(requestConfig, 1);
 
             origin.onRequestExecutionStart(zuulRequest);
             proxyRequestToOrigin();
@@ -395,9 +395,9 @@
         return basicRequestStat;
     }
 
-    private Integer setReadTimeoutOnContext(IClientConfig requestConfig)
+    private Integer setReadTimeoutOnContext(IClientConfig requestConfig, int attempt)
     {
-        Integer readTimeout = getReadTimeout(requestConfig, attemptNum);
+        Integer readTimeout = getReadTimeout(requestConfig, attempt);
         requestConfig.set(ReadTimeout, readTimeout);
         return readTimeout;
     }
@@ -421,7 +421,7 @@
                     final ExecutionContext<?> executionContext = origin.getExecutionContext(zuulRequest);
                     IClientConfig requestConfig = executionContext.getRequestConfig();
                     try {
-                        readTimeout = setReadTimeoutOnContext(requestConfig);
+                        readTimeout = setReadTimeoutOnContext(requestConfig, attemptNum);
 
                         origin.onRequestStartWithServer(zuulRequest, server, attemptNum);
                     }
