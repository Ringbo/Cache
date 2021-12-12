diff --git a/library/src/main/java/com/bumptech/glide/load/engine/DecodeHelper.java b/library/src/main/java/com/bumptech/glide/load/engine/DecodeHelper.java
index 285e5fe..3a010fe 100644
--- a/library/src/main/java/com/bumptech/glide/load/engine/DecodeHelper.java
+++ b/library/src/main/java/com/bumptech/glide/load/engine/DecodeHelper.java
@@ -137,7 +137,7 @@
   <Z> Transformation<Z> getTransformation(Class<Z> resourceClass) {
     Transformation<Z> result = (Transformation<Z>) transformations.get(resourceClass);
      if (result == null) {
-      if (!transformations.isEmpty() && isTransformationRequired) {
+      if (transformations.isEmpty() && isTransformationRequired) {
         throw new IllegalArgumentException(
             "Missing transformation for " + resourceClass + ". If you wish to"
                 + " ignore unknown resource types, use the optional transformation methods.");
