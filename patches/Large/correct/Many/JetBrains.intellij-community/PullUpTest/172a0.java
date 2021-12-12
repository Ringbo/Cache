diff --git a/java/java-tests/testSrc/com/intellij/refactoring/PullUpTest.java b/java/java-tests/testSrc/com/intellij/refactoring/PullUpTest.java
index 4cd7f04..f0d4e77 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/PullUpTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/PullUpTest.java
@@ -193,7 +193,7 @@
       assertTrue(interfaces[0].isWritable());
       targetClass = interfaces[0];
     }
-    MemberInfo[] infos = RefactoringTestUtil.findMembers(sourceClass, membersToFind);
+    final MemberInfo[] infos = RefactoringTestUtil.findMembers(sourceClass, membersToFind);
 
     final int[] countMoved = {0};
     final MoveMemberListener listener = new MoveMemberListener() {
