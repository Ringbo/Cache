diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
index d5337fb..7e20535 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
@@ -919,7 +919,7 @@
         for (JetType bound : typeParameterDescriptor.getUpperBounds()) {
             JetType substitutedBound = substitutor.safeSubstitute(bound, Variance.INVARIANT);
             if (!JetTypeChecker.INSTANCE.isSubtypeOf(typeArgument, substitutedBound)) {
-                trace.report(UPPER_BOUND_VIOLATED.on(argumentTypeReference, substitutedBound));
+                trace.report(UPPER_BOUND_VIOLATED.on(argumentTypeReference, substitutedBound, typeArgument));
             }
         }
     }
