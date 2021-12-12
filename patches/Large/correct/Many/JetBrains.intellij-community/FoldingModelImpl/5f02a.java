diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/FoldingModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/FoldingModelImpl.java
index 4606262..22cb7c3 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/FoldingModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/FoldingModelImpl.java
@@ -582,8 +582,8 @@
       return null;
     }
     if (!isFoldingEnabled() || startOffset >= endOffset ||
-        !DocumentUtil.isInsideSurrogatePair(myEditor.getDocument(), startOffset) ||
-        !DocumentUtil.isInsideSurrogatePair(myEditor.getDocument(), endOffset) ||
+        DocumentUtil.isInsideSurrogatePair(myEditor.getDocument(), startOffset) ||
+        DocumentUtil.isInsideSurrogatePair(myEditor.getDocument(), endOffset) ||
         !myFoldTree.checkIfValidToCreate(startOffset, endOffset)) return null;
 
     FoldRegionImpl region = new FoldRegionImpl(myEditor, startOffset, endOffset, placeholder, group, neverExpands);
