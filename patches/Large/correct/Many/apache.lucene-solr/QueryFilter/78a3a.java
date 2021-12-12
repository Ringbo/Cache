diff --git a/src/java/org/apache/lucene/search/QueryFilter.java b/src/java/org/apache/lucene/search/QueryFilter.java
index f139fd2..a50f647 100644
--- a/src/java/org/apache/lucene/search/QueryFilter.java
+++ b/src/java/org/apache/lucene/search/QueryFilter.java
@@ -25,13 +25,13 @@
  * @version $Id$
  * @deprecated use a CachingWrapperFilter with QueryWrapperFilter
  */
-public class QueryFilter extends QueryWrapperFilter {
+public class QueryFilter extends CachingWrapperFilter {
 
   /** Constructs a filter which only matches documents matching
    * <code>query</code>.
    */
   public QueryFilter(Query query) {
-    super(query);
+    super(new QueryWrapperFilter(query));
   }
 
   public boolean equals(Object o) {
