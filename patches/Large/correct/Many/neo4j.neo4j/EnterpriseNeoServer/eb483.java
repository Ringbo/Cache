diff --git a/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java b/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
index 5a67026..312c704 100644
--- a/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
+++ b/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
@@ -118,7 +118,7 @@
             throw new IllegalArgumentException( "The server cannot be started in ARBITER mode." );
         case CORE:
             return lifecycleManagingDatabase( CORE_FACTORY );
-        case EDGE:
+        case READ_REPLICA:
             return lifecycleManagingDatabase( EDGE_FACTORY );
         default: // Anything else gives community, including Mode.SINGLE
             return lifecycleManagingDatabase( ENTERPRISE_FACTORY );
