diff --git a/src/java/org/apache/solr/search/BitDocSet.java b/src/java/org/apache/solr/search/BitDocSet.java
index 46ba8ae..6caa6e7 100644
--- a/src/java/org/apache/solr/search/BitDocSet.java
+++ b/src/java/org/apache/solr/search/BitDocSet.java
@@ -179,7 +179,7 @@
   @Override
    public DocSet andNot(DocSet other) {
     OpenBitSet newbits = (OpenBitSet)(bits.clone());
-     if (other instanceof OpenBitSet) {
+     if (other instanceof BitDocSet) {
        newbits.andNot(((BitDocSet)other).bits);
      } else {
        DocIterator iter = other.iterator();
