diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
index 632a990..6a0d676 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
@@ -952,7 +952,7 @@
                 WritableScope writableScope = new WritableScopeImpl(
                         scope, containingDeclaration, new TraceBasedRedeclarationHandler(trace),
                         "Scope with type parameters of a property");
-                typeParameterDescriptors = resolveTypeParametersForCallableDescriptor(containingDeclaration, writableScope, typeParameters,
+                typeParameterDescriptors = resolveTypeParametersForCallableDescriptor(propertyDescriptor, writableScope, typeParameters,
                                                                                       trace);
                 writableScope.changeLockLevel(WritableScope.LockLevel.READING);
                 resolveGenericBounds(property, propertyDescriptor, writableScope, typeParameterDescriptors, trace);
