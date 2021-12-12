diff --git a/annotationprocessor/src/main/java/org/acra/processor/creator/ClassCreator.java b/annotationprocessor/src/main/java/org/acra/processor/creator/ClassCreator.java
index 8ad2b20..15d44eb 100644
--- a/annotationprocessor/src/main/java/org/acra/processor/creator/ClassCreator.java
+++ b/annotationprocessor/src/main/java/org/acra/processor/creator/ClassCreator.java
@@ -79,7 +79,7 @@
         try {
             baseBuilder = processingEnv.getElementUtils().getTypeElement(configuration.baseBuilderClass().getName());
         } catch (MirroredTypeException e) {
-            baseBuilder = MoreTypes.asTypeElement(processingEnv.getTypeUtils(), e.getTypeMirror());
+            baseBuilder = MoreTypes.asTypeElement(e.getTypeMirror());
         }
         final List<Element> elements = new ModelBuilder(baseAnnotation, new ElementFactory(processingEnv.getElementUtils()), baseBuilder, processingEnv.getMessager()).build();
         createBuilderClass(elements);
