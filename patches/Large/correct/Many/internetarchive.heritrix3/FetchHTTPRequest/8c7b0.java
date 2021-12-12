diff --git a/modules/src/main/java/org/archive/modules/fetcher/FetchHTTPRequest.java b/modules/src/main/java/org/archive/modules/fetcher/FetchHTTPRequest.java
index b8c2c78..19fede1 100644
--- a/modules/src/main/java/org/archive/modules/fetcher/FetchHTTPRequest.java
+++ b/modules/src/main/java/org/archive/modules/fetcher/FetchHTTPRequest.java
@@ -261,7 +261,7 @@
         Map<String, String> uriCustomHeaders = (Map<String, String>) curi.getData().get("customHttpRequestHeaders");
         if (uriCustomHeaders != null) {
             for (Entry<String, String> h: uriCustomHeaders.entrySet()) {
-                request.addHeader(h.getKey(), h.getValue());
+                request.setHeader(h.getKey(), h.getValue());
             }
         }
     }
