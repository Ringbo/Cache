diff --git a/xml/xml-psi-impl/src/com/intellij/ide/highlighter/HtmlFileHighlighter.java b/xml/xml-psi-impl/src/com/intellij/ide/highlighter/HtmlFileHighlighter.java
index 3638ae2..ca91fdf 100644
--- a/xml/xml-psi-impl/src/com/intellij/ide/highlighter/HtmlFileHighlighter.java
+++ b/xml/xml-psi-impl/src/com/intellij/ide/highlighter/HtmlFileHighlighter.java
@@ -79,7 +79,7 @@
     return SyntaxHighlighterBase.pack(XmlHighlighterColors.HTML_CODE, ourMap.get(tokenType).toArray(EMPTY));
   }
 
-  public static void registerEmbeddedTokenAttributes(Map<IElementType, TextAttributesKey> _keys1,
+  public static synchronized void registerEmbeddedTokenAttributes(Map<IElementType, TextAttributesKey> _keys1,
                                                            Map<IElementType, TextAttributesKey> _keys2) {
     HashSet<IElementType> existingKeys = new HashSet<>(ourMap.keySet());
     XmlFileHighlighter.addMissing(_keys1, existingKeys, ourMap);
