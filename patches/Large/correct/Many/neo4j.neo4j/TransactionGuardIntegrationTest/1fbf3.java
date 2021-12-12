diff --git a/integrationtests/src/test/java/org/neo4j/TransactionGuardIntegrationTest.java b/integrationtests/src/test/java/org/neo4j/TransactionGuardIntegrationTest.java
index 5003d5d..e47bdc2 100644
--- a/integrationtests/src/test/java/org/neo4j/TransactionGuardIntegrationTest.java
+++ b/integrationtests/src/test/java/org/neo4j/TransactionGuardIntegrationTest.java
@@ -763,15 +763,15 @@
         }
 
         @Override
-        public IdGenerator open( File filename, IdType idType, long highId, long maxId )
+        public IdGenerator open( File filename, IdType idType, Supplier<Long> highIdSupplier, long maxId )
         {
-            return delegate.open( filename, idType, highId, maxId );
+            return delegate.open( filename, idType, highIdSupplier, maxId );
         }
 
         @Override
-        public IdGenerator open( File filename, int grabSize, IdType idType, long highId, long maxId )
+        public IdGenerator open( File filename, int grabSize, IdType idType, Supplier<Long> highIdSupplier, long maxId )
         {
-            return new TerminationIdGenerator( delegate.open( filename, grabSize, idType, highId, maxId ) );
+            return new TerminationIdGenerator( delegate.open( filename, grabSize, idType, highIdSupplier, maxId ) );
         }
 
         @Override
