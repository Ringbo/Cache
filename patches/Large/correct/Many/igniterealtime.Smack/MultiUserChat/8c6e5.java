diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
index fd1b5f8..d1714ca 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -169,7 +169,7 @@
                     Presence oldPresence = occupantsMap.put(from, presence);
                     if (oldPresence != null) {
                         // Get the previous occupant's affiliation & role
-                        MUCUser mucExtension = MUCUser.from(packet);
+                        MUCUser mucExtension = MUCUser.from(oldPresence);
                         MUCAffiliation oldAffiliation = mucExtension.getItem().getAffiliation();
                         MUCRole oldRole = mucExtension.getItem().getRole();
                         // Get the new occupant's affiliation & role
