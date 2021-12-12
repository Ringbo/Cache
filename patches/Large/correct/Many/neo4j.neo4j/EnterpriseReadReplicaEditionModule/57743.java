diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
index 804daf3..7b8adc5 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
@@ -99,7 +99,7 @@
     @Override
     public void registerEditionSpecificProcedures( Procedures procedures ) throws KernelException
     {
-        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class );
+        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class, true );
         procedures.register( new ReadReplicaRoleProcedure() );
     }
 
