diff --git a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/structureView/KotlinStructureViewFactory.java b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/structureView/KotlinStructureViewFactory.java
index ef7a330..82dd3b9 100644
--- a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/structureView/KotlinStructureViewFactory.java
+++ b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/structureView/KotlinStructureViewFactory.java
@@ -36,7 +36,7 @@
                 @NotNull
                 @Override
                 public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
-                    return new KotlinStructureViewModel(file);
+                    return new KotlinStructureViewModel(file, editor);
                 }
             };
         }
