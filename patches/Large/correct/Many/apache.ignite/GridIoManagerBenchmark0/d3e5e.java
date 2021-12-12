diff --git a/modules/core/src/test/java/org/apache/ignite/loadtests/communication/GridIoManagerBenchmark0.java b/modules/core/src/test/java/org/apache/ignite/loadtests/communication/GridIoManagerBenchmark0.java
index cac3e59..3076184 100644
--- a/modules/core/src/test/java/org/apache/ignite/loadtests/communication/GridIoManagerBenchmark0.java
+++ b/modules/core/src/test/java/org/apache/ignite/loadtests/communication/GridIoManagerBenchmark0.java
@@ -114,7 +114,7 @@
         info("Messages: " + CONCUR_MSGS);
 
         final Semaphore sem = new Semaphore(CONCUR_MSGS);
-        final LongAdder msgCntr = new LongAdder();
+        final LongAdder8 msgCntr = new LongAdder8();
 
         final String topic = "test-topic";
 
@@ -206,7 +206,7 @@
         final GridIoManager snd = sndKernal.context().io();
         final GridIoManager rcv = rcvKernal.context().io();
 
-        final LongAdder msgCntr = new LongAdder();
+        final LongAdder8 msgCntr = new LongAdder8();
 
         final Integer topic = 1;
 
@@ -306,7 +306,7 @@
         info("Messages: " + CONCUR_MSGS);
 
         final Semaphore sem = new Semaphore(CONCUR_MSGS);
-        final LongAdder msgCntr = new LongAdder();
+        final LongAdder8 msgCntr = new LongAdder8();
 
         final String topic = "test-topic";
 
