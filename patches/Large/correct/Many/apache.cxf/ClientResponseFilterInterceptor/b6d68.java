diff --git a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseFilterInterceptor.java b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseFilterInterceptor.java
index e17d27b..cb3f6d4 100644
--- a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseFilterInterceptor.java
+++ b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseFilterInterceptor.java
@@ -54,7 +54,7 @@
         
         List<ProviderInfo<ClientResponseFilter>> filters = pf.getClientResponseFilters();
         if (!filters.isEmpty()) {
-            ClientRequestContext reqContext = new ClientRequestContextImpl(inMessage.getExchange().getInMessage(),
+            ClientRequestContext reqContext = new ClientRequestContextImpl(inMessage.getExchange().getOutMessage(),
                                                                         true);
             
             ClientResponseContext respContext = 
