diff --git a/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java b/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
index 1ddc59c..72bfe89 100644
--- a/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
+++ b/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
@@ -263,7 +263,7 @@
             PropertyRecord prev = props.forceGetRecord( prevId );
             if ( !prev.inUse() )
                 fail |= inconsistent( props, property, prev, "invalid prev reference, prev record not in use" );
-            if ( prev.getPrevProp() != property.getId() )
+            if ( prev.getNextProp() != property.getId() )
                 fail |= inconsistent( props, property, prev, "invalid prev reference, prev record does not reference back" );
         }
         else // property is first in chain
