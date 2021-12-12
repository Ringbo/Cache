diff --git a/src/main/java/org/elasticsearch/action/search/type/TransportSearchHelper.java b/src/main/java/org/elasticsearch/action/search/type/TransportSearchHelper.java
index 500c2ab..5b8b315 100644
--- a/src/main/java/org/elasticsearch/action/search/type/TransportSearchHelper.java
+++ b/src/main/java/org/elasticsearch/action/search/type/TransportSearchHelper.java
@@ -62,7 +62,7 @@
         } else if (searchType == SearchType.SCAN) {
             return buildScrollId(ParsedScrollId.SCAN, searchPhaseResults, attributes);
         } else {
-            throw new ElasticsearchIllegalStateException();
+            throw new ElasticsearchIllegalStateException("search_type [" + searchType + "] not supported");
         }
     }
 
