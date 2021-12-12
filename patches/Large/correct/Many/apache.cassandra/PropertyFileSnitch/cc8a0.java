diff --git a/src/java/org/apache/cassandra/locator/PropertyFileSnitch.java b/src/java/org/apache/cassandra/locator/PropertyFileSnitch.java
index da440af..9138bc2 100644
--- a/src/java/org/apache/cassandra/locator/PropertyFileSnitch.java
+++ b/src/java/org/apache/cassandra/locator/PropertyFileSnitch.java
@@ -188,7 +188,7 @@
         logger.debug("loaded network topology {}", FBUtilities.toString(reloadedMap));
         endpointMap = reloadedMap;
         if (StorageService.instance != null) // null check tolerates circular dependency; see CASSANDRA-4145
-            StorageService.instance.getTokenMetadata().invalidateCaches();
+            StorageService.instance.getTokenMetadata().invalidateCachedRings();
 
         if (gossipStarted)
             StorageService.instance.gossipSnitchInfo();
