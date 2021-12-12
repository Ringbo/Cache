diff --git a/src/java/org/apache/lucene/search/FieldSortedHitQueue.java b/src/java/org/apache/lucene/search/FieldSortedHitQueue.java
index 158fed8..21fbf62 100644
--- a/src/java/org/apache/lucene/search/FieldSortedHitQueue.java
+++ b/src/java/org/apache/lucene/search/FieldSortedHitQueue.java
@@ -80,7 +80,7 @@
    * @param b ScoreDoc
    * @return <code>true</code> if document <code>a</code> should be sorted after document <code>b</code>.
    */
-  protected final boolean lessThan (final Object a, final Object b) {
+  protected boolean lessThan (final Object a, final Object b) {
     final ScoreDoc docA = (ScoreDoc) a;
     final ScoreDoc docB = (ScoreDoc) b;
 
