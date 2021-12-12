diff --git a/smack-legacy/src/main/java/org/jivesoftware/smackx/workgroup/agent/AgentRoster.java b/smack-legacy/src/main/java/org/jivesoftware/smackx/workgroup/agent/AgentRoster.java
index 663bd24..f0bbc8c 100644
--- a/smack-legacy/src/main/java/org/jivesoftware/smackx/workgroup/agent/AgentRoster.java
+++ b/smack-legacy/src/main/java/org/jivesoftware/smackx/workgroup/agent/AgentRoster.java
@@ -249,7 +249,7 @@
     private String getPresenceMapKey(String user) {
         String key = user;
         if (!contains(user)) {
-            key = XmppStringUtils.parseBareAddress(user).toLowerCase(Locale.US);
+            key = XmppStringUtils.parseBareJid(user).toLowerCase(Locale.US);
         }
         return key;
     }
@@ -323,7 +323,7 @@
                 synchronized (entries) {
                     for (Iterator<String> i = entries.iterator(); i.hasNext();) {
                         String entry = i.next();
-                        if (entry.toLowerCase(Locale.US).equals(XmppStringUtils.parseBareAddress(key).toLowerCase())) {
+                        if (entry.toLowerCase(Locale.US).equals(XmppStringUtils.parseBareJid(key).toLowerCase())) {
                             fireEvent(EVENT_PRESENCE_CHANGED, packet);
                         }
                     }
@@ -344,7 +344,7 @@
                 synchronized (entries) {
                     for (Iterator<String> i = entries.iterator(); i.hasNext();) {
                         String entry = (String)i.next();
-                        if (entry.toLowerCase(Locale.US).equals(XmppStringUtils.parseBareAddress(key).toLowerCase())) {
+                        if (entry.toLowerCase(Locale.US).equals(XmppStringUtils.parseBareJid(key).toLowerCase())) {
                             fireEvent(EVENT_PRESENCE_CHANGED, packet);
                         }
                     }
