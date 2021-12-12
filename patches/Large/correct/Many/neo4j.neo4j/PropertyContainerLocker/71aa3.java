diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/coreapi/PropertyContainerLocker.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/coreapi/PropertyContainerLocker.java
index 0c34101..f05d2ef 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/coreapi/PropertyContainerLocker.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/coreapi/PropertyContainerLocker.java
@@ -87,7 +87,7 @@
             else if(container instanceof Relationship )
             {
                 statement.readOperations().acquireShared( ResourceTypes.RELATIONSHIP, ((Relationship) container).getId() );
-                return new CoreAPILock(stmtProvider, ResourceTypes.RELATIONSHIP, ((Node) container).getId())
+                return new CoreAPILock( stmtProvider, ResourceTypes.RELATIONSHIP, ((Relationship) container).getId() )
                 {
                     @Override
                     void release( Statement statement, Locks.ResourceType type, long resourceId )
