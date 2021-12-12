diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/MethodRegistryDefaultTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/MethodRegistryDefaultTest.java
index c5d8101..17343b5 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/MethodRegistryDefaultTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/MethodRegistryDefaultTest.java
@@ -115,11 +115,11 @@
         when(typeDescription.asErasure()).thenReturn(typeDescription);
         when(implementationTarget.getInstrumentedType()).thenReturn(typeDescription);
         when(methodTransformer.transform(typeDescription, instrumentedMethod)).thenReturn(instrumentedMethod);
-        when(genericReturnType.asErasure()).thenReturn(returnType); // TODO
-        when(returnType.getSort()).thenReturn(TypeDefinition.Sort.NON_GENERIC);
+        when(genericReturnType.asErasure()).thenReturn(returnType);
+        when(genericReturnType.getSort()).thenReturn(TypeDefinition.Sort.NON_GENERIC);
         when(returnType.isVisibleTo(typeDescription)).thenReturn(true);
-        when(genericParameterType.asErasure()).thenReturn(parameterType); // TODO
-        when(parameterType.getSort()).thenReturn(TypeDefinition.Sort.NON_GENERIC);
+        when(genericParameterType.asErasure()).thenReturn(parameterType);
+        when(genericParameterType.getSort()).thenReturn(TypeDefinition.Sort.NON_GENERIC);
         when(parameterType.isVisibleTo(typeDescription)).thenReturn(true);
         when(instrumentedMethod.getReturnType()).thenReturn(genericReturnType);
         when(instrumentedMethod.getParameters()).thenReturn(new ParameterList.Explicit(Collections.singletonList(parameterDescription)));
