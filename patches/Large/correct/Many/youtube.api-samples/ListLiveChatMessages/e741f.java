diff --git a/java/src/main/java/com/google/api/services/samples/youtube/cmdline/live/ListLiveChatMessages.java b/java/src/main/java/com/google/api/services/samples/youtube/cmdline/live/ListLiveChatMessages.java
index e9aac0a..8954ffa 100644
--- a/java/src/main/java/com/google/api/services/samples/youtube/cmdline/live/ListLiveChatMessages.java
+++ b/java/src/main/java/com/google/api/services/samples/youtube/cmdline/live/ListLiveChatMessages.java
@@ -176,7 +176,7 @@
             output.append("SUPERCHAT RECEIVED FROM ");
         }
         output.append(author.getDisplayName());
-        if (author.getIsChatOwner() || author.getIsChatOwner() || author.getIsChatSponsor()) {
+        if (author.getIsChatOwner() || author.getIsChatModerator() || author.getIsChatSponsor()) {
             output.append(" (");
             boolean appendComma = false;
             if (author.getIsChatOwner()) {
