diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 7c16fa3..90be95a 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -974,7 +974,7 @@
     boolean refreshFragment = (threadId != this.threadId);
     this.threadId = threadId;
 
-    if (fragment == null) {
+    if (fragment == null || !fragment.isVisible() || isFinishing()) {
       return;
     }
 
