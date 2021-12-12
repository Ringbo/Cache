diff --git a/enterprise/neo4j-harness-enterprise/src/main/java/org/neo4j/harness/CausalClusterInProcessRunner.java b/enterprise/neo4j-harness-enterprise/src/main/java/org/neo4j/harness/CausalClusterInProcessRunner.java
index 318dc3a..13fb13a 100644
--- a/enterprise/neo4j-harness-enterprise/src/main/java/org/neo4j/harness/CausalClusterInProcessRunner.java
+++ b/enterprise/neo4j-harness-enterprise/src/main/java/org/neo4j/harness/CausalClusterInProcessRunner.java
@@ -105,7 +105,7 @@
             List<Thread> coreThreads = new ArrayList<>();
             List<Thread> replicaThreads = new ArrayList<>();
 
-            for ( int coreId = 0; coreId < nReplicas; coreId++ )
+            for ( int coreId = 0; coreId < nCores; coreId++ )
             {
                 int hazelcastPort = 55000 + coreId;
                 int txPort = 56000 + coreId;
@@ -149,7 +149,7 @@
                 coreThread.join();
             }
 
-            for ( int replicaId = 0; replicaId < nCores; replicaId++ )
+            for ( int replicaId = 0; replicaId < nReplicas; replicaId++ )
             {
                 int txPort = 56500 + replicaId;
                 int boltPort = 58500 + replicaId;
