diff --git a/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/PatchReader.java b/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/PatchReader.java
index 2368168..4c7031f 100644
--- a/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/PatchReader.java
+++ b/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/PatchReader.java
@@ -52,7 +52,7 @@
   @NonNls private static final Pattern ourContextAfterHunkStartPattern = Pattern.compile("--- (\\d+),(\\d+) ----");
 
   public PatchReader(CharSequence patchContent) {
-    this(patchContent, false);
+    this(patchContent, true);
   }
 
   public PatchReader(CharSequence patchContent, boolean parseHunks) {
