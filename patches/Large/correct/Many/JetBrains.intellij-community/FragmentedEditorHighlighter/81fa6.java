diff --git a/platform/platform-api/src/com/intellij/openapi/editor/highlighter/FragmentedEditorHighlighter.java b/platform/platform-api/src/com/intellij/openapi/editor/highlighter/FragmentedEditorHighlighter.java
index a76ffab..5d1b1ab 100644
--- a/platform/platform-api/src/com/intellij/openapi/editor/highlighter/FragmentedEditorHighlighter.java
+++ b/platform/platform-api/src/com/intellij/openapi/editor/highlighter/FragmentedEditorHighlighter.java
@@ -105,7 +105,7 @@
   @NotNull
   @Override
   public HighlighterIterator createIterator(int startOffset) {
-    Map.Entry<Integer, Element> entry = myPieces.ceilingEntry(startOffset);
+    Map.Entry<Integer, Element> entry = myPieces.floorEntry(startOffset);
     return new ProxyIterator(myDocument, entry == null ? -1 : entry.getKey());
   }
 
