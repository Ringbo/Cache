diff --git a/smack-core/src/main/java/org/jivesoftware/smack/RosterGroup.java b/smack-core/src/main/java/org/jivesoftware/smack/RosterGroup.java
index 9007b08..5b76ec2 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/RosterGroup.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/RosterGroup.java
@@ -122,7 +122,7 @@
         }
         // Roster entries never include a resource so remove the resource
         // if it's a part of the XMPP address.
-        user = XmppStringUtils.parseBareAddress(user);
+        user = XmppStringUtils.parseBareJid(user);
         String userLowerCase = user.toLowerCase(Locale.US);
         synchronized (entries) {
             for (RosterEntry entry : entries) {
