diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/proxy/ConfigServerRestExecutorImpl.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/proxy/ConfigServerRestExecutorImpl.java
index 937c93a..7d06bbd 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/proxy/ConfigServerRestExecutorImpl.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/proxy/ConfigServerRestExecutorImpl.java
@@ -250,7 +250,7 @@
                 new AthenzIdentityVerifier(
                         singleton(
                                 zoneRegistry.getConfigserverAthenzService(
-                                        ZoneId.from(proxyRequest.getEnvironment(), proxyRequest.getEnvironment()))));
+                                        ZoneId.from(proxyRequest.getEnvironment(), proxyRequest.getRegion()))));
         return HttpClientBuilder.create()
                 .setUserAgent("config-server-client")
                 .setSslcontext(sslContextProvider.get())
