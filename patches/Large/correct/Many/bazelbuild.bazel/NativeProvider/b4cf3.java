diff --git a/src/main/java/com/google/devtools/build/lib/packages/NativeProvider.java b/src/main/java/com/google/devtools/build/lib/packages/NativeProvider.java
index d859bd1..30b7ae8 100644
--- a/src/main/java/com/google/devtools/build/lib/packages/NativeProvider.java
+++ b/src/main/java/com/google/devtools/build/lib/packages/NativeProvider.java
@@ -89,13 +89,14 @@
      * providers, such as the {@code native} object, and the struct fields of {@code ctx} like
      * {@code ctx.attr}.
      * */
-    public Info create(Map<String, Object> values, String errorMessageFormatForUnknownField) {
+    public SkylarkInfo create(
+        Map<String, Object> values, String errorMessageFormatForUnknownField) {
       return SkylarkInfo.createSchemalessWithCustomMessage(
           this, values, errorMessageFormatForUnknownField);
     }
 
     /** Creates an empty struct with the given location. */
-    public Info createEmpty(Location loc) {
+    public SkylarkInfo createEmpty(Location loc) {
       return SkylarkInfo.createSchemaless(this, ImmutableMap.of(), loc);
     }
   }
