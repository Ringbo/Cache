diff --git a/src/main/java/org/elasticsearch/action/search/SearchRequest.java b/src/main/java/org/elasticsearch/action/search/SearchRequest.java
index b02ae7f..76a5c9f 100644
--- a/src/main/java/org/elasticsearch/action/search/SearchRequest.java
+++ b/src/main/java/org/elasticsearch/action/search/SearchRequest.java
@@ -371,7 +371,7 @@
             builder.map(extraSource);
             return extraSource(builder);
         } catch (IOException e) {
-            throw new ElasticsearchGenerationException("Failed to generate [" + source + "]", e);
+            throw new ElasticsearchGenerationException("Failed to generate [" + extraSource + "]", e);
         }
     }
 
