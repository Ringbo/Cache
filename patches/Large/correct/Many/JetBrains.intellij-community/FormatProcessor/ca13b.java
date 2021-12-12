diff --git a/platform/lang-impl/src/com/intellij/formatting/FormatProcessor.java b/platform/lang-impl/src/com/intellij/formatting/FormatProcessor.java
index 6faa7a2..90f2387 100644
--- a/platform/lang-impl/src/com/intellij/formatting/FormatProcessor.java
+++ b/platform/lang-impl/src/com/intellij/formatting/FormatProcessor.java
@@ -388,7 +388,7 @@
     final String newWhiteSpace = _newWhiteSpace.toString();
     TextRange newWhiteSpaceRange = model instanceof FormattingModelEx
                                    ? ((FormattingModelEx) model).replaceWhiteSpace(wsRange, block.getNode(), newWhiteSpace)
-                                   : model.replaceWhiteSpace(textRange, newWhiteSpace);
+                                   : model.replaceWhiteSpace(wsRange, newWhiteSpace);
 
     shift += newWhiteSpaceRange.getLength() - textRange.getLength();
 
