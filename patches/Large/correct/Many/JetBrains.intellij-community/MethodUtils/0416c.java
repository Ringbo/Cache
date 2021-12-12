diff --git a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/MethodUtils.java b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/MethodUtils.java
index 68d5bb8..f69dde9 100644
--- a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/MethodUtils.java
+++ b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/MethodUtils.java
@@ -45,7 +45,7 @@
 
   @Contract("null -> false")
   public static boolean isCompareTo(@Nullable PsiMethod method) {
-    return method != null && !methodMatches(method, null, PsiType.INT, HardcodedMethodConstants.COMPARE_TO, PsiType.NULL)
+    return method != null && methodMatches(method, null, PsiType.INT, HardcodedMethodConstants.COMPARE_TO, PsiType.NULL)
       && InheritanceUtil.isInheritor(method.getContainingClass(), CommonClassNames.JAVA_LANG_COMPARABLE);
   }
 
