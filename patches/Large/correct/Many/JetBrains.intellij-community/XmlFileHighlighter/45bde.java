diff --git a/xml/xml-psi-impl/src/com/intellij/ide/highlighter/XmlFileHighlighter.java b/xml/xml-psi-impl/src/com/intellij/ide/highlighter/XmlFileHighlighter.java
index b7d9aa4..0051caa 100644
--- a/xml/xml-psi-impl/src/com/intellij/ide/highlighter/XmlFileHighlighter.java
+++ b/xml/xml-psi-impl/src/com/intellij/ide/highlighter/XmlFileHighlighter.java
@@ -110,7 +110,7 @@
     return ourMap.get(tokenType).toArray(EMPTY);
   }
 
-  public static void registerEmbeddedTokenAttributes(Map<IElementType, TextAttributesKey> _keys1,
+  public static synchronized void registerEmbeddedTokenAttributes(Map<IElementType, TextAttributesKey> _keys1,
                                                            Map<IElementType, TextAttributesKey> _keys2) {
     HashSet<IElementType> existingKeys = new HashSet<>(ourMap.keySet());
     addMissing(_keys1, existingKeys, ourMap);
