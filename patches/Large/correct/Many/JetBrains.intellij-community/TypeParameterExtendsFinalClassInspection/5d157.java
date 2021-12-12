diff --git a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/inheritance/TypeParameterExtendsFinalClassInspection.java b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/inheritance/TypeParameterExtendsFinalClassInspection.java
index 4dc3a18..1016f73 100644
--- a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/inheritance/TypeParameterExtendsFinalClassInspection.java
+++ b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/inheritance/TypeParameterExtendsFinalClassInspection.java
@@ -202,7 +202,7 @@
             return true;
           }
           final PsiCapturedWildcardType capturedWildcardType = (PsiCapturedWildcardType)type;
-          final PsiType upperBound = capturedWildcardType.getUpperBound();
+          final PsiType upperBound = capturedWildcardType.getUpperBound(false);
           if (iterationType.equals(upperBound)) {
             return false;
           }
