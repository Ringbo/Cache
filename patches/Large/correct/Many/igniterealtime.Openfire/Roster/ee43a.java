diff --git a/src/java/org/jivesoftware/messenger/roster/Roster.java b/src/java/org/jivesoftware/messenger/roster/Roster.java
index 35d2d74..d14556d 100644
--- a/src/java/org/jivesoftware/messenger/roster/Roster.java
+++ b/src/java/org/jivesoftware/messenger/roster/Roster.java
@@ -305,7 +305,7 @@
         // broadcast roster update
         if (!(item.getSubStatus() == RosterItem.SUB_NONE
                 && item.getAskStatus() == RosterItem.ASK_NONE)) {
-            broadcast(item);
+            broadcast(item, true);
         }
         if (item.getSubStatus() == RosterItem.SUB_BOTH || item.getSubStatus() == RosterItem.SUB_TO) {
             probePresence(item.getJid());
@@ -501,9 +501,19 @@
         }
     }
 
-    void broadcast(RosterItem item) {
+    /**
+     * Broadcasts the RosterItem to all the connected resources of this user. Due to performance
+     * optimizations and due to some clients errors that are showing items with subscription status
+     * FROM we added a flag that indicates if a roster items that exists only because of a shared
+     * group with subscription status FROM will not be sent.
+     *
+     * @param item     the item to broadcast.
+     * @param optimize true indicates that items that exists only because of a shared
+     *                 group with subscription status FROM will not be sent
+     */
+    void broadcast(RosterItem item, boolean optimize) {
         // Do not broadcast items with status FROM that exist only because of shared groups
-        if (item.isOnlyShared() && item.getSubStatus() == RosterItem.SUB_FROM) {
+        if (optimize && item.isOnlyShared() && item.getSubStatus() == RosterItem.SUB_FROM) {
             return;
         }
         // Set the groups to broadcast (include personal and shared groups)
@@ -620,7 +630,7 @@
             item.addInvisibleSharedGroup(group);
         }
         // Brodcast to all the user resources of the updated roster item
-        broadcast(item);
+        broadcast(item, true);
         // Probe the presence of the new group user
         if (item.getSubStatus() == RosterItem.SUB_BOTH || item.getSubStatus() == RosterItem.SUB_TO) {
             probePresence(item.getJid());
@@ -711,7 +721,7 @@
             }
         }
         // Brodcast to all the user resources of the updated roster item
-        broadcast(item);
+        broadcast(item, true);
         // Probe the presence of the new group user
         if (item.getSubStatus() == RosterItem.SUB_BOTH || item.getSubStatus() == RosterItem.SUB_TO) {
             probePresence(item.getJid());
@@ -774,7 +784,7 @@
                     }
                 }
                 // Brodcast to all the user resources of the updated roster item
-                broadcast(item);
+                broadcast(item, false);
             }
         }
         catch (SharedGroupException e) {
@@ -835,7 +845,7 @@
                     }
                 }
                 // Brodcast to all the user resources of the updated roster item
-                broadcast(item);
+                broadcast(item, false);
             }
         }
         catch (SharedGroupException e) {
@@ -863,7 +873,7 @@
                 // Get the RosterItem for the *local* user to add
                 item = getRosterItem(jid);
                 // Brodcast to all the user resources of the updated roster item
-                broadcast(item);
+                broadcast(item, true);
             }
             catch (UserNotFoundException e) {
                 // Do nothing since the contact does not exist in the user's roster. (strange case!)
