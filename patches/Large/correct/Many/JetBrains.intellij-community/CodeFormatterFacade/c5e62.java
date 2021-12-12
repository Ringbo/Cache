diff --git a/source/com/intellij/psi/impl/source/codeStyle/CodeFormatterFacade.java b/source/com/intellij/psi/impl/source/codeStyle/CodeFormatterFacade.java
index 6bb1010..c1a55d3 100644
--- a/source/com/intellij/psi/impl/source/codeStyle/CodeFormatterFacade.java
+++ b/source/com/intellij/psi/impl/source/codeStyle/CodeFormatterFacade.java
@@ -78,7 +78,7 @@
         // we expand the chameleons here for effectiveness
         if (current instanceof ChameleonElement) {
           ASTNode next = current.getTreeNext();
-          final ASTNode astNode = ChameleonTransforming.transform((ChameleonElement)element);
+          final ASTNode astNode = ChameleonTransforming.transform((ChameleonElement)current);
           if (astNode == null) current = next;
           else current = astNode;
         }
