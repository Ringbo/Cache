diff --git a/core/descriptors/src/org/jetbrains/kotlin/resolve/OverridingUtil.java b/core/descriptors/src/org/jetbrains/kotlin/resolve/OverridingUtil.java
index 3700b40..09ce9be 100644
--- a/core/descriptors/src/org/jetbrains/kotlin/resolve/OverridingUtil.java
+++ b/core/descriptors/src/org/jetbrains/kotlin/resolve/OverridingUtil.java
@@ -239,7 +239,7 @@
     }
 
     @Nullable
-    static OverrideCompatibilityInfo checkReceiverAndParameterCount(
+    private static OverrideCompatibilityInfo checkReceiverAndParameterCount(
             CallableDescriptor superDescriptor,
             CallableDescriptor subDescriptor
     ) {
@@ -290,7 +290,7 @@
         return true;
     }
 
-    static List<KotlinType> compiledValueParameters(CallableDescriptor callableDescriptor) {
+    private static List<KotlinType> compiledValueParameters(CallableDescriptor callableDescriptor) {
         ReceiverParameterDescriptor receiverParameter = callableDescriptor.getExtensionReceiverParameter();
         List<KotlinType> parameters = new ArrayList<KotlinType>();
         if (receiverParameter != null) {
@@ -501,6 +501,7 @@
 
         H firstNonFlexible = null;
         for (H candidate : candidates) {
+            //noinspection ConstantConditions
             if (!FlexibleTypesKt.isFlexible(descriptorByHandle.invoke(candidate).getReturnType())) {
                 firstNonFlexible = candidate;
                 break;
