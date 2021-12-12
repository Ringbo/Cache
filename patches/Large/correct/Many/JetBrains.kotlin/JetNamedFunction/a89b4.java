diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/JetNamedFunction.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/JetNamedFunction.java
index c5b3a52..11e4de3 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/JetNamedFunction.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/JetNamedFunction.java
@@ -63,7 +63,7 @@
         }
         PsiElement nameIdentifier = getNameIdentifier();
         if (nameIdentifier == null) {
-            return false;
+            return true;
         }
         return nameIdentifier.getTextOffset() > typeParameterList.getTextOffset();
     }
