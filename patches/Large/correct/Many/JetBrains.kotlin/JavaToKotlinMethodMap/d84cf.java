diff --git a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaToKotlinMethodMap.java b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaToKotlinMethodMap.java
index 4d9d34c..3f72237 100644
--- a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaToKotlinMethodMap.java
+++ b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaToKotlinMethodMap.java
@@ -87,7 +87,7 @@
 
     @NotNull
     public static String serializePsiMethod(@NotNull PsiMethod psiMethod) {
-        String externalName = PsiFormatUtil.getExternalName(psiMethod);
+        String externalName = PsiFormatUtil.getExternalName(psiMethod, false);
         assert externalName != null : "couldn't find external name for " + psiMethod.getText();
         return externalName;
     }
