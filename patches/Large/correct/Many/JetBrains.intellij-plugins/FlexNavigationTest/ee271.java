diff --git a/flex/flex-tests/testSrc/com/intellij/lang/javascript/FlexNavigationTest.java b/flex/flex-tests/testSrc/com/intellij/lang/javascript/FlexNavigationTest.java
index 3159e55..92ebd7f 100644
--- a/flex/flex-tests/testSrc/com/intellij/lang/javascript/FlexNavigationTest.java
+++ b/flex/flex-tests/testSrc/com/intellij/lang/javascript/FlexNavigationTest.java
@@ -102,7 +102,7 @@
 
     Collection<PsiElement> elementsToCheck;
     GlobalSearchScope scope;
-    if (clazz == null) {
+    if (clazz == null || !(clazz instanceof JSQualifiedNamedElement)) {
       PsiReference reference = TargetElementUtil.findReference(editor);
       assertNotNull(reference);
       elementsToCheck = TargetElementUtil.getInstance().getTargetCandidates(reference);
