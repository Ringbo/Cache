diff --git a/core/src/main/java/com/google/errorprone/BugCheckerInfo.java b/core/src/main/java/com/google/errorprone/BugCheckerInfo.java
index 304f089..38419d3 100644
--- a/core/src/main/java/com/google/errorprone/BugCheckerInfo.java
+++ b/core/src/main/java/com/google/errorprone/BugCheckerInfo.java
@@ -99,7 +99,10 @@
   private final Set<Class<? extends Annotation>> customSuppressionAnnotations;
 
   public static BugCheckerInfo create(Class<? extends BugChecker> checker) {
-    BugPattern pattern = checkNotNull(checker.getAnnotation(BugPattern.class));
+    BugPattern pattern =
+        checkNotNull(
+            checker.getAnnotation(BugPattern.class),
+            "BugCheckers must be annotated with @BugPattern");
     try {
       BugPatternValidator.validate(pattern);
     } catch (ValidationException e) {
