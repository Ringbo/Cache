diff --git a/openapi/src/com/intellij/psi/PsiVariable.java b/openapi/src/com/intellij/psi/PsiVariable.java
index 29e4013..70bcbdd 100644
--- a/openapi/src/com/intellij/psi/PsiVariable.java
+++ b/openapi/src/com/intellij/psi/PsiVariable.java
@@ -70,12 +70,12 @@
    */
   @Nullable Object computeConstantValue();
 
-  @NotNull @NonNls String getName();
+  @Nullable @NonNls String getName();
 
   /**
    * Returns the identifier declaring the name of the variable.
    *
    * @return the variable name identifier.
    */
-  @NotNull PsiIdentifier getNameIdentifier();
+  @Nullable PsiIdentifier getNameIdentifier();
 }
