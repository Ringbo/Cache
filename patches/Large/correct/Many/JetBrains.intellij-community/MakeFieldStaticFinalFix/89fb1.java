diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldStaticFinalFix.java b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldStaticFinalFix.java
index 3134881..0b05940 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldStaticFinalFix.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/MakeFieldStaticFinalFix.java
@@ -45,7 +45,7 @@
         if (initializer == null) {
             return null;
         }
-        if (!FinalUtils.canFieldBeFinal(field)) {
+        if (!FinalUtils.canBeFinal(field)) {
             return null;
         }
         return new MakeFieldStaticFinalFix(field.getName());
