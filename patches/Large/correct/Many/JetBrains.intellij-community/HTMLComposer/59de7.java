diff --git a/inspections/impl/com/intellij/codeInspection/ex/HTMLComposer.java b/inspections/impl/com/intellij/codeInspection/ex/HTMLComposer.java
index 9eaa6c3..468fadc 100644
--- a/inspections/impl/com/intellij/codeInspection/ex/HTMLComposer.java
+++ b/inspections/impl/com/intellij/codeInspection/ex/HTMLComposer.java
@@ -112,7 +112,7 @@
     } else if (refElement instanceof RefFile){ //todo
       buf.append(InspectionsBundle.message("inspection.export.results.file"));
       buf.append(NBSP);
-      appendElementReference(buf, refElement);
+      appendElementReference(buf, refElement, false);
     }
     buf.append(FONT_CLOSING);
   }
