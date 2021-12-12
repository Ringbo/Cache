diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/GeometryType.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/GeometryType.java
index 952c07d..cf0c06d 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/GeometryType.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/GeometryType.java
@@ -218,7 +218,7 @@
 
     private static GeometryType find( int gtype )
     {
-        if ( gtype < TYPES.length )
+        if ( gtype < TYPES.length && gtype >= 0 )
         {
             return TYPES[gtype];
         }
