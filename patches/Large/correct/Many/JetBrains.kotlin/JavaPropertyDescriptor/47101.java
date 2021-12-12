diff --git a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
index 9ad24f1..1b15a7b 100644
--- a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
+++ b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
@@ -47,7 +47,7 @@
     @Override
     public JavaCallableMemberDescriptor enhance(
             @Nullable JetType enhancedReceiverType,
-            @NotNull List<ValueParameterDescriptor> enhancedValueParameters,
+            @NotNull List<JetType> enhancedValueParametersTypes,
             @NotNull JetType enhancedReturnType
     ) {
         JavaPropertyDescriptor enhanced = new JavaPropertyDescriptor(
