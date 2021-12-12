diff --git a/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java b/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
index 8ce208b..dd988ec 100644
--- a/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
+++ b/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
@@ -410,7 +410,7 @@
     
     @Override
     public void visitWhiteSpace(PsiWhiteSpace space) {
-      myResult.append(space.getText().replace(' ', '\n'));
+      myResult.append(space.getText().replace('\n', ' '));
     }
 
     @Override
