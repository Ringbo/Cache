diff --git a/contrib/queries/src/java/org/apache/lucene/search/trie/ShiftAttribute.java b/contrib/queries/src/java/org/apache/lucene/search/trie/ShiftAttribute.java
index 65282a0..308c23c 100644
--- a/contrib/queries/src/java/org/apache/lucene/search/trie/ShiftAttribute.java
+++ b/contrib/queries/src/java/org/apache/lucene/search/trie/ShiftAttribute.java
@@ -36,7 +36,10 @@
     return shift;
   }
 
-  void setShift(final int shift) {
+  /**
+   * Sets the shift value.
+   */
+  public void setShift(final int shift) {
     this.shift = shift;
   }
   
