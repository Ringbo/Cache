diff --git a/src/net/java/sip/communicator/util/xml/DOMElementWriter.java b/src/net/java/sip/communicator/util/xml/DOMElementWriter.java
index 22955b2..1bd86ea 100644
--- a/src/net/java/sip/communicator/util/xml/DOMElementWriter.java
+++ b/src/net/java/sip/communicator/util/xml/DOMElementWriter.java
@@ -124,7 +124,7 @@
 
             case Node.TEXT_NODE:
                 //if this is a new line don't print it as we print our own.
-                if(child.getNodeValue().indexOf(lSep) == -1)
+                if(child.getNodeValue() != null && child.getNodeValue().indexOf(lSep) == -1)
                     out.write(encode(child.getNodeValue()));
                 break;
 
