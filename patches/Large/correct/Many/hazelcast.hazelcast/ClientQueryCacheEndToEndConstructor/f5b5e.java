diff --git a/subscriber/ClientQueryCacheEndToEndConstructor.java b/subscriber/ClientQueryCacheEndToEndConstructor.java
index 4dd3a00..bbe7832 100644
--- a/subscriber/ClientQueryCacheEndToEndConstructor.java
+++ b/subscriber/ClientQueryCacheEndToEndConstructor.java
@@ -51,7 +51,7 @@
         ClientMessage response = (ClientMessage) invokerWrapper.invoke(request);
 
         Collection<Map.Entry<Data, Data>> result
-                = EnterpriseMapPublisherCreateWithValueCodec.decodeResponse(response).entries;
+                = EnterpriseMapPublisherCreateWithValueCodec.decodeResponse(response).response;
 
         populateWithValues(queryCache, result);
     }
@@ -67,7 +67,7 @@
         InvokerWrapper invokerWrapper = context.getInvokerWrapper();
         ClientMessage response = (ClientMessage) invokerWrapper.invoke(request);
 
-        Collection<Data> result = EnterpriseMapPublisherCreateCodec.decodeResponse(response).list;
+        Collection<Data> result = EnterpriseMapPublisherCreateCodec.decodeResponse(response).response;
 
         populateWithoutValues(queryCache, result);
     }
