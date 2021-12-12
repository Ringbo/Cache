diff --git a/core/src/main/java/org/elasticsearch/index/query/SimpleQueryStringBuilder.java b/core/src/main/java/org/elasticsearch/index/query/SimpleQueryStringBuilder.java
index 3ff6f5d..ddc75fd 100644
--- a/core/src/main/java/org/elasticsearch/index/query/SimpleQueryStringBuilder.java
+++ b/core/src/main/java/org/elasticsearch/index/query/SimpleQueryStringBuilder.java
@@ -263,7 +263,7 @@
 
     /** Specifies whether wildcards should be analyzed. Defaults to false. */
     public SimpleQueryStringBuilder analyzeWildcard(boolean analyzeWildcard) {
-        this.settings.analyzeWildcard(DEFAULT_ANALYZE_WILDCARD);
+        this.settings.analyzeWildcard(analyzeWildcard);
         return this;
     }
 
