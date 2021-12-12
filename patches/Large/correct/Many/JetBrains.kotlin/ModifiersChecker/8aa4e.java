diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/ModifiersChecker.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/ModifiersChecker.java
index 0496343..92895ac 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/ModifiersChecker.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/ModifiersChecker.java
@@ -295,7 +295,8 @@
         JetAnnotationEntry annotationEntry = trace.get(BindingContext.ANNOTATION_DESCRIPTOR_TO_PSI_ELEMENT, annotation);
         if (annotationEntry == null) return;
 
-        if (!DescriptorUtils.isTopLevelDeclaration(descriptor) || !(descriptor instanceof FunctionDescriptor)) {
+        if (!DescriptorUtils.isTopLevelDeclaration(descriptor) || !(descriptor instanceof FunctionDescriptor) ||
+            descriptor instanceof ConstructorDescriptor) {
             trace.report(INAPPLICABLE_ANNOTATION.on(annotationEntry));
         }
 
