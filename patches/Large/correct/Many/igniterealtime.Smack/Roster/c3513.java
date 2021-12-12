diff --git a/smack-core/src/main/java/org/jivesoftware/smack/Roster.java b/smack-core/src/main/java/org/jivesoftware/smack/Roster.java
index 1df1238..1de0f38 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/Roster.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/Roster.java
@@ -491,7 +491,7 @@
      *         or if no presence information is available..
      */
     public Presence getPresence(String user) {
-        String key = getPresenceMapKey(XmppStringUtils.parseBareAddress(user));
+        String key = getPresenceMapKey(XmppStringUtils.parseBareJid(user));
         Map<String, Presence> userPresences = presenceMap.get(key);
         if (userPresences == null) {
             Presence presence = new Presence(Presence.Type.unavailable);
@@ -629,7 +629,7 @@
         }
         String key = user;
         if (!contains(user)) {
-            key = XmppStringUtils.parseBareAddress(user);
+            key = XmppStringUtils.parseBareJid(user);
         }
         return key.toLowerCase(Locale.US);
     }
@@ -752,7 +752,7 @@
         String user = entry.getUser();
         entries.remove(user);
         unfiledEntries.remove(entry);
-        presenceMap.remove(XmppStringUtils.parseBareAddress(user));
+        presenceMap.remove(XmppStringUtils.parseBareJid(user));
         deletedEntries.add(user);
 
         for (Entry<String,RosterGroup> e: groups.entrySet()) {
@@ -1029,7 +1029,7 @@
 
             // Roster push (RFC 6121, 2.1.6)
             // A roster push with a non-empty from not matching our address MUST be ignored
-            String jid = XmppStringUtils.parseBareAddress(connection.getUser());
+            String jid = XmppStringUtils.parseBareJid(connection.getUser());
             if (rosterPacket.getFrom() != null &&
                     !rosterPacket.getFrom().equals(jid)) {
                 LOGGER.warning("Ignoring roster push with a non matching 'from' ourJid=" + jid
