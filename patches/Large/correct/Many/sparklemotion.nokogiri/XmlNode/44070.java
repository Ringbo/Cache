diff --git a/ext/java/nokogiri/XmlNode.java b/ext/java/nokogiri/XmlNode.java
index dc19257..225348d 100644
--- a/ext/java/nokogiri/XmlNode.java
+++ b/ext/java/nokogiri/XmlNode.java
@@ -478,14 +478,14 @@
                         attrPrefix = NokogiriHelpers.getPrefix(attr.getNodeName());
                     }
                     String nodeName = attr.getNodeName();
-                    if ("xml".equals(prefix)) {
+                    if ("xml".equals(attrPrefix)) {
                         nsUri = "http://www.w3.org/XML/1998/namespace";
                     } else if ("xmlns".equals(attrPrefix) || nodeName.equals("xmlns")) {
                         nsUri = "http://www.w3.org/2000/xmlns/";
                     } else {
                         nsUri = attr.lookupNamespaceURI(attrPrefix);
                     }
-                    if (!(nsUri == null || "".equals(nsUri))) {
+                    if (!(nsUri == null || "".equals(nsUri) || "http://www.w3.org/XML/1998/namespace".equals(nsUri))) {
                         XmlNamespace.createFromAttr(context.getRuntime(), attr);
                     }
                     NokogiriHelpers.renameNode(attr, nsUri, nodeName);
