diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/model/ResolvedCallImpl.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/model/ResolvedCallImpl.java
index 9045b5f..826a3d8 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/model/ResolvedCallImpl.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/model/ResolvedCallImpl.java
@@ -150,7 +150,7 @@
             parameterMap.put(valueParameterDescriptor.getOriginal(), valueParameterDescriptor);
         }
 
-        Map<ValueParameterDescriptor, ResolvedValueArgument> originalValueArguments = Maps.newHashMap(valueArguments);
+        Map<ValueParameterDescriptor, ResolvedValueArgument> originalValueArguments = Maps.newLinkedHashMap(valueArguments);
         valueArguments.clear();
         for (Map.Entry<ValueParameterDescriptor, ResolvedValueArgument> entry : originalValueArguments.entrySet()) {
             ValueParameterDescriptor substitutedVersion = parameterMap.get(entry.getKey().getOriginal());
