diff --git a/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java b/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
index 11b72a4..1732c8a 100644
--- a/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
+++ b/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
@@ -410,7 +410,7 @@
         };
         Collection<DeclarationDescriptor> variants = new ReferenceVariantsHelper(bindingContext, visibilityFilter).getReferenceVariants(
                 callNameExpression, new DescriptorKindFilter(DescriptorKindFilter.FUNCTIONS_MASK | DescriptorKindFilter.CLASSIFIERS_MASK,
-                                                             Collections.<DescriptorKindExclude>emptyList()), nameFilter);
+                                                             Collections.<DescriptorKindExclude>emptyList()), false, nameFilter);
 
         Collection<Pair<? extends DeclarationDescriptor, ResolutionFacade>> itemsToShow = new ArrayList<Pair<? extends DeclarationDescriptor, ResolutionFacade>>();
         for (DeclarationDescriptor variant : variants) {
