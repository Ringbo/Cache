diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaPsiUtil.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaPsiUtil.java
index f6f72db..0e5c8d6 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaPsiUtil.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaPsiUtil.java
@@ -66,7 +66,7 @@
 
   @NotNull
   public static Nullness getElementNullability(@Nullable PsiType resultType, @Nullable PsiModifierListOwner owner) {
-    if (owner == null) {
+    if (owner == null || resultType instanceof PsiPrimitiveType) {
       return Nullness.UNKNOWN;
     }
 
