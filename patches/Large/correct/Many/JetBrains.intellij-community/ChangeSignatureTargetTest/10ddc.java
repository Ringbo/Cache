diff --git a/java/java-tests/testSrc/com/intellij/refactoring/ChangeSignatureTargetTest.java b/java/java-tests/testSrc/com/intellij/refactoring/ChangeSignatureTargetTest.java
index 175bed6..6ac0779 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/ChangeSignatureTargetTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/ChangeSignatureTargetTest.java
@@ -40,7 +40,7 @@
   }
 
   private void doTest(String expectedMemberName) throws Exception {
-    String basePath = "/refactoring/changeSignatureTarget/" + getTestName(false);
+    String basePath = "/refactoring/changeSignatureTarget/" + getTestName(true);
     @NonNls final String filePath = basePath + ".java";
     configureByFile(filePath);
     final PsiMember member = ChangeSignatureTargetUtil.findTargetMember(getFile(), getEditor());
