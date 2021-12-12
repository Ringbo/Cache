diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java b/src/protocol/http/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java
index 38ae98f..a9efba0 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java
@@ -220,6 +220,7 @@
 		return urlConfigs;
 	}
 
+    // N.B. Since the tags are extracted from an HTML Form, any values must already have been encoded
 	private static boolean recurseForm(Node tempNode, LinkedList urlConfigs, URL context, String selectName,
 			boolean inForm) {
 		NamedNodeMap nodeAtts = tempNode.getAttributes();
@@ -234,10 +235,10 @@
 						inForm = false;
 					}
 				} else if (tag.equalsIgnoreCase("input")) {
-					url.addArgument(getAttributeValue(nodeAtts, "name"), getAttributeValue(nodeAtts, "value"));
+					url.addEncodedArgument(getAttributeValue(nodeAtts, "name"), getAttributeValue(nodeAtts, "value"));
 				} else if (tag.equalsIgnoreCase("textarea")) {
 					try {
-						url.addArgument(getAttributeValue(nodeAtts, "name"), tempNode.getFirstChild().getNodeValue());
+						url.addEncodedArgument(getAttributeValue(nodeAtts, "name"), tempNode.getFirstChild().getNodeValue());
 					} catch (NullPointerException e) {
 						url.addArgument(getAttributeValue(nodeAtts, "name"), "");
 					}
@@ -252,7 +253,7 @@
 							value = "";
 						}
 					}
-					url.addArgument(selectName, value);
+					url.addEncodedArgument(selectName, value);
 				}
 			} else if (tag.equalsIgnoreCase("form")) {
 				try {
