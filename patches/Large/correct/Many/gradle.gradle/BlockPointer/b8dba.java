diff --git a/subprojects/persistent-cache/src/main/java/org/gradle/cache/internal/btree/BlockPointer.java b/subprojects/persistent-cache/src/main/java/org/gradle/cache/internal/btree/BlockPointer.java
index 7085c49..2d994b7 100644
--- a/subprojects/persistent-cache/src/main/java/org/gradle/cache/internal/btree/BlockPointer.java
+++ b/subprojects/persistent-cache/src/main/java/org/gradle/cache/internal/btree/BlockPointer.java
@@ -27,7 +27,7 @@
 
     public static BlockPointer pos(long pos) {
         if (pos < -1) {
-            throw new IllegalArgumentException("pos must be >= -1");
+            throw new CorruptedCacheException("block pointer must be >= -1, but was" + pos);
         }
         if (pos == -1) {
             return NULL;
