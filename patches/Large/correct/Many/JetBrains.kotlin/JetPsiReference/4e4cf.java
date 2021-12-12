diff --git a/idea/src/org/jetbrains/jet/plugin/references/JetPsiReference.java b/idea/src/org/jetbrains/jet/plugin/references/JetPsiReference.java
index a9f3c0a..a771388 100644
--- a/idea/src/org/jetbrains/jet/plugin/references/JetPsiReference.java
+++ b/idea/src/org/jetbrains/jet/plugin/references/JetPsiReference.java
@@ -89,7 +89,7 @@
         JetFile file = (JetFile) getElement().getContainingFile();
         BindingContext bindingContext = AnalyzerFacade.analyzeFileWithCache(file);
         Collection<? extends DeclarationDescriptor> declarationDescriptors = bindingContext.get(AMBIGUOUS_REFERENCE_TARGET, myExpression);
-        if (declarationDescriptors != null) return ResolveResult.EMPTY_ARRAY;
+        if (declarationDescriptors == null) return ResolveResult.EMPTY_ARRAY;
         ResolveResult[] results = new ResolveResult[declarationDescriptors.size()];
         int i = 0;
         for (DeclarationDescriptor descriptor : declarationDescriptors) {
