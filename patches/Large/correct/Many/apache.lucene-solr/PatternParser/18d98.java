diff --git a/contrib/analyzers/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java b/contrib/analyzers/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
index 5108c71..a9f816e 100644
--- a/contrib/analyzers/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
+++ b/contrib/analyzers/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
@@ -266,8 +266,7 @@
   //
   // EntityResolver methods
   //
-  public InputSource resolveEntity(String publicId, String systemId)
-  throws SAXException, IOException {
+  public InputSource resolveEntity(String publicId, String systemId) {
     return HyphenationDTDGenerator.generateDTD();
   }
 
