diff --git a/src/java/org/apache/lucene/search/FilteredQuery.java b/src/java/org/apache/lucene/search/FilteredQuery.java
index 816a0d4..63055ab 100644
--- a/src/java/org/apache/lucene/search/FilteredQuery.java
+++ b/src/java/org/apache/lucene/search/FilteredQuery.java
@@ -102,7 +102,7 @@
 
   /** Prints a user-readable version of this query. */
   public String toString (String s) {
-    return "filtered("+query.toString()+")";
+    return "filtered("+query.toString(s)+")";
   }
 
   /** Returns true iff <code>o</code> is equal to this. */
