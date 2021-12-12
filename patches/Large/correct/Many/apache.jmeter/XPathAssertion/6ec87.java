diff --git a/src/components/org/apache/jmeter/assertions/XPathAssertion.java b/src/components/org/apache/jmeter/assertions/XPathAssertion.java
index d3d5090..4bce752 100644
--- a/src/components/org/apache/jmeter/assertions/XPathAssertion.java
+++ b/src/components/org/apache/jmeter/assertions/XPathAssertion.java
@@ -89,7 +89,7 @@
 
 		try {
 			doc = XPathUtil.makeDocument(new ByteArrayInputStream(responseData), isValidating(),
-					isWhitespace(), isNamespace(), isTolerant(), isQuiet(), showWarnings() , reportErrors());
+					isWhitespace(), isNamespace(), isTolerant(), isQuiet(), showWarnings() , reportErrors(), true);
 		} catch (SAXException e) {
 			log.debug("Caught sax exception: " + e);
 			result.setError(true);
