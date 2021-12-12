diff --git a/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/core/consensus/roles/FollowerTest.java b/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/core/consensus/roles/FollowerTest.java
index fbc6be5..7f999bb 100644
--- a/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/core/consensus/roles/FollowerTest.java
+++ b/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/core/consensus/roles/FollowerTest.java
@@ -294,7 +294,7 @@
         // then
         Collection<RaftMessages.Directed> outgoingMessages = outcome.getOutgoingMessages();
         assertTrue( outgoingMessages.contains( new RaftMessages.Directed( state.leader(),
-                new RaftMessages.HeartbeatResponse( myself, RaftMessages.Type.HEARTBEAT_RESPONSE ) ) ) );
+                new RaftMessages.HeartbeatResponse( myself ) ) ) );
     }
 
     private void appendSomeEntriesToLog( RaftState raft, Follower follower, int numberOfEntriesToAppend, int term, int firstIndex ) throws IOException
