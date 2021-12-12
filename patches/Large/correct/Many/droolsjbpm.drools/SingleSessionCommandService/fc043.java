diff --git a/drools-persistence-jpa/src/main/java/org/drools/persistence/SingleSessionCommandService.java b/drools-persistence-jpa/src/main/java/org/drools/persistence/SingleSessionCommandService.java
index 4cce707..ee91b7c 100644
--- a/drools-persistence-jpa/src/main/java/org/drools/persistence/SingleSessionCommandService.java
+++ b/drools-persistence-jpa/src/main/java/org/drools/persistence/SingleSessionCommandService.java
@@ -400,7 +400,7 @@
     private void rollbackTransaction(Exception t1,
                                      boolean transactionOwner) {
         try {
-            logger.error( "Could not commit session",
+            logger.warn( "Could not commit session",
                           t1 );
             txm.rollback( transactionOwner );
         } catch ( Exception t2 ) {
