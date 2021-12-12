diff --git a/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java
index 901f963..836a317fc 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java
@@ -400,7 +400,7 @@
                         resourceId.toString());
                 throw new XCapException(errorMessage);
             }
-            if (!contentType.equals(PresContentClient.CONTENT_TYPE))
+            if (!contentType.startsWith(PresContentClient.CONTENT_TYPE))
             {
                 String errorMessage = String.format(
                         "XCAP server returns invalid PresContent content type: %1s",
@@ -628,7 +628,7 @@
                 return null;
             }
 
-            if (!contentType.equals(response.getContentType()))
+            if (!response.getContentType().startsWith(contentType))
             {
                 String errorMessage = String.format(
                         "XCAP server returns invalid content type: %1s",
