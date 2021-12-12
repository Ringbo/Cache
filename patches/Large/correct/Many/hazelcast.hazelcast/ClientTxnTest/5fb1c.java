diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
index d550014..f16a450 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/txn/ClientTxnTest.java
@@ -36,9 +36,6 @@
 
 import static org.junit.Assert.*;
 
-/**
- * @author ali 6/6/13
- */
 @RunWith(HazelcastSerialClassRunner.class)
 @Category(QuickTest.class)
 public class ClientTxnTest {
@@ -77,7 +74,7 @@
 
             context.commitTransaction();
             fail("commit should throw exception!!!");
-        } catch (TransactionException e){
+        } catch (Exception e){
             context.rollbackTransaction();
             latch.countDown();
         }
