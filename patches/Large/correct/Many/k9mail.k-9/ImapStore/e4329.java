diff --git a/src/com/fsck/k9/mail/store/ImapStore.java b/src/com/fsck/k9/mail/store/ImapStore.java
index 6f44f75..1d12e86 100644
--- a/src/com/fsck/k9/mail/store/ImapStore.java
+++ b/src/com/fsck/k9/mail/store/ImapStore.java
@@ -1205,7 +1205,7 @@
 
 
 
-            for (int windowStart=1; windowStart <= messages.length; windowStart += (FETCH_WINDOW_SIZE +1))
+            for (int windowStart=0; windowStart <= messages.length; windowStart += (FETCH_WINDOW_SIZE +1))
             {
                 List<String> uidWindow = uids.subList(windowStart, Math.min((windowStart+FETCH_WINDOW_SIZE),messages.length));
 
