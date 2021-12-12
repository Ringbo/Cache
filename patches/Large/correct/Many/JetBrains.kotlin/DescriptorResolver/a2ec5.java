diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
index 895c2be..462d0df 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
@@ -701,7 +701,7 @@
             }
             else {
                 LexicalWritableScope writableScope = new LexicalWritableScope(
-                        scope, containingDeclaration, false, null, new TraceBasedLocalRedeclarationChecker(trace),
+                        scope, containingDeclaration, false, null, new TraceBasedLocalRedeclarationChecker(trace, overloadChecker),
                         LexicalScopeKind.TYPE_ALIAS_HEADER);
                 typeParameterDescriptors = resolveTypeParametersForDescriptor(
                         typeAliasDescriptor, writableScope, scope, typeParameters, trace);
