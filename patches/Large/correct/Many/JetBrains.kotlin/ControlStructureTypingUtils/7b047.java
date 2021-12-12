diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ControlStructureTypingUtils.java b/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ControlStructureTypingUtils.java
index a0aca77..b86ed94 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ControlStructureTypingUtils.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ControlStructureTypingUtils.java
@@ -68,7 +68,7 @@
             @Nullable MutableDataFlowInfoForArguments dataFlowInfoForArguments
     ) {
         SimpleFunctionDescriptorImpl function = createFunctionDescriptorForSpecialConstruction(
-                "<SPECIAL-FUNCTION-FOR-" + constructionName.toUpperCase() + "-RESOLVE>", argumentNames, isArgumentNullable);
+                constructionName.toUpperCase(), argumentNames, isArgumentNullable);
         JetReferenceExpression reference = JetPsiFactory.createSimpleName(
                 context.expressionTypingServices.getProject(), "fake" + constructionName + "Call");
         TracingStrategy tracing = createTracingForSpecialConstruction(call, constructionName);
@@ -81,21 +81,21 @@
     }
 
     private static SimpleFunctionDescriptorImpl createFunctionDescriptorForSpecialConstruction(
-            @NotNull String name,
+            @NotNull String constructionName,
             @NotNull List<String> argumentNames,
             @NotNull List<Boolean> isArgumentNullable
     ) {
         assert argumentNames.size() == isArgumentNullable.size();
 
         List<AnnotationDescriptor> noAnnotations = Collections.emptyList();
-        Name specialFunctionName = Name.identifierNoValidate(name);
+        Name specialFunctionName = Name.identifierNoValidate("<SPECIAL-FUNCTION-FOR-" + constructionName + "-RESOLVE>");
 
         SimpleFunctionDescriptorImpl function = new SimpleFunctionDescriptorImpl(
                 ErrorUtils.getErrorModule(),//todo hack to avoid returning true in 'isError(DeclarationDescriptor)'
                 noAnnotations, specialFunctionName, CallableMemberDescriptor.Kind.DECLARATION);
 
         TypeParameterDescriptor typeParameter = TypeParameterDescriptorImpl.createWithDefaultBound(
-                function, noAnnotations, false, Variance.INVARIANT, Name.identifier("T"), 0);
+                function, noAnnotations, false, Variance.INVARIANT, Name.identifierNoValidate("<TYPE-PARAMETER-FOR-" + constructionName + "-RESOLVE>"), 0);
 
         JetType type = new JetTypeImpl(typeParameter.getTypeConstructor(), JetScope.EMPTY);
         JetType nullableType = new JetTypeImpl(
@@ -338,7 +338,7 @@
                 if (constraintSystem.hasErrorInConstrainingTypes()) {
                     return;
                 }
-                if (constraintSystem.hasOnlyExpectedTypeMismatch()) {
+                if (constraintSystem.hasOnlyExpectedTypeMismatch() || constraintSystem.hasConflictingConstraints()) {
                     JetExpression expression = call.getCalleeExpression();
                     if (expression != null) {
                         expression.accept(checkTypeVisitor, new CheckTypeContext(trace, data.expectedType));
