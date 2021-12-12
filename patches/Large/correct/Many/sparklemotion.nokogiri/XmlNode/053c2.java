diff --git a/ext/java/nokogiri/XmlNode.java b/ext/java/nokogiri/XmlNode.java
index 161beb4..1f59a54 100644
--- a/ext/java/nokogiri/XmlNode.java
+++ b/ext/java/nokogiri/XmlNode.java
@@ -463,7 +463,7 @@
                     } else if ("xmlns".equals(prefix) || nodeName.equals("xmlns")) {
                         nsUri = "http://www.w3.org/2000/xmlns/";
                     } else {
-                        nsUri = attr.lookupNamespaceURI(nodeName);
+                        nsUri = attr.getNamespaceURI();
                     }
                     e.getOwnerDocument().renameNode(attr, nsUri, nodeName);
                 }
