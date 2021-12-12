diff --git a/requery-processor/src/main/java/io/requery/processor/JoinEntityGenerator.java b/requery-processor/src/main/java/io/requery/processor/JoinEntityGenerator.java
index f1db6ba..eca74f7 100644
--- a/requery-processor/src/main/java/io/requery/processor/JoinEntityGenerator.java
+++ b/requery-processor/src/main/java/io/requery/processor/JoinEntityGenerator.java
@@ -109,7 +109,8 @@
             }
             if (referenceElement != null) {
                 key.addMember("references", "$L.class",
-                    nameResolver.generatedTypeNameOf(referenceElement).get());
+                    nameResolver.generatedTypeNameOf(referenceElement)
+                        .orElseThrow(IllegalStateException::new));
             }
             AnnotationSpec.Builder id = AnnotationSpec.builder(Key.class);
             FieldSpec.Builder field = FieldSpec.builder(Integer.class, reference.name(),
