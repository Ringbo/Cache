diff --git a/src/org/thoughtcrime/securesms/ConversationFragment.java b/src/org/thoughtcrime/securesms/ConversationFragment.java
index 96a7b46..4c5069f 100644
--- a/src/org/thoughtcrime/securesms/ConversationFragment.java
+++ b/src/org/thoughtcrime/securesms/ConversationFragment.java
@@ -465,7 +465,7 @@
 
     int limit  = args.getInt(KEY_LIMIT, PARTIAL_CONVERSATION_LIMIT);
     int offset = 0;
-    if (limit != 0 && startingPosition > limit) {
+    if (limit != 0 && startingPosition >= limit) {
       offset = Math.max(startingPosition - (limit / 2) + 1, 0);
       startingPosition -= offset - 1;
     }
