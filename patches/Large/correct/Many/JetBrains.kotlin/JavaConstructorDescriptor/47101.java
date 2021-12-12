diff --git a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaConstructorDescriptor.java b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaConstructorDescriptor.java
index 6afd388..44090e6 100644
--- a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaConstructorDescriptor.java
+++ b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaConstructorDescriptor.java
@@ -97,7 +97,7 @@
     @NotNull
     public JavaConstructorDescriptor enhance(
             @Nullable JetType enhancedReceiverType,
-            @NotNull List<ValueParameterDescriptor> enhancedValueParameters,
+            @NotNull List<JetType> enhancedValueParametersTypes,
             @NotNull JetType enhancedReturnType
     ) {
         JavaConstructorDescriptor enhanced = createSubstitutedCopy(getContainingDeclaration(), getOriginal(), getKind());
@@ -105,7 +105,7 @@
                 enhancedReceiverType,
                 getDispatchReceiverParameter(),
                 getTypeParameters(),
-                enhancedValueParameters,
+                DescriptorsPackage.createEnhancedValueParameters(enhancedValueParametersTypes, getValueParameters(), enhanced),
                 enhancedReturnType,
                 getModality(),
                 getVisibility()
