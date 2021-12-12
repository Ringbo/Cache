diff --git a/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/enterprise/EnterpriseConstraintSemantics.java b/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/enterprise/EnterpriseConstraintSemantics.java
index 1336ea1..9aa9f4e 100644
--- a/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/enterprise/EnterpriseConstraintSemantics.java
+++ b/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/enterprise/EnterpriseConstraintSemantics.java
@@ -182,7 +182,7 @@
 
             for ( int propertyKey : descriptor.getPropertyIds() )
             {
-                if ( relationshipCursor.label() == descriptor.getRelTypeId() &&
+                if ( relationshipCursor.type() == descriptor.getRelTypeId() &&
                      !hasProperty( propertyCursor, propertyKey ) )
                 {
                     throw createConstraintFailure(
