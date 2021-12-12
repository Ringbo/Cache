diff --git a/plugins/lint/lint-api/src/com/android/tools/klint/detector/api/JavaContext.java b/plugins/lint/lint-api/src/com/android/tools/klint/detector/api/JavaContext.java
index 982ebd9..5b37cca 100644
--- a/plugins/lint/lint-api/src/com/android/tools/klint/detector/api/JavaContext.java
+++ b/plugins/lint/lint-api/src/com/android/tools/klint/detector/api/JavaContext.java
@@ -69,7 +69,7 @@
      * @return a location for the given node
      */
     @Override
-    public Location getLocation(@NotNull UElement element) {
+    public Location getLocation(@Nullable UElement element) {
         return UastAndroidContext.DefaultImpls.getLocation(this, element);
     }
 
