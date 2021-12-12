diff --git a/smack-debug/src/main/java/org/jivesoftware/smackx/debugger/LiteDebugger.java b/smack-debug/src/main/java/org/jivesoftware/smackx/debugger/LiteDebugger.java
index 9e22862..1584ac8 100644
--- a/smack-debug/src/main/java/org/jivesoftware/smackx/debugger/LiteDebugger.java
+++ b/smack-debug/src/main/java/org/jivesoftware/smackx/debugger/LiteDebugger.java
@@ -328,7 +328,7 @@
         boolean isAnonymous = "".equals(XmppStringUtils.parseLocalpart(user));
         String title =
             "Smack Debug Window -- "
-                + (isAnonymous ? "" : XmppStringUtils.parseBareAddress(user))
+                + (isAnonymous ? "" : XmppStringUtils.parseBareJid(user))
                 + "@"
                 + connection.getServiceName()
                 + ":"
