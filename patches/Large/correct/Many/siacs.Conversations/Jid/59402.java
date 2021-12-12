diff --git a/src/main/java/eu/siacs/conversations/xmpp/jid/Jid.java b/src/main/java/eu/siacs/conversations/xmpp/jid/Jid.java
index ebf8a6e..c156b8b 100644
--- a/src/main/java/eu/siacs/conversations/xmpp/jid/Jid.java
+++ b/src/main/java/eu/siacs/conversations/xmpp/jid/Jid.java
@@ -68,8 +68,9 @@
         if (jid.isEmpty() || jid.length() > 3071) {
             throw new InvalidJidException(InvalidJidException.INVALID_LENGTH);
         }
-        if (atCount > 1 || slashCount > 1 ||
-                jid.startsWith("@") || jid.endsWith("@") ||
+
+        // Go ahead and check if the localpart or resourcepart is empty.
+        if (jid.startsWith("@") || jid.endsWith("@") ||
                 jid.startsWith("/") || jid.endsWith("/")) {
             throw new InvalidJidException(InvalidJidException.INVALID_CHARACTER);
         }
@@ -77,7 +78,7 @@
         String finaljid;
 
         final int domainpartStart;
-        if (atCount == 1) {
+        if (atCount >= 1) {
             final int atLoc = jid.indexOf("@");
             final String lp = jid.substring(0, atLoc);
             try {
@@ -97,7 +98,7 @@
         }
 
         final String dp;
-        if (slashCount == 1) {
+        if (slashCount >= 1) {
             final int slashLoc = jid.indexOf("/");
             final String rp = jid.substring(slashLoc + 1, jid.length());
             try {
