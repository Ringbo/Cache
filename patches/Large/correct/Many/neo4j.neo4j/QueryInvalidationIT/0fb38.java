diff --git a/community/cypher/cypher/src/test/java/org/neo4j/cypher/QueryInvalidationIT.java b/community/cypher/cypher/src/test/java/org/neo4j/cypher/QueryInvalidationIT.java
index 897f1d8..a1313bb 100644
--- a/community/cypher/cypher/src/test/java/org/neo4j/cypher/QueryInvalidationIT.java
+++ b/community/cypher/cypher/src/test/java/org/neo4j/cypher/QueryInvalidationIT.java
@@ -59,7 +59,7 @@
         // - execute the query without the existence data -
         distantFriend( random, USERS );
 
-        long replanTime = System.currentTimeMillis() + 1_100;
+        long replanTime = System.currentTimeMillis() + 1_800;
 
         // - create data -
         createData( 0, USERS, CONNECTIONS, random );
@@ -93,7 +93,7 @@
         createData( 0, USERS, CONNECTIONS, random );
         distantFriend( random, USERS );
 
-        long replanTime = System.currentTimeMillis() + 1_100;
+        long replanTime = System.currentTimeMillis() + 1_800;
 
         //create more date
         createData( USERS, USERS, CONNECTIONS, random );
