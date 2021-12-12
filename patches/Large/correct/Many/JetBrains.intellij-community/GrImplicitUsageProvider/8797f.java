diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/findUsages/GrImplicitUsageProvider.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/findUsages/GrImplicitUsageProvider.java
index 127aa1f..0b75d87 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/findUsages/GrImplicitUsageProvider.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/findUsages/GrImplicitUsageProvider.java
@@ -63,7 +63,7 @@
     return false;
   }
 
-  boolean isDelegateAnnotated(@NotNull PsiModifierListOwner owner) {
+  private static boolean isDelegateAnnotated(@NotNull PsiModifierListOwner owner) {
     return PsiImplUtil.getAnnotation(owner, GroovyCommonClassNames.GROOVY_LANG_DELEGATE) != null;
   }
 }
