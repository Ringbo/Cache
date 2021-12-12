diff --git a/src/java/org/apache/lucene/search/BooleanClause.java b/src/java/org/apache/lucene/search/BooleanClause.java
index 70841a9..bf091a5 100644
--- a/src/java/org/apache/lucene/search/BooleanClause.java
+++ b/src/java/org/apache/lucene/search/BooleanClause.java
@@ -94,9 +94,9 @@
 
 
 
-  /** Returns true iff <code>o</code> is equal to this. */
+  /** Returns true if <code>o</code> is equal to this. */
   public boolean equals(Object o) {
-    if (!(o instanceof BooleanClause))
+    if (o == null || !(o instanceof BooleanClause))
       return false;
     BooleanClause other = (BooleanClause)o;
     return this.query.equals(other.query)
