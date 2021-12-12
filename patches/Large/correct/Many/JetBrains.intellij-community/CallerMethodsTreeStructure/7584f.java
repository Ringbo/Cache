diff --git a/java/java-impl/src/com/intellij/ide/hierarchy/call/CallerMethodsTreeStructure.java b/java/java-impl/src/com/intellij/ide/hierarchy/call/CallerMethodsTreeStructure.java
index b68dc62..32b5550 100644
--- a/java/java-impl/src/com/intellij/ide/hierarchy/call/CallerMethodsTreeStructure.java
+++ b/java/java-impl/src/com/intellij/ide/hierarchy/call/CallerMethodsTreeStructure.java
@@ -70,7 +70,8 @@
               if (originalClass.isInheritor(superClass, true)) {
                 return true;
               }
-            } if (qualifier != null) {
+            }
+            if (qualifier != null && !methodToFind.hasModifierProperty(PsiModifier.STATIC)) {
               final PsiType qualifierType = qualifier.getType();
               if (qualifierType == null) return true;
               if (!TypeConversionUtil.isAssignable(qualifierType, originalType)) {
