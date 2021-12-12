diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/mailnotification/MailThreadInfo.java b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/mailnotification/MailThreadInfo.java
index 382e6d3..1e8c619 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/mailnotification/MailThreadInfo.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/mailnotification/MailThreadInfo.java
@@ -164,7 +164,7 @@
             String result = names[0];
 
             //return 14 chars max
-            if(result.length() > 15)
+            if(result.length() > 14)
                 result = result.substring(0, 14);
 
             return result;
