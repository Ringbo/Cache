diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/factory/CommunitySchemaRuleVerifier.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/factory/CommunitySchemaRuleVerifier.java
index 196ca20..01a26b3 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/factory/CommunitySchemaRuleVerifier.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/factory/CommunitySchemaRuleVerifier.java
@@ -32,13 +32,13 @@
         if ( rule instanceof NodePropertyExistenceConstraintRule ||
              rule instanceof RelationshipPropertyExistenceConstraintRule )
         {
-            throw new IllegalStateException(); // todo: message and new exception type
+            throw new IllegalStateException("Property existence constraints can only be used on Neo4j enterprise"); // todo: message and new exception type
         }
     }
 
     @Override
     public void assertPropertyConstraintCreationAllowed()
     {
-        throw new IllegalStateException(); // todo: message and new exception type
+        throw new IllegalStateException("Property existence constraints can only be used on Neo4j enterprise"); // todo: message and new exception type
     }
 }
