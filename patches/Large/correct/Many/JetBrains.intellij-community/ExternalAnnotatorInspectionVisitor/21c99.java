diff --git a/platform/analysis-impl/src/com/intellij/codeInspection/ExternalAnnotatorInspectionVisitor.java b/platform/analysis-impl/src/com/intellij/codeInspection/ExternalAnnotatorInspectionVisitor.java
index 5450302..f6beb74 100644
--- a/platform/analysis-impl/src/com/intellij/codeInspection/ExternalAnnotatorInspectionVisitor.java
+++ b/platform/analysis-impl/src/com/intellij/codeInspection/ExternalAnnotatorInspectionVisitor.java
@@ -72,7 +72,7 @@
         return ProblemDescriptor.EMPTY_ARRAY;
       }
       return ReadAction.compute(() -> {
-        AnnotationHolderImpl annotationHolder = new AnnotationHolderImpl(new AnnotationSession(file));
+        AnnotationHolderImpl annotationHolder = new AnnotationHolderImpl(new AnnotationSession(file), true);
         annotator.apply(file, annotationResult, annotationHolder);
         return convertToProblemDescriptors(annotationHolder, manager, file);
       });
