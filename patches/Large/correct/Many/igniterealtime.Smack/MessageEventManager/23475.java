diff --git a/smack-legacy/src/main/java/org/jivesoftware/smackx/xevent/MessageEventManager.java b/smack-legacy/src/main/java/org/jivesoftware/smackx/xevent/MessageEventManager.java
index ba8763a..d461175 100644
--- a/smack-legacy/src/main/java/org/jivesoftware/smackx/xevent/MessageEventManager.java
+++ b/smack-legacy/src/main/java/org/jivesoftware/smackx/xevent/MessageEventManager.java
@@ -174,7 +174,7 @@
             Method method =
                 MessageEventRequestListener.class.getDeclaredMethod(
                     methodName,
-                    new Class<?>[] { String.class, String.class, MessageEventManager.class });
+                    new Class<?>[] { Jid.class, String.class, MessageEventManager.class });
             for (MessageEventRequestListener listener : messageEventRequestListeners) {
                 method.invoke(listener, new Object[] { from, packetID, this });
             }
