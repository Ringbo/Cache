diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
index 03d9144..89a95ab 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
@@ -843,7 +843,7 @@
                 name == null ? "<no name>" : name
         );
         JetType inType = isMutable ? type : null;
-        propertyDescriptor.setType(inType, type, Collections.<TypeParameterDescriptor>emptyList(), ReceiverDescriptor.NO_RECEIVER);
+        propertyDescriptor.setType(inType, type, Collections.<TypeParameterDescriptor>emptyList(), DescriptorUtils.getExpectedThisObjectIfNeeded(classDescriptor), ReceiverDescriptor.NO_RECEIVER);
 
         PropertyGetterDescriptor getter = createDefaultGetter(propertyDescriptor);
         PropertySetterDescriptor setter = createDefaultSetter(propertyDescriptor);
