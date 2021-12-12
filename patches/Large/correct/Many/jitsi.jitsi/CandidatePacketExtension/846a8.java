diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/jingle/CandidatePacketExtension.java b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/jingle/CandidatePacketExtension.java
index 594fd54..0bb8f08 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/jingle/CandidatePacketExtension.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/jingle/CandidatePacketExtension.java
@@ -134,7 +134,7 @@
      *
      * @param foundation the candidate foundation as defined in ICE-CORE.
      */
-    public void setFoundation(int foundation)
+    public void setFoundation(String foundation)
     {
         super.setAttribute(FOUNDATION_ATTR_NAME, foundation);
     }
@@ -144,9 +144,9 @@
      *
      * @return the candidate foundation as defined in ICE-CORE.
      */
-    public int getFoundation()
+    public String getFoundation()
     {
-        return super.getAttributeAsInt(FOUNDATION_ATTR_NAME);
+        return super.getAttributeAsString(FOUNDATION_ATTR_NAME);
     }
 
     /**
