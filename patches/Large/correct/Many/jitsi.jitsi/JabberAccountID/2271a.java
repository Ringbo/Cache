diff --git a/src/net/java/sip/communicator/service/protocol/jabber/JabberAccountID.java b/src/net/java/sip/communicator/service/protocol/jabber/JabberAccountID.java
index 26acbde..d8e2ced 100644
--- a/src/net/java/sip/communicator/service/protocol/jabber/JabberAccountID.java
+++ b/src/net/java/sip/communicator/service/protocol/jabber/JabberAccountID.java
@@ -680,7 +680,7 @@
      */
     public static boolean getDefaultBool(String key)
     {
-        return Boolean.getBoolean(getDefaultStr(key));
+        return Boolean.parseBoolean(getDefaultStr(key));
     }
 
 
