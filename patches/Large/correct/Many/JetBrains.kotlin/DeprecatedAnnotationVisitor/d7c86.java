diff --git a/idea/src/org/jetbrains/jet/plugin/highlighter/DeprecatedAnnotationVisitor.java b/idea/src/org/jetbrains/jet/plugin/highlighter/DeprecatedAnnotationVisitor.java
index 6f5134d..51ad6b4 100644
--- a/idea/src/org/jetbrains/jet/plugin/highlighter/DeprecatedAnnotationVisitor.java
+++ b/idea/src/org/jetbrains/jet/plugin/highlighter/DeprecatedAnnotationVisitor.java
@@ -206,11 +206,11 @@
         AnnotationDescriptor deprecated = getDeprecated(descriptor);
         if (deprecated != null) {
             if (isWarning) {
-                holder.createInfoAnnotation(element, composeTooltipString(descriptor, deprecated))
+                holder.createWarningAnnotation(element, composeTooltipString(descriptor, deprecated))
                         .setTextAttributes(CodeInsightColors.WARNINGS_ATTRIBUTES);
             }
             else {
-                holder.createInfoAnnotation(element, composeTooltipString(descriptor, deprecated))
+                holder.createWarningAnnotation(element, composeTooltipString(descriptor, deprecated))
                         .setTextAttributes(CodeInsightColors.DEPRECATED_ATTRIBUTES);
             }
             return true;
