diff --git a/lang-impl/src/com/intellij/formatting/LeafBlockWrapper.java b/lang-impl/src/com/intellij/formatting/LeafBlockWrapper.java
index 94670e1..13b95c6 100644
--- a/lang-impl/src/com/intellij/formatting/LeafBlockWrapper.java
+++ b/lang-impl/src/com/intellij/formatting/LeafBlockWrapper.java
@@ -16,7 +16,7 @@
   private IndentInside myLastLineIndent;
 
   public LeafBlockWrapper(final Block block,
-                          AbstractBlockWrapper parent,
+                          CompositeBlockWrapper parent,
                           WhiteSpace whiteSpaceBefore,
                           FormattingDocumentModel model,
                           LeafBlockWrapper previousTokenBlock,
