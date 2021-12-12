diff --git a/source/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java b/source/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
index d838151..12a7df0 100644
--- a/source/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
+++ b/source/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
@@ -105,7 +105,7 @@
           MyTabbedPane.super.setSelectedIndex(index);
           final EditorComposite composite = myWindow.getSelectedEditor();
           if (composite != null) {
-            myWindow.getManager().openFileImpl3(myWindow, composite.getFile(), true, null);
+            myWindow.getManager().openFileImpl3(myWindow, composite.getFile(), false, null);
           }
         }
       }, "", null);
