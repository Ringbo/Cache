diff --git a/enterprise/core-edge/src/main/java/org/neo4j/coreedge/server/core/RoleProcedure.java b/enterprise/core-edge/src/main/java/org/neo4j/coreedge/server/core/RoleProcedure.java
index e7db643..0f0ec3e 100644
--- a/enterprise/core-edge/src/main/java/org/neo4j/coreedge/server/core/RoleProcedure.java
+++ b/enterprise/core-edge/src/main/java/org/neo4j/coreedge/server/core/RoleProcedure.java
@@ -47,7 +47,7 @@
             @Override
             public boolean hasNext() throws ProcedureException
             {
-                return false;
+                return true;
             }
 
             @Override
