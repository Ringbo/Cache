diff --git a/presto-server/src/main/java/com/facebook/presto/server/StatementResource.java b/presto-server/src/main/java/com/facebook/presto/server/StatementResource.java
index b5f691a..8da0f0f 100644
--- a/presto-server/src/main/java/com/facebook/presto/server/StatementResource.java
+++ b/presto-server/src/main/java/com/facebook/presto/server/StatementResource.java
@@ -106,7 +106,7 @@
         this.queryManager = checkNotNull(queryManager, "queryManager is null");
         this.httpClient = checkNotNull(httpClient, "httpClient is null");
 
-        queryPurger.scheduleAtFixedRate(new PurgeQueriesRunnable(queries.keySet(), queryManager), 200, 200, TimeUnit.MILLISECONDS);
+        queryPurger.scheduleWithFixedDelay(new PurgeQueriesRunnable(queries.keySet(), queryManager), 200, 200, TimeUnit.MILLISECONDS);
     }
 
     @PreDestroy
@@ -600,9 +600,9 @@
                 // do not call queryManager.getQueryInfo() since it updates the heartbeat time
                 Set<QueryId> liveQueries = ImmutableSet.copyOf(transform(queryManager.getAllQueryInfo(), queryIdGetter()));
 
-                Set<QueryId> deadQueries = Sets.difference(liveQueries, queryIdsSnapshot);
+                Set<QueryId> deadQueries = Sets.difference(queryIdsSnapshot, liveQueries);
                 for (QueryId deadQuery : deadQueries) {
-                    queryIdsSnapshot.remove(deadQuery);
+                    queryIds.remove(deadQuery);
                     log.debug("Removed expired query %s", deadQuery);
                 }
             }
