diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/search/query/QueryPhase.java b/modules/elasticsearch/src/main/java/org/elasticsearch/search/query/QueryPhase.java
index 80cb122..63d48fc 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/search/query/QueryPhase.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/search/query/QueryPhase.java
@@ -102,7 +102,7 @@
             boolean sort = false;
             // try and optimize for a case where the sorting is based on score, this is how we work by default!
             if (searchContext.sort() != null) {
-                if (searchContext.sort().getSort().length > 0) {
+                if (searchContext.sort().getSort().length > 1) {
                     sort = true;
                 } else {
                     SortField sortField = searchContext.sort().getSort()[0];
