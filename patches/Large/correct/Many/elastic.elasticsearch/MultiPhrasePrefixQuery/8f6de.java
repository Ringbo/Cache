diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/common/lucene/search/MultiPhrasePrefixQuery.java b/modules/elasticsearch/src/main/java/org/elasticsearch/common/lucene/search/MultiPhrasePrefixQuery.java
index 97bd973..fed5b8e 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/common/lucene/search/MultiPhrasePrefixQuery.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/common/lucene/search/MultiPhrasePrefixQuery.java
@@ -162,7 +162,7 @@
                 } else {
                     break;
                 }
-                if (terms.size() > maxExpansions) {
+                if (terms.size() >= maxExpansions) {
                     break;
                 }
             } while (enumerator.next());
