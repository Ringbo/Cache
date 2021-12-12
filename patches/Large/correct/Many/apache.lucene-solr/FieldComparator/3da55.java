diff --git a/lucene/core/src/java/org/apache/lucene/search/FieldComparator.java b/lucene/core/src/java/org/apache/lucene/search/FieldComparator.java
index 09bf533..dd9e171 100644
--- a/lucene/core/src/java/org/apache/lucene/search/FieldComparator.java
+++ b/lucene/core/src/java/org/apache/lucene/search/FieldComparator.java
@@ -261,7 +261,11 @@
     private double bottom;
     private double topValue;
 
-    DoubleComparator(int numHits, String field, Double missingValue) {
+    /** 
+     * Creates a new comparator based on {@link Double#compare} for {@code numHits}.
+     * When a document has no value for the field, {@code missingValue} is substituted. 
+     */
+    public DoubleComparator(int numHits, String field, Double missingValue) {
       super(field, missingValue);
       values = new double[numHits];
     }
@@ -329,7 +333,11 @@
     private float bottom;
     private float topValue;
 
-    FloatComparator(int numHits, String field, Float missingValue) {
+    /** 
+     * Creates a new comparator based on {@link Float#compare} for {@code numHits}.
+     * When a document has no value for the field, {@code missingValue} is substituted. 
+     */
+    public FloatComparator(int numHits, String field, Float missingValue) {
       super(field, missingValue);
       values = new float[numHits];
     }
@@ -398,7 +406,11 @@
     private int bottom;                           // Value of bottom of queue
     private int topValue;
 
-    IntComparator(int numHits, String field, Integer missingValue) {
+    /** 
+     * Creates a new comparator based on {@link Integer#compare} for {@code numHits}.
+     * When a document has no value for the field, {@code missingValue} is substituted. 
+     */
+    public IntComparator(int numHits, String field, Integer missingValue) {
       super(field, missingValue);
       values = new int[numHits];
     }
@@ -466,7 +478,11 @@
     private long bottom;
     private long topValue;
 
-    LongComparator(int numHits, String field, Long missingValue) {
+    /** 
+     * Creates a new comparator based on {@link Long#compare} for {@code numHits}.
+     * When a document has no value for the field, {@code missingValue} is substituted. 
+     */
+    public LongComparator(int numHits, String field, Long missingValue) {
       super(field, missingValue);
       values = new long[numHits];
     }
@@ -541,7 +557,8 @@
     private Scorer scorer;
     private float topValue;
 
-    RelevanceComparator(int numHits) {
+    /** Creates a new comparator based on relevance for {@code numHits}. */
+    public RelevanceComparator(int numHits) {
       scores = new float[numHits];
     }
 
@@ -618,7 +635,8 @@
     private int bottom;
     private int topValue;
 
-    DocComparator(int numHits) {
+    /** Creates a new comparator based on document ids for {@code numHits} */
+    public DocComparator(int numHits) {
       docIDs = new int[numHits];
     }
 
