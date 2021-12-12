diff --git a/smack-debug-slf4j/src/main/java/org/jivesoftware/smackx/debugger/slf4j/SLF4JSmackDebugger.java b/smack-debug-slf4j/src/main/java/org/jivesoftware/smackx/debugger/slf4j/SLF4JSmackDebugger.java
index 0f5fe14..c9dd213 100644
--- a/smack-debug-slf4j/src/main/java/org/jivesoftware/smackx/debugger/slf4j/SLF4JSmackDebugger.java
+++ b/smack-debug-slf4j/src/main/java/org/jivesoftware/smackx/debugger/slf4j/SLF4JSmackDebugger.java
@@ -101,7 +101,7 @@
     }
 
     private String getUserTitle(String user) {
-        if (("@" + connection.getServiceName()).equals(XmppStringUtils.parseBareAddress(user))) {
+        if (("@" + connection.getServiceName()).equals(XmppStringUtils.parseBareJid(user))) {
             return "<Anonymous>@" + connection.getServiceName();
         } else {
             return user;
