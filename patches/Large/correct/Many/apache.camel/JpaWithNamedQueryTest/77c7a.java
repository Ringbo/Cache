diff --git a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryTest.java b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryTest.java
index 6a23967..e91dac6 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryTest.java
@@ -107,7 +107,8 @@
 
         // lets now test that the database is updated
         // we need to sleep as we will be invoked from inside the transaction!
-        Thread.sleep(1000);
+        // org.apache.openjpa.persistence.InvalidStateException: This operation cannot be performed while a Transaction is active.
+        Thread.sleep(2000);
 
         transactionTemplate.execute(new TransactionCallback<Object>() {
             public Object doInTransaction(TransactionStatus status) {
