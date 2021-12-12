diff --git a/src/com/jetbrains/lang/dart/psi/impl/AbstractDartComponentImpl.java b/src/com/jetbrains/lang/dart/psi/impl/AbstractDartComponentImpl.java
index 7790dce..8db05d4 100644
--- a/src/com/jetbrains/lang/dart/psi/impl/AbstractDartComponentImpl.java
+++ b/src/com/jetbrains/lang/dart/psi/impl/AbstractDartComponentImpl.java
@@ -132,7 +132,7 @@
         }
         DartExecutionScope root = PsiTreeUtil.getTopmostParentOfType(AbstractDartComponentImpl.this, DartExecutionScope.class);
         DartPartOfStatement partOfStatement = PsiTreeUtil.getChildOfType(root, DartPartOfStatement.class);
-        return partOfStatement == null ? null : partOfStatement.getLibraryId().toString();
+        return partOfStatement == null ? null : partOfStatement.getLibraryId().getCanonicalText();
       }
 
       @Override
