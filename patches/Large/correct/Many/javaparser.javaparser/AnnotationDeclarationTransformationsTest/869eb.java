diff --git a/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationDeclarationTransformationsTest.java b/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationDeclarationTransformationsTest.java
index 068f6ce..ae9aeec 100644
--- a/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationDeclarationTransformationsTest.java
+++ b/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationDeclarationTransformationsTest.java
@@ -104,14 +104,14 @@
     @Test
     public void addingJavadoc() throws IOException {
         considerExample("AnnotationDeclaration_Example3_original");
-        cu.getAnnotationDeclarationByName("ClassPreamble").get().setJavaDocComment("Cool this annotation!");
+        cu.getAnnotationDeclarationByName("ClassPreamble").get().setJavadocComment("Cool this annotation!");
         assertTransformed("AnnotationDeclaration_Example8", cu);
     }
 
     @Test
     public void removingJavadoc() throws IOException {
         considerExample("AnnotationDeclaration_Example9_original");
-        boolean removed = cu.getAnnotationDeclarationByName("ClassPreamble").get().getJavaDoc().remove();
+        boolean removed = cu.getAnnotationDeclarationByName("ClassPreamble").get().getJavadocComment().remove();
         assertEquals(true, removed);
         assertTransformed("AnnotationDeclaration_Example9", cu);
     }
@@ -119,7 +119,7 @@
     @Test
     public void replacingJavadoc() throws IOException {
         considerExample("AnnotationDeclaration_Example9_original");
-        cu.getAnnotationDeclarationByName("ClassPreamble").get().setJavaDocComment("Super extra cool this annotation!!!");
+        cu.getAnnotationDeclarationByName("ClassPreamble").get().setJavadocComment("Super extra cool this annotation!!!");
         assertTransformed("AnnotationDeclaration_Example10", cu);
     }
 
