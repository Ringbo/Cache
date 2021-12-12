diff --git a/src/java/org/apache/cassandra/locator/ReplicaLayout.java b/src/java/org/apache/cassandra/locator/ReplicaLayout.java
index 54b82f9..d44fdd7 100644
--- a/src/java/org/apache/cassandra/locator/ReplicaLayout.java
+++ b/src/java/org/apache/cassandra/locator/ReplicaLayout.java
@@ -278,7 +278,7 @@
     @VisibleForTesting
     static EndpointsForToken resolveWriteConflictsInNatural(EndpointsForToken natural, EndpointsForToken pending)
     {
-        EndpointsForToken.Mutable resolved = natural.newMutable(natural.size());
+        EndpointsForToken.Builder resolved = natural.newBuilder(natural.size());
         for (Replica replica : natural)
         {
             // always prefer the full natural replica, if there is a conflict
@@ -297,7 +297,7 @@
             }
             resolved.add(replica);
         }
-        return resolved.asSnapshot();
+        return resolved.build();
     }
 
     /**
