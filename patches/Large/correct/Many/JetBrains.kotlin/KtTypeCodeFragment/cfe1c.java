diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtTypeCodeFragment.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtTypeCodeFragment.java
index fe012c0..bf41e96 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtTypeCodeFragment.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtTypeCodeFragment.java
@@ -27,12 +27,12 @@
     }
 
     public boolean hasTypeReference() {
-        return getContentElement() instanceof KtTypeReference;
+        return getContentElement() != null;
     }
 
     @Nullable
     @Override
-    public KtElement getContentElement() {
+    public KtTypeReference getContentElement() {
         return findChildByClass(KtTypeReference.class);
     }
 }
