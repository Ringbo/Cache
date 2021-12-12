diff --git a/plugins/jgroups/src/main/java/org/atmosphere/plugin/jgroups/JGroupsFilter.java b/plugins/jgroups/src/main/java/org/atmosphere/plugin/jgroups/JGroupsFilter.java
index d749493..7db2927 100644
--- a/plugins/jgroups/src/main/java/org/atmosphere/plugin/jgroups/JGroupsFilter.java
+++ b/plugins/jgroups/src/main/java/org/atmosphere/plugin/jgroups/JGroupsFilter.java
@@ -110,7 +110,7 @@
                     receivedMessages.offer(msg);
                     JGroupsBroadcaster.BroadcastMessage b = JGroupsBroadcaster.BroadcastMessage.class.cast(msg);
                     if (b.getTopicId().equalsIgnoreCase(bc.getID())) {
-                        bc.broadcast(b.getTopicId());
+                        bc.broadcast(b.getMessage());
                     }
                 }
             }
