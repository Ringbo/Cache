diff --git a/core/descriptors/src/org/jetbrains/kotlin/descriptors/impl/ConstructorDescriptorImpl.java b/core/descriptors/src/org/jetbrains/kotlin/descriptors/impl/ConstructorDescriptorImpl.java
index af8d115..765e7b0 100644
--- a/core/descriptors/src/org/jetbrains/kotlin/descriptors/impl/ConstructorDescriptorImpl.java
+++ b/core/descriptors/src/org/jetbrains/kotlin/descriptors/impl/ConstructorDescriptorImpl.java
@@ -149,7 +149,7 @@
     public ConstructorDescriptor copy(DeclarationDescriptor newOwner, Modality modality, Visibility visibility, Kind kind, boolean copyOverrides) {
         return (ConstructorDescriptor) doSubstitute(
                 TypeSubstitutor.EMPTY, newOwner, modality, visibility,
-                isOperator(), isInfix(), isExternal(), isInline(), isTailrec(),
+                isOperator(), isInfix(), isExternal(), isInline(), isTailrec(), hasStableParameterNames(), hasSynthesizedParameterNames(),
                 null, copyOverrides, kind
         );
     }
