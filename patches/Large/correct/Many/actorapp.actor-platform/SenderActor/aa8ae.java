diff --git a/actor-apps/core/src/main/java/im/actor/model/modules/messages/SenderActor.java b/actor-apps/core/src/main/java/im/actor/model/modules/messages/SenderActor.java
index b1124d9..7f6266c 100644
--- a/actor-apps/core/src/main/java/im/actor/model/modules/messages/SenderActor.java
+++ b/actor-apps/core/src/main/java/im/actor/model/modules/messages/SenderActor.java
@@ -132,7 +132,8 @@
                     User user = getUser(member.getUid());
                     if (user.getNick() != null) {
                         String nick = "@" + user.getNick();
-                        if (text.contains(nick + " ") || text.contains(" " + nick) || text.endsWith(nick) || text.equals(nick)) {
+                        // TODO: Better filtering
+                        if (text.contains(nick + ":") || text.contains(nick + " ") || text.contains(" " + nick) || text.endsWith(nick) || text.equals(nick)) {
                             mentions.add(user.getUid());
                         }
                     }
