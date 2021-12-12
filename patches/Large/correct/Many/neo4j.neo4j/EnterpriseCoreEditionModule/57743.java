diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/EnterpriseCoreEditionModule.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/EnterpriseCoreEditionModule.java
index fc84c37..6f8016d 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/EnterpriseCoreEditionModule.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/EnterpriseCoreEditionModule.java
@@ -107,7 +107,7 @@
     @Override
     public void registerEditionSpecificProcedures( Procedures procedures ) throws KernelException
     {
-        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class );
+        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class, true );
         procedures.register(
                 new GetServersProcedure( topologyService, consensusModule.raftMachine(), config, logProvider ) );
         procedures.register(
