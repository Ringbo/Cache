diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/TemporalType.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/TemporalType.java
index 5ed94d1..984fbe0 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/TemporalType.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/TemporalType.java
@@ -282,7 +282,7 @@
 
     private static TemporalType find( int temporalType )
     {
-        if ( temporalType < TYPES.length )
+        if ( temporalType < TYPES.length && temporalType >= 0 )
         {
             return TYPES[temporalType];
         }
