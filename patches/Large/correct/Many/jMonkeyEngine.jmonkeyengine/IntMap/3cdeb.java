diff --git a/engine/src/core/com/jme3/util/IntMap.java b/engine/src/core/com/jme3/util/IntMap.java
index 1b91119..f5a12ce 100644
--- a/engine/src/core/com/jme3/util/IntMap.java
+++ b/engine/src/core/com/jme3/util/IntMap.java
@@ -61,11 +61,11 @@
         if (initialCapacity > 1 << 30){
             throw new IllegalArgumentException("initialCapacity is too large.");
         }
-        if (initialCapacity < 0){
+        if (initialCapacity <= 0){
             throw new IllegalArgumentException("initialCapacity must be greater than zero.");
         }
         if (loadFactor <= 0){
-            throw new IllegalArgumentException("initialCapacity must be greater than zero.");
+            throw new IllegalArgumentException("loadFactor must be greater than zero.");
         }
         capacity = 1;
         while (capacity < initialCapacity){
