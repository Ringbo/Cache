diff --git a/library/src/main/java/com/bumptech/glide/load/engine/cache/MemorySizeCalculator.java b/library/src/main/java/com/bumptech/glide/load/engine/cache/MemorySizeCalculator.java
index b9b7211..1418c46 100644
--- a/library/src/main/java/com/bumptech/glide/load/engine/cache/MemorySizeCalculator.java
+++ b/library/src/main/java/com/bumptech/glide/load/engine/cache/MemorySizeCalculator.java
@@ -184,7 +184,7 @@
      * returns this Builder.
      */
     public Builder setMemoryCacheScreens(float memoryCacheScreens) {
-      Preconditions.checkArgument(bitmapPoolScreens >= 0,
+      Preconditions.checkArgument(memoryCacheScreens >= 0,
           "Memory cache screens must be greater than or equal to 0");
       this.memoryCacheScreens = memoryCacheScreens;
       return this;
