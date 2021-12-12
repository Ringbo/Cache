diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
index bcdc03b..fae2ba3 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
@@ -368,7 +368,7 @@
                 if (conventionMethodFound(getMethodResults)) {
                     FunctionDescriptor descriptor = getMethodResults.getResultingDescriptor();
                     KotlinType returnTypeOfGetMethod = descriptor.getReturnType();
-                    if (returnTypeOfGetMethod != null) {
+                    if (returnTypeOfGetMethod != null && !TypeUtils.noExpectedType(expectedType)) {
                         constraintSystem.addSupertypeConstraint(expectedType, returnTypeOfGetMethod, FROM_COMPLETER.position());
                     }
                     addConstraintForThisValue(constraintSystem, descriptor);
