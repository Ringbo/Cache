diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldFinalFix.java b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldFinalFix.java
index 8979bec..fedaa7c 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldFinalFix.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldFinalFix.java
@@ -35,7 +35,7 @@
 
     @Nullable
     public static InspectionGadgetsFix buildFix(PsiField field) {
-        if (!FinalUtils.canFieldBeFinal(field)) {
+        if (!FinalUtils.canBeFinal(field)) {
             return null;
         }
         final String name = field.getName();
