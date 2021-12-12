diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/util/TextDiffType.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/util/TextDiffType.java
index 5c7595d..1d24fc3 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/util/TextDiffType.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/util/TextDiffType.java
@@ -52,7 +52,7 @@
   private final String myDisplayName;
   private final boolean myApplied;
 
-  public static TextDiffType create(@NotNull final TextDiffTypeEnum type) {
+  public static TextDiffType create(@Nullable final TextDiffTypeEnum type) {
     if (TextDiffTypeEnum.INSERT.equals(type)) {
       return INSERT;
     } else if (TextDiffTypeEnum.CHANGED.equals(type)) {
