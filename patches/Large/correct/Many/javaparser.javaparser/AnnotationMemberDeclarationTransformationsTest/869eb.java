diff --git a/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationMemberDeclarationTransformationsTest.java b/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationMemberDeclarationTransformationsTest.java
index c9700bb..148f62e 100644
--- a/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationMemberDeclarationTransformationsTest.java
+++ b/javaparser-testing/src/test/java/com/github/javaparser/printer/lexicalpreservation/transformations/ast/body/AnnotationMemberDeclarationTransformationsTest.java
@@ -145,7 +145,7 @@
     @Test
     public void addingJavadoc() throws IOException {
         AnnotationMemberDeclaration it = consider("int foo();");
-        it.setJavaDocComment("Cool this annotation!");
+        it.setJavadocComment("Cool this annotation!");
         assertTransformedToString("@interface AD { /**Cool this annotation!*/\n" +
                 "int foo(); }", it.getParentNode().get());
     }
@@ -153,14 +153,14 @@
     @Test
     public void removingJavadoc() throws IOException {
         AnnotationMemberDeclaration it = consider("/**Cool this annotation!*/ int foo();");
-        assertTrue(it.getJavaDoc().remove());
+        assertTrue(it.getJavadocComment().remove());
         assertTransformedToString("@interface AD {  int foo(); }", it.getParentNode().get());
     }
 
     @Test
     public void replacingJavadoc() throws IOException {
         AnnotationMemberDeclaration it = consider("/**Cool this annotation!*/ int foo();");
-        it.setJavaDocComment("Super extra cool this annotation!!!");
+        it.setJavadocComment("Super extra cool this annotation!!!");
         assertTransformedToString("@interface AD { /**Super extra cool this annotation!!!*/ int foo(); }", it.getParentNode().get());
     }
 
