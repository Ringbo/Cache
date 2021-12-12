diff --git a/javamelody-core/src/main/java/net/bull/javamelody/PayloadNameRequestWrapper.java b/javamelody-core/src/main/java/net/bull/javamelody/PayloadNameRequestWrapper.java
index cdfb9bb..a35b192 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/PayloadNameRequestWrapper.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/PayloadNameRequestWrapper.java
@@ -231,7 +231,8 @@
 	 */
 	private static String parseSoapMethodName(InputStream stream, String charEncoding) {
 		try {
-			final XMLInputFactory factory = XMLInputFactory.newFactory();
+			// newInstance() et pas newFactory() pour java 1.5 (issue 367)
+			final XMLInputFactory factory = XMLInputFactory.newInstance();
 			final XMLStreamReader xmlReader;
 			if (charEncoding != null) {
 				xmlReader = factory.createXMLStreamReader(stream, charEncoding);
