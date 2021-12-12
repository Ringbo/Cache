diff --git a/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeConcurrencyITBase.java b/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeConcurrencyITBase.java
index a2ef783..4ba7a64 100644
--- a/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeConcurrencyITBase.java
+++ b/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeConcurrencyITBase.java
@@ -367,7 +367,7 @@
         }
     }
 
-    private abstract static class UpdateOperation
+    private abstract class UpdateOperation
     {
         final long key;
 
@@ -383,7 +383,7 @@
         abstract boolean isInsert();
     }
 
-    private static class PutOperation extends UpdateOperation
+    private class PutOperation extends UpdateOperation
     {
         PutOperation( long key )
         {
@@ -409,7 +409,7 @@
         }
     }
 
-    private static class RemoveOperation extends UpdateOperation
+    private class RemoveOperation extends UpdateOperation
     {
         RemoveOperation( long key )
         {
