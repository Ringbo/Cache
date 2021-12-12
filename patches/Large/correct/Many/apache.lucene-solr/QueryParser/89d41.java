diff --git a/src/java/org/apache/lucene/queryParser/QueryParser.java b/src/java/org/apache/lucene/queryParser/QueryParser.java
index a34e1cf..bf46000 100644
--- a/src/java/org/apache/lucene/queryParser/QueryParser.java
+++ b/src/java/org/apache/lucene/queryParser/QueryParser.java
@@ -177,13 +177,13 @@
 
     // If this term is introduced by AND, make the preceding term required,
     // unless it's already prohibited
-    if (conj == CONJ_AND) {
+    if (clauses.size() > 0 && conj == CONJ_AND) {
       BooleanClause c = (BooleanClause) clauses.elementAt(clauses.size()-1);
       if (!c.isProhibited())
         c.setOccur(BooleanClause.Occur.MUST);
     }
 
-    if (operator == DEFAULT_OPERATOR_AND && conj == CONJ_OR) {
+    if (clauses.size() > 0 && operator == DEFAULT_OPERATOR_AND && conj == CONJ_OR) {
       // If this term is introduced by OR, make the preceding term optional,
       // unless it's prohibited (that means we leave -a OR b but +a OR b-->a OR b)
       // notice if the input is a OR b, first term is parsed as required; without
