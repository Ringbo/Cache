diff --git a/java/java-psi-api/src/com/intellij/psi/util/PsiTypesUtil.java b/java/java-psi-api/src/com/intellij/psi/util/PsiTypesUtil.java
index d1adeca..f4bd687 100644
--- a/java/java-psi-api/src/com/intellij/psi/util/PsiTypesUtil.java
+++ b/java/java-psi-api/src/com/intellij/psi/util/PsiTypesUtil.java
@@ -336,7 +336,7 @@
      * @return false if type is null or has no explicit canonical type representation (e. g. intersection type)
      */
   public static boolean isDenotableType(@Nullable PsiType type, @NotNull PsiElement context) {
-    if (type == null) return false;
+    if (type == null || type instanceof PsiWildcardType) return false;
     PsiElementFactory elementFactory = JavaPsiFacade.getElementFactory(context.getProject());
     try {
       PsiType typeAfterReplacement = elementFactory.createTypeElementFromText(type.getCanonicalText(), context).getType();
