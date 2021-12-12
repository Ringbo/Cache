diff --git a/drools-persistence-jpa/src/main/java/org/drools/persistence/jta/JtaTransactionManager.java b/drools-persistence-jpa/src/main/java/org/drools/persistence/jta/JtaTransactionManager.java
index e84f381..4f9bce3 100644
--- a/drools-persistence-jpa/src/main/java/org/drools/persistence/jta/JtaTransactionManager.java
+++ b/drools-persistence-jpa/src/main/java/org/drools/persistence/jta/JtaTransactionManager.java
@@ -138,10 +138,10 @@
         String jndiName = DEFAULT_TRANSACTION_SYNCHRONIZATION_REGISTRY_NAME;
         try {
             InitialContext context = new InitialContext();
-            context.lookup( jndiName );
+            Object tsrObject = context.lookup( jndiName );
             logger.debug( "JTA TransactionSynchronizationRegistry found at default JNDI location [{}]",
                           jndiName );
-            return tsr;
+            return tsrObject;
         } catch ( NamingException ex ) {
             logger.debug( "No JTA TransactionSynchronizationRegistry found at default JNDI location [{}]",
                           jndiName,
