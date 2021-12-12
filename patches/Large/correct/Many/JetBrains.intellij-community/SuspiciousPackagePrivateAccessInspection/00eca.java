diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/dependency/SuspiciousPackagePrivateAccessInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/dependency/SuspiciousPackagePrivateAccessInspection.java
index 6821f79..03103ec 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/dependency/SuspiciousPackagePrivateAccessInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/dependency/SuspiciousPackagePrivateAccessInspection.java
@@ -150,9 +150,9 @@
     }
 
     PsiElement sourcePsi = sourceNode.getSourcePsi();
-    PsiClass sourceClass = PsiTreeUtil.getParentOfType(sourcePsi, PsiClass.class);
+    UClass sourceClass = UastUtils.findContaining(sourcePsi, UClass.class);
     if (sourceClass == null) return false;
-    return JavaResolveUtil.canAccessProtectedMember(member, memberClass, accessObjectType, sourceClass, member.hasModifierProperty(PsiModifier.STATIC));
+    return JavaResolveUtil.canAccessProtectedMember(member, memberClass, accessObjectType, sourceClass.getJavaPsi(), member.hasModifierProperty(PsiModifier.STATIC));
   }
 
   private boolean isPackageLocalAccessSuspicious(Module sourceModule, Module targetModule) {
