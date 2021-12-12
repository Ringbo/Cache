diff --git a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/MasterImpl.java b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/MasterImpl.java
index 2ebbc2a..7a70d7b 100644
--- a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/MasterImpl.java
+++ b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/MasterImpl.java
@@ -278,14 +278,14 @@
             XaDataSource dataSource = graphDbConfig.getTxModule().getXaDataSourceManager()
                     .getXaDataSource( resource );
             final long txId = dataSource.applyPreparedTransaction( txGetter.extract() );
-            Predicate<Long> notThisTx = new Predicate<Long>()
+            Predicate<Long> upUntilThisTx = new Predicate<Long>()
             {
                 public boolean accept( Long item )
                 {
-                    return item != txId;
+                    return item < txId;
                 }
             };
-            return packResponse( context, txId, notThisTx );
+            return packResponse( context, txId, upUntilThisTx );
         }
         catch ( IOException e )
         {
