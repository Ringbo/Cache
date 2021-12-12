diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/AnnotationUtility.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/AnnotationUtility.java
index 3f85374..9676c4e 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/AnnotationUtility.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/AnnotationUtility.java
@@ -91,7 +91,7 @@
     public static DetailAST getAnnotationHolder(DetailAST ast)
     {
         if (ast == null) {
-            throw new NullPointerException("the ast is null");
+            throw new IllegalArgumentException("the ast is null");
         }
 
         final DetailAST annotationHolder;
@@ -136,11 +136,11 @@
         String annotation)
     {
         if (ast == null) {
-            throw new NullPointerException("the ast is null");
+            throw new IllegalArgumentException("the ast is null");
         }
 
         if (annotation == null) {
-            throw new NullPointerException("the annotation is null");
+            throw new IllegalArgumentException("the annotation is null");
         }
 
         if (StringUtils.isBlank(annotation)) {
@@ -179,7 +179,7 @@
     public static DetailAST annotatingWhat(DetailAST ast)
     {
         if (ast == null) {
-            throw new NullPointerException("the ast is null");
+            throw new IllegalArgumentException("the ast is null");
         }
 
         if (ast.getType() != TokenTypes.ANNOTATION) {
