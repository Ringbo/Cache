diff --git a/lucene/facet/src/java/org/apache/lucene/facet/taxonomy/writercache/cl2o/CollisionMap.java b/lucene/facet/src/java/org/apache/lucene/facet/taxonomy/writercache/cl2o/CollisionMap.java
index 247de72..bd6f98d 100644
--- a/lucene/facet/src/java/org/apache/lucene/facet/taxonomy/writercache/cl2o/CollisionMap.java
+++ b/lucene/facet/src/java/org/apache/lucene/facet/taxonomy/writercache/cl2o/CollisionMap.java
@@ -54,11 +54,11 @@
 
   private Entry[] entries;
 
-  public CollisionMap(CharBlockArray labelRepository) {
+  CollisionMap(CharBlockArray labelRepository) {
     this(16 * 1024, 0.75f, labelRepository);
   }
 
-  public CollisionMap(int initialCapacity, CharBlockArray labelRepository) {
+  CollisionMap(int initialCapacity, CharBlockArray labelRepository) {
     this(initialCapacity, 0.75f, labelRepository);
   }
 
