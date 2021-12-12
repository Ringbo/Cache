diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java
index 7172110..7a7d966 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java
@@ -946,7 +946,9 @@
                     logger.debug("Received a status update for buddy=" + userID);
 
                 // all contact statuses that are received from all its resources
-                // ordered by priority
+                // ordered by priority(higher first) and those with equal
+                // priorities order with the one that is most connected as
+                // first
                 TreeSet<Presence> userStats = statuses.get(userID);
                 if(userStats == null)
                 {
@@ -954,22 +956,17 @@
                      {
                         public int compare(Presence o1, Presence o2)
                         {
-                            int res = o1.getPriority() - o2.getPriority();
+                            int res = o2.getPriority() - o1.getPriority();
 
                             // if statuses are with same priorities
                             // return which one is more available
                             // counts the JabberStatusEnum order
                             if(res == 0)
                             {
-                                res =
-                                    jabberStatusToPresenceStatus(
-                                                o1,
-                                                parentProvider)
-                                            .getStatus()
+                                res = jabberStatusToPresenceStatus(
+                                        o2, parentProvider).getStatus()
                                         - jabberStatusToPresenceStatus(
-                                                    o2,
-                                                    parentProvider)
-                                                .getStatus();
+                                            o1, parentProvider).getStatus();
                             }
 
                             return res;
