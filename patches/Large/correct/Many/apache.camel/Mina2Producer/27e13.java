diff --git a/components/camel-mina2/src/main/java/org/apache/camel/component/mina2/Mina2Producer.java b/components/camel-mina2/src/main/java/org/apache/camel/component/mina2/Mina2Producer.java
index 0766979..132abe3 100644
--- a/components/camel-mina2/src/main/java/org/apache/camel/component/mina2/Mina2Producer.java
+++ b/components/camel-mina2/src/main/java/org/apache/camel/component/mina2/Mina2Producer.java
@@ -315,7 +315,7 @@
         if (configuration.getSslContextParameters() != null) {
             SslFilter filter = new SslFilter(configuration.getSslContextParameters().createSSLContext(), configuration.isAutoStartTls());
             filter.setUseClientMode(true);
-            acceptor.getFilterChain().addFirst("sslFilter", filter);
+            connector.getFilterChain().addFirst("sslFilter", filter);
         }
         configureCodecFactory("Mina2Producer", connector);
         connector.setConnectTimeoutMillis(timeout);
