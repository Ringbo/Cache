diff --git a/source/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java b/source/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
index 2da95a7..514729b 100644
--- a/source/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
+++ b/source/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
@@ -79,7 +79,7 @@
   }
 
   public PsiVariable resolveReferencedVariable(String referenceText, PsiElement context) {
-    final FileElement holderElement = com.intellij.psi.impl.source.DummyHolderFactory.createHolder(myManager, context).getTreeElement();
+    final FileElement holderElement = DummyHolderFactory.createHolder(myManager, context).getTreeElement();
     TreeElement ref = Parsing.parseJavaCodeReferenceText(myManager, referenceText, holderElement.getCharTable());
     if (ref == null) return null;
     TreeUtil.addChildren(holderElement, ref);
@@ -630,7 +630,7 @@
     }
     else {
       PsiType guess = constraint.getFirst();
-      if (guess == null) guess = PsiType.getJavaLangObject(manager, scope);
+      if (guess == null) guess = TypeConversionUtil.typeParameterErasure(typeParameter);
       if (forCompletion && !(guess instanceof PsiWildcardType)) guess = PsiWildcardType.createExtends(manager, guess);
 
       //The following code is the result of deep thought, do not shit it out before discussing with [ven]
@@ -656,7 +656,7 @@
     return result;
   }
 
-  private ThreadLocal<List<PsiMethodCallExpression>> myBlockedForInferenceMethodCalls = new ThreadLocal<List<PsiMethodCallExpression>>() {
+  private final ThreadLocal<List<PsiMethodCallExpression>> myBlockedForInferenceMethodCalls = new ThreadLocal<List<PsiMethodCallExpression>>() {
     protected List<PsiMethodCallExpression> initialValue() {
       return new ArrayList<PsiMethodCallExpression>(2);
     }
