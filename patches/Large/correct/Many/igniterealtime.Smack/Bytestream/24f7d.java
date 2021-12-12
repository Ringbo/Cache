diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/bytestreams/socks5/packet/Bytestream.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/bytestreams/socks5/packet/Bytestream.java
index 20004b0..7d22d4b 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/bytestreams/socks5/packet/Bytestream.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/bytestreams/socks5/packet/Bytestream.java
@@ -221,7 +221,7 @@
     @Override
     public XmlStringBuilder getChildElementXML() {
         XmlStringBuilder xml = new XmlStringBuilder();
-        xml.openElement(IQ.QUERY_ELEMENT);
+        xml.halfOpenElement(IQ.QUERY_ELEMENT);
         xml.xmlnsAttribute(NAMESPACE);
 
         switch(getType()) {
