diff --git a/idea-tests/src/com/intellij/psi/AddRemoveInTypeParameterListTest.java b/idea-tests/src/com/intellij/psi/AddRemoveInTypeParameterListTest.java
index 80be631..75b63d4 100644
--- a/idea-tests/src/com/intellij/psi/AddRemoveInTypeParameterListTest.java
+++ b/idea-tests/src/com/intellij/psi/AddRemoveInTypeParameterListTest.java
@@ -6,7 +6,7 @@
 
 public class AddRemoveInTypeParameterListTest extends LightIdeaTestCase{
   public void testAdd() throws IncorrectOperationException {
-    PsiJavaFile file = (PsiJavaFile)createFile("Test.java", "class Test extends Type {\n}");
+    PsiJavaFile file = (PsiJavaFile)createLightFile("Test.java", "class Test extends Type {\n}");
     PsiClass aClass = file.getClasses()[0];
     PsiJavaCodeReferenceElement ref = aClass.getExtendsList().getReferenceElements()[0];
     PsiReferenceParameterList list = ref.getParameterList();
@@ -33,7 +33,7 @@
   }
 
   public void testRemove() throws IncorrectOperationException {
-    PsiJavaFile file = (PsiJavaFile)createFile("Test.java", "class Test extends Type<A, B, C, D> {\n}");
+    PsiJavaFile file = (PsiJavaFile)createLightFile("Test.java", "class Test extends Type<A, B, C, D> {\n}");
     PsiClass aClass = file.getClasses()[0];
     PsiJavaCodeReferenceElement ref = aClass.getExtendsList().getReferenceElements()[0];
     PsiReferenceParameterList list = ref.getParameterList();
