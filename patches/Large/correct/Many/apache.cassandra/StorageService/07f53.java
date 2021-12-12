diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 15329db..808d6de 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -387,7 +387,7 @@
             logger_.info("Loading persisted ring state");
             for (Map.Entry<Token, InetAddress> entry : SystemTable.loadTokens().entrySet())
             {
-                if (entry.getValue() == FBUtilities.getBroadcastAddress())
+                if (entry.getValue() == FBUtilities.getLocalAddress())
                 {
                     // entry has been mistakenly added, delete it
                     SystemTable.removeToken(entry.getKey());
