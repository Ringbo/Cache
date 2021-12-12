diff --git a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpResponse.java b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpResponse.java
index e59f465..df1ca59 100644
--- a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpResponse.java
+++ b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpResponse.java
@@ -92,7 +92,7 @@
         if (values == null || values.length == 0) {
             return null;
         }
-        return XContentType.fromRestContentType(values[0]);
+        return XContentType.fromMediaTypeOrFormat(values[0]);
     }
 
     @Override
