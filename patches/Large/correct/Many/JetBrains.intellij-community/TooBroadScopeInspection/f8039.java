diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/dataflow/TooBroadScopeInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/dataflow/TooBroadScopeInspection.java
index 47c3be8..8db0b61 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/dataflow/TooBroadScopeInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/dataflow/TooBroadScopeInspection.java
@@ -115,9 +115,9 @@
                              ProblemDescriptor descriptor)
                 throws IncorrectOperationException
         {
-            final PsiElement variableIdentifier =
-                    descriptor.getPsiElement();
-            if (!(variableIdentifier instanceof PsiVariable)) {
+            final PsiElement variableIdentifier = descriptor.getPsiElement();
+            if (!(variableIdentifier instanceof PsiIdentifier))
+            {
                 return;
             }
             final PsiVariable variable =
