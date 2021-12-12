diff --git a/src/main/java/org/elasticsearch/hadoop/rest/commonshttp/CommonsHttpTransport.java b/src/main/java/org/elasticsearch/hadoop/rest/commonshttp/CommonsHttpTransport.java
index 3cf4873..d49e675 100644
--- a/src/main/java/org/elasticsearch/hadoop/rest/commonshttp/CommonsHttpTransport.java
+++ b/src/main/java/org/elasticsearch/hadoop/rest/commonshttp/CommonsHttpTransport.java
@@ -141,7 +141,7 @@
 
         // when tracing, log everything
         if (log.isTraceEnabled()) {
-            log.trace(String.format("Sending [%s]@[%s][%s] w/ payload [%s]", request.method().name(), request.uri(), request.params(), request.body()));
+            log.trace(String.format("Sending [%s]@[%s][%s] w/ payload [%s]", request.method().name(), request.uri(), request.path(), request.body()));
         }
 
         client.executeMethod(http);
