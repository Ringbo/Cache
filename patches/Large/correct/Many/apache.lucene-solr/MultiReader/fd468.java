diff --git a/lucene/src/java/org/apache/lucene/index/MultiReader.java b/lucene/src/java/org/apache/lucene/index/MultiReader.java
index fdc364d..94f12da 100644
--- a/lucene/src/java/org/apache/lucene/index/MultiReader.java
+++ b/lucene/src/java/org/apache/lucene/index/MultiReader.java
@@ -108,7 +108,7 @@
    */
   @Override
   protected synchronized IndexReader doOpenIfChanged() throws CorruptIndexException, IOException {
-    return doOpenIfChanged(false);
+    return doReopen(false);
   }
   
   /**
@@ -123,7 +123,7 @@
   @Override
   public synchronized Object clone() {
     try {
-      return doOpenIfChanged(true);
+      return doReopen(true);
     } catch (Exception ex) {
       throw new RuntimeException(ex);
     }
@@ -141,7 +141,7 @@
    * @throws CorruptIndexException
    * @throws IOException
    */
-  protected IndexReader doOpenIfChanged(boolean doClone) throws CorruptIndexException, IOException {
+  private IndexReader doReopen(boolean doClone) throws CorruptIndexException, IOException {
     ensureOpen();
     
     boolean changed = false;
