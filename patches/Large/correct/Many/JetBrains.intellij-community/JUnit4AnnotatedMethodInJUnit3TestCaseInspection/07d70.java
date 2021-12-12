diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/junit/JUnit4AnnotatedMethodInJUnit3TestCaseInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/junit/JUnit4AnnotatedMethodInJUnit3TestCaseInspection.java
index a8639f2..302c6ce 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/junit/JUnit4AnnotatedMethodInJUnit3TestCaseInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/junit/JUnit4AnnotatedMethodInJUnit3TestCaseInspection.java
@@ -64,7 +64,7 @@
     private static class RemoveExtendsTestCaseFix extends InspectionGadgetsFix {
         private final String className;
 
-        public RemoveExtendsTestCaseFix(String className) {
+        RemoveExtendsTestCaseFix(String className) {
             this.className = className;
         }
 
@@ -137,7 +137,7 @@
         @Override
         public void visitMethod(PsiMethod method) {
             super.visitMethod(method);
-            if (TestUtils.isJUnit4TestMethod(method)) {
+            if (!TestUtils.isJUnit4TestMethod(method)) {
                 return;
             }
             final PsiClass containingClass = method.getContainingClass();
