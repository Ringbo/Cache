diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/consensus/roles/Heart.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/consensus/roles/Heart.java
index 14b0039..3fb31b6 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/consensus/roles/Heart.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/consensus/roles/Heart.java
@@ -41,7 +41,7 @@
         outcome.setLeader( request.from() );
         outcome.setLeaderCommit( request.commitIndex() );
         outcome.addOutgoingMessage( new RaftMessages.Directed( request.from(),
-                new RaftMessages.HeartbeatResponse( state.myself(), RaftMessages.Type.HEARTBEAT_RESPONSE ) ) );
+                new RaftMessages.HeartbeatResponse( state.myself() ) ) );
 
         if ( !Follower.logHistoryMatches( state, request.commitIndex(), request.commitIndexTerm(), log ) )
         {
