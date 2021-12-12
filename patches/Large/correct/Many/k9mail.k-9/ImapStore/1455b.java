diff --git a/src/com/fsck/k9/mail/store/ImapStore.java b/src/com/fsck/k9/mail/store/ImapStore.java
index 1e59231..ec77a1d 100644
--- a/src/com/fsck/k9/mail/store/ImapStore.java
+++ b/src/com/fsck/k9/mail/store/ImapStore.java
@@ -1103,7 +1103,7 @@
 
 
 
-            for (int windowStart = 0; windowStart <= messages.length; windowStart += (FETCH_WINDOW_SIZE)) {
+            for (int windowStart = 0; windowStart < messages.length; windowStart += (FETCH_WINDOW_SIZE)) {
                 List<String> uidWindow = uids.subList(windowStart, Math.min((windowStart + FETCH_WINDOW_SIZE), messages.length));
 
                 try {
