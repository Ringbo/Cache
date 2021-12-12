diff --git a/src/java/org/jivesoftware/wildfire/ClientSession.java b/src/java/org/jivesoftware/wildfire/ClientSession.java
index 335848f..ef70145 100644
--- a/src/java/org/jivesoftware/wildfire/ClientSession.java
+++ b/src/java/org/jivesoftware/wildfire/ClientSession.java
@@ -660,8 +660,9 @@
             // The client is available
             sessionManager.sessionAvailable(this);
             wasAvailable = true;
-        }
-        else if (oldPresence.getPriority() != this.presence.getPriority()) {
+        } else
+        if (this.presence.isAvailable() && oldPresence.getPriority() != this.presence.getPriority())
+        {
             // The client has changed the priority of his presence
             sessionManager.changePriority(getAddress(), this.presence.getPriority());
         }
