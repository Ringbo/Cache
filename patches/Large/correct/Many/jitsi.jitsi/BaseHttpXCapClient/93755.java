diff --git a/src/net/java/sip/communicator/impl/protocol/sip/xcap/BaseHttpXCapClient.java b/src/net/java/sip/communicator/impl/protocol/sip/xcap/BaseHttpXCapClient.java
index 2e1272f..4f9ee0f 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/xcap/BaseHttpXCapClient.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/xcap/BaseHttpXCapClient.java
@@ -209,8 +209,8 @@
                 // for debug purposes print only xmls
                 // skip the icon queries
                 if(contentBytes != null && result.getContentType() != null
-                        && !result.getContentType().equalsIgnoreCase
-                        (PresContentClient.CONTENT_TYPE))
+                        && !result.getContentType()
+                                .startsWith(PresContentClient.CONTENT_TYPE))
                     contenString = new String(contentBytes);
                 else
                     contenString = "";
