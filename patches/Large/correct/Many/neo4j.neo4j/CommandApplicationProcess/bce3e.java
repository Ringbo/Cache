diff --git a/enterprise/core-edge/src/main/java/org/neo4j/coreedge/core/state/CommandApplicationProcess.java b/enterprise/core-edge/src/main/java/org/neo4j/coreedge/core/state/CommandApplicationProcess.java
index 901b26e..a54a7cf 100644
--- a/enterprise/core-edge/src/main/java/org/neo4j/coreedge/core/state/CommandApplicationProcess.java
+++ b/enterprise/core-edge/src/main/java/org/neo4j/coreedge/core/state/CommandApplicationProcess.java
@@ -67,7 +67,7 @@
 
     private boolean started;
     private long lastApplied = NOTHING;
-    private long lastSeenCommitIndex = NOTHING;
+    private volatile long lastSeenCommitIndex = NOTHING;
     private long lastFlushed = NOTHING;
 
     public CommandApplicationProcess(
@@ -124,7 +124,7 @@
         {
             try ( InFlightLogEntryReader logEntrySupplier = new InFlightLogEntryReader( raftLog, inFlightMap, true ) )
             {
-                for ( long logIndex = lastApplied + 1; !status.isCancelled() && logIndex <= lastToApply; logIndex++ )
+                for ( long logIndex = lastApplied + 1; !status.isCancelled() && logIndex <= lastSeenCommitIndex; logIndex++ )
                 {
                     RaftLogEntry entry = logEntrySupplier.get( logIndex );
                     if ( entry == null )
