diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
index f35908a..9001e36 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/readreplica/EnterpriseReadReplicaEditionModule.java
@@ -276,7 +276,7 @@
                 platformModule.dependencies.provideDependency( TransactionIdStore.class ),
                 platformModule.dependencies.provideDependency( LogicalTransactionStore.class ),
                 localDatabase::dataSource, localDatabase::isAvailable, null, config, platformModule.monitors,
-                new CheckpointerSupplier( platformModule.dependencies ), fileSystem );
+                new CheckpointerSupplier( platformModule.dependencies ), fileSystem, pageCache);
 
         servicesToStopOnStoreCopy.add( catchupServer );
 
