diff --git a/examples/camel-example-loan-broker/src/main/java/org/apache/camel/loanbroker/queue/version/LoanBroker.java b/examples/camel-example-loan-broker/src/main/java/org/apache/camel/loanbroker/queue/version/LoanBroker.java
index a7580e7..6c6d26c 100644
--- a/examples/camel-example-loan-broker/src/main/java/org/apache/camel/loanbroker/queue/version/LoanBroker.java
+++ b/examples/camel-example-loan-broker/src/main/java/org/apache/camel/loanbroker/queue/version/LoanBroker.java
@@ -100,7 +100,7 @@
             // Set the aggregation strategy for aggregating the out message            
             .multicast(new BankResponseAggregationStrategy().setAggregatingOutMessage(true))
                 // Send out the request to three different banks in parallel
-                .setParallelProcessing(true).to("jms:queue2:bank1", "jms:queue2:bank2", "jms:queue2:bank3");
+                .parallelProcessing(true).to("jms:queue2:bank1", "jms:queue2:bank2", "jms:queue2:bank3");
         
         // Each bank processor will process the message and put the response message back
         from("jms:queue2:bank1").process(new Bank("bank1"));
