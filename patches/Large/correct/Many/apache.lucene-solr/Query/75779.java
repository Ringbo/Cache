diff --git a/src/java/org/apache/lucene/search/Query.java b/src/java/org/apache/lucene/search/Query.java
index 97a24b9..a1dd8a1 100644
--- a/src/java/org/apache/lucene/search/Query.java
+++ b/src/java/org/apache/lucene/search/Query.java
@@ -169,17 +169,17 @@
    *
    *<p>A utility for use by {@link #combine(Query[])} implementations.
    */
-  public static Query mergeBooleanQueries(Query[] queries) {
+  public static Query mergeBooleanQueries(BooleanQuery[] queries) {
     HashSet allClauses = new HashSet();
     for (int i = 0; i < queries.length; i++) {
-      BooleanClause[] clauses = ((BooleanQuery)queries[i]).getClauses();
+      BooleanClause[] clauses = queries[i].getClauses();
       for (int j = 0; j < clauses.length; j++) {
         allClauses.add(clauses[j]);
       }
     }
 
     boolean coordDisabled =
-      queries.length==0? false : ((BooleanQuery)queries[0]).isCoordDisabled();
+      queries.length==0? false : queries[0].isCoordDisabled();
     BooleanQuery result = new BooleanQuery(coordDisabled);
     Iterator i = allClauses.iterator();
     while (i.hasNext()) {
