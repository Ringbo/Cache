diff --git a/lucene/core/src/java/org/apache/lucene/index/ParallelAtomicReader.java b/lucene/core/src/java/org/apache/lucene/index/ParallelAtomicReader.java
index 4b88c2d..97fbb8d 100644
--- a/lucene/core/src/java/org/apache/lucene/index/ParallelAtomicReader.java
+++ b/lucene/core/src/java/org/apache/lucene/index/ParallelAtomicReader.java
@@ -57,7 +57,7 @@
   private final boolean closeSubReaders;
   private final int maxDoc, numDocs;
   private final boolean hasDeletions;
-  final SortedMap<String,AtomicReader> fieldToReader = new TreeMap<String,AtomicReader>();
+  private final SortedMap<String,AtomicReader> fieldToReader = new TreeMap<String,AtomicReader>();
   
   /** Create a ParallelAtomicReader based on the provided
    *  readers; auto-closes the given readers on {@link #close()}. */
@@ -134,11 +134,11 @@
   private final class ParallelFieldsEnum extends FieldsEnum {
     private String currentField;
     private final Iterator<String> keys;
-    private final Fields fields;
+    private final ParallelFields fields;
     
-    ParallelFieldsEnum(Fields fields) {
+    ParallelFieldsEnum(ParallelFields fields) {
       this.fields = fields;
-      keys = fieldToReader.keySet().iterator();
+      keys = fields.fields.keySet().iterator();
     }
     
     @Override
@@ -160,7 +160,7 @@
   
   // Single instance of this, per ParallelReader instance
   private final class ParallelFields extends Fields {
-    final HashMap<String,Terms> fields = new HashMap<String,Terms>();
+    final Map<String,Terms> fields = new TreeMap<String,Terms>();
     
     ParallelFields() {
     }
