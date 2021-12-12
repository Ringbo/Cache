diff --git a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/InplaceRefactoring.java b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/InplaceRefactoring.java
index a94cd0c..db30a10 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/InplaceRefactoring.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/InplaceRefactoring.java
@@ -735,7 +735,7 @@
       if (initialInjectedHost != null && initialInjectedHost != injectionHost) {
         return false;
       }
-      return injectedLanguageManager.injectedToHost(element, textRange).shiftRight(shiftOffset).contains(offset);
+      return injectedLanguageManager.injectedToHost(element, textRange).shiftRight(shiftOffset).containsOffset(offset);
     }
     return textRange.shiftRight(shiftOffset).containsOffset(offset);
   }
