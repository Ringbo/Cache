diff --git a/dropwizard-client/src/main/java/io/dropwizard/client/HttpClientBuilder.java b/dropwizard-client/src/main/java/io/dropwizard/client/HttpClientBuilder.java
index a1a81e6..d6b2704 100644
--- a/dropwizard-client/src/main/java/io/dropwizard/client/HttpClientBuilder.java
+++ b/dropwizard-client/src/main/java/io/dropwizard/client/HttpClientBuilder.java
@@ -88,7 +88,7 @@
                 .setSoTimeout(timeout)
                 .build();
 
-        builder.setRequestExecutor(new InstrumentedHttpRequestExecutor(metricRegistry, metricNameStrategy))
+        builder.setRequestExecutor(new InstrumentedHttpRequestExecutor(metricRegistry, metricNameStrategy, name))
                 .setConnectionManager(manager)
                 .setDefaultRequestConfig(requestConfig)
                 .setDefaultSocketConfig(socketConfig)
