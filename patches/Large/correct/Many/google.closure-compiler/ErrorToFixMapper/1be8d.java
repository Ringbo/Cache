diff --git a/src/com/google/javascript/refactoring/ErrorToFixMapper.java b/src/com/google/javascript/refactoring/ErrorToFixMapper.java
index 2ec0974..433f4ab 100644
--- a/src/com/google/javascript/refactoring/ErrorToFixMapper.java
+++ b/src/com/google/javascript/refactoring/ErrorToFixMapper.java
@@ -57,7 +57,8 @@
   private static final Pattern USE_SHORT_NAME =
       Pattern.compile(".*Please use the short name '(.*)' instead.");
 
-  public static List<SuggestedFix> getFixesForJsError(JSError error, AbstractCompiler compiler) {
+  public static ImmutableList<SuggestedFix> getFixesForJsError(
+      JSError error, AbstractCompiler compiler) {
     SuggestedFix fix = getFixForJsError(error, compiler);
     if (fix != null) {
       return ImmutableList.of(fix);
