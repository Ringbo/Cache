diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/classlayout/InterfaceNeverImplementedInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/classlayout/InterfaceNeverImplementedInspection.java
index f7bc5e3..fb7680e 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/classlayout/InterfaceNeverImplementedInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/classlayout/InterfaceNeverImplementedInspection.java
@@ -64,7 +64,7 @@
             extends BaseInspectionVisitor {
 
         public void visitClass(@NotNull PsiClass aClass) {
-            if (!aClass.isInterface()) {
+            if (!aClass.isInterface() || aClass.isAnnotationType()) {
                 return;
             }
             if (ignoreInterfacesThatOnlyDeclareConstants &&
