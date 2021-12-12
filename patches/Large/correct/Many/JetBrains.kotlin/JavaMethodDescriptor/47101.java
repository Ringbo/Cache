diff --git a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaMethodDescriptor.java b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaMethodDescriptor.java
index 22435b6..e999b40 100644
--- a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaMethodDescriptor.java
+++ b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaMethodDescriptor.java
@@ -97,7 +97,7 @@
     @NotNull
     public JavaMethodDescriptor enhance(
             @Nullable JetType enhancedReceiverType,
-            @NotNull List<ValueParameterDescriptor> enhancedValueParameters,
+            @NotNull List<JetType> enhancedValueParametersTypes,
             @NotNull JetType enhancedReturnType
     ) {
         JavaMethodDescriptor enhancedMethod = createSubstitutedCopy(getContainingDeclaration(), getOriginal(), getKind());
@@ -105,7 +105,7 @@
                 enhancedReceiverType,
                 getDispatchReceiverParameter(),
                 getTypeParameters(),
-                enhancedValueParameters,
+                DescriptorsPackage.createEnhancedValueParameters(enhancedValueParametersTypes, getValueParameters(), enhancedMethod),
                 enhancedReturnType,
                 getModality(),
                 getVisibility()
