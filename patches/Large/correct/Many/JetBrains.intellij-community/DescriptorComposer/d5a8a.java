diff --git a/lang-impl/src/com/intellij/codeInspection/ex/DescriptorComposer.java b/lang-impl/src/com/intellij/codeInspection/ex/DescriptorComposer.java
index bf30376..57b26fe 100644
--- a/lang-impl/src/com/intellij/codeInspection/ex/DescriptorComposer.java
+++ b/lang-impl/src/com/intellij/codeInspection/ex/DescriptorComposer.java
@@ -83,7 +83,7 @@
     if (refElement instanceof RefElement && !((RefElement)refElement).isValid()) return;
 
     final QuickFix[] fixes = descriptor.getFixes();
-    if (fixes != null) {
+    if (fixes != null && fixes.length > 0) {
       //noinspection HardCodedStringLiteral
       buf.append("<br><br>");
       appendHeading(buf, InspectionsBundle.message("inspection.problem.resolution"));
