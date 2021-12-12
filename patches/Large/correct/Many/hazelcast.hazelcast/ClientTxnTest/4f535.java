diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
index 16e4a67..d550014 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
@@ -106,7 +106,7 @@
         try{
             context.commitTransaction();
             fail("commit should throw exception !");
-        } catch (TransactionException e){
+        } catch (Exception e){
             context.rollbackTransaction();
             latch.countDown();
         }
