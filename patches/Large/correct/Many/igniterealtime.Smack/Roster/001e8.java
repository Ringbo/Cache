diff --git a/smack-im/src/main/java/org/jivesoftware/smack/roster/Roster.java b/smack-im/src/main/java/org/jivesoftware/smack/roster/Roster.java
index fc556aa..c2a4fb9 100644
--- a/smack-im/src/main/java/org/jivesoftware/smack/roster/Roster.java
+++ b/smack-im/src/main/java/org/jivesoftware/smack/roster/Roster.java
@@ -238,7 +238,7 @@
         // If the connection is already established, call reload
         if (connection.isAuthenticated()) {
             try {
-                reload();
+                reloadAndWait();
             }
             catch (InterruptedException | SmackException e) {
                 LOGGER.log(Level.SEVERE, "Could not reload Roster", e);
