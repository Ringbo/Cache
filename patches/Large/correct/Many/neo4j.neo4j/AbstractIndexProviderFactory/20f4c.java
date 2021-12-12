diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/AbstractIndexProviderFactory.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/AbstractIndexProviderFactory.java
index d2774e3..8aa5755 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/AbstractIndexProviderFactory.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/AbstractIndexProviderFactory.java
@@ -43,7 +43,7 @@
     }
 
     @Override
-    public IndexProvider newInstance( KernelContext context, Dependencies dependencies )
+    public IndexProvider newInstance( KernelContext context, DEPENDENCIES dependencies )
     {
         PageCache pageCache = dependencies.pageCache();
         File databaseDir = context.directory();
