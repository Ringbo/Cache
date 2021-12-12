diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index e4fee99..4bc7492 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -242,7 +242,7 @@
                     {
                         // direct write to local DC
                         assert message.getHeader(RowMutation.FORWARD_HEADER) == null;
-                        MessagingService.instance().sendOneWay(message, target);
+                        MessagingService.instance().sendOneWay(message, destination);
                     }
                     else
                     {
