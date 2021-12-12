diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
index 5f79040a..0e485f2 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
@@ -354,13 +354,13 @@
       }
     }
 
-    EditorFragmentComponent fragmentComponent =
+    JComponent fragmentComponent =
       EditorFragmentComponent.createEditorFragmentComponent(uEditor, range.getVcsLine1(), range.getVcsLine2(), false, false);
     int leftBorder = fragmentComponent.getBorder().getBorderInsets(fragmentComponent).left;
 
     EditorFactory.getInstance().releaseEditor(uEditor);
 
-    return Pair.<JComponent, Integer>create(fragmentComponent, leftBorder);
+    return Pair.create(fragmentComponent, leftBorder);
   }
 
   private static String getFileName(final Document document) {
