diff --git a/translator/src/org/jetbrains/k2js/translate/utils/DescriptorUtils.java b/translator/src/org/jetbrains/k2js/translate/utils/DescriptorUtils.java
index 1dc0e7b..8f54727 100644
--- a/translator/src/org/jetbrains/k2js/translate/utils/DescriptorUtils.java
+++ b/translator/src/org/jetbrains/k2js/translate/utils/DescriptorUtils.java
@@ -83,9 +83,9 @@
     @NotNull
     public static PropertyDescriptor getPropertyByName(@NotNull JetScope scope,
                                                        @NotNull String name) {
-        VariableDescriptor variable = scope.getLocalVariable(name);
+        VariableDescriptor variable = scope.getVariable(name);
         if (variable == null) {
-            variable = org.jetbrains.jet.lang.resolve.DescriptorUtils.filterNonExtensionProperty(scope.getProperties(name));
+            variable = scope.getPropertyByFieldReference(name);
         }
         PropertyDescriptor descriptor = (PropertyDescriptor) variable;
         assert descriptor != null : "Must have a descriptor.";
