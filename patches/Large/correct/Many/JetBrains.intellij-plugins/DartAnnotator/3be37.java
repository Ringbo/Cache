diff --git a/Dart/src/com/jetbrains/lang/dart/ide/annotator/DartAnnotator.java b/Dart/src/com/jetbrains/lang/dart/ide/annotator/DartAnnotator.java
index 71559a2..411572d 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/annotator/DartAnnotator.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/annotator/DartAnnotator.java
@@ -306,15 +306,17 @@
   @Nullable
   private static ProblemHighlightType getSpecialHighlightType(@NotNull final String errorMessage) {
     // see [Dart repo]/pkg/analyzer/lib/src/generated/error.dart
+    // todo it is now possible to switch to checking error code instead of error message
 
-    if (errorMessage.equals("Unused import") ||
-        errorMessage.equals("Duplicate import") ||
-        errorMessage.endsWith(" is not used") ||
+    if (errorMessage.startsWith("Unused import") ||
+        errorMessage.startsWith("Duplicate import") ||
+        errorMessage.contains(" is not used") ||
+        errorMessage.contains(" isn't used") ||
         errorMessage.startsWith("Dead code")) {
       return ProblemHighlightType.LIKE_UNUSED_SYMBOL;
     }
 
-    if (errorMessage.endsWith(" is deprecated")) {
+    if (errorMessage.contains(" is deprecated")) {
       return ProblemHighlightType.LIKE_DEPRECATED;
     }
 
