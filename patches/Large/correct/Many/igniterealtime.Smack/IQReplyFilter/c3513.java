diff --git a/smack-core/src/main/java/org/jivesoftware/smack/filter/IQReplyFilter.java b/smack-core/src/main/java/org/jivesoftware/smack/filter/IQReplyFilter.java
index 3f7cb11..1c3ec64 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/filter/IQReplyFilter.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/filter/IQReplyFilter.java
@@ -100,7 +100,7 @@
             fromFilter.addFilter(FromMatchesFilter.createBare(local));
             fromFilter.addFilter(FromMatchesFilter.createFull(server));
         }
-        else if (to.equals(XmppStringUtils.parseBareAddress(local))) {
+        else if (to.equals(XmppStringUtils.parseBareJid(local))) {
             fromFilter.addFilter(FromMatchesFilter.createFull(null));
         }
     }
