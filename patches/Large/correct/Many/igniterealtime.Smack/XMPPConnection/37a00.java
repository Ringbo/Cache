diff --git a/source/org/jivesoftware/smack/XMPPConnection.java b/source/org/jivesoftware/smack/XMPPConnection.java
index 7da08fe..52f9a4b 100644
--- a/source/org/jivesoftware/smack/XMPPConnection.java
+++ b/source/org/jivesoftware/smack/XMPPConnection.java
@@ -557,7 +557,7 @@
      *
      * @return an account manager for this connection.
      */
-    public synchronized AccountManager getAccountManager() {
+    public AccountManager getAccountManager() {
         if (accountManager == null) {
             accountManager = new AccountManager(this);
         }
