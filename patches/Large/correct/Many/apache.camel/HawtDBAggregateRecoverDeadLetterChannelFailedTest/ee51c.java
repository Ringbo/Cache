diff --git a/components/camel-hawtdb/src/test/java/org/apache/camel/component/hawtdb/HawtDBAggregateRecoverDeadLetterChannelFailedTest.java b/components/camel-hawtdb/src/test/java/org/apache/camel/component/hawtdb/HawtDBAggregateRecoverDeadLetterChannelFailedTest.java
index dc12684..13f106f 100644
--- a/components/camel-hawtdb/src/test/java/org/apache/camel/component/hawtdb/HawtDBAggregateRecoverDeadLetterChannelFailedTest.java
+++ b/components/camel-hawtdb/src/test/java/org/apache/camel/component/hawtdb/HawtDBAggregateRecoverDeadLetterChannelFailedTest.java
@@ -39,7 +39,7 @@
         // and move to this dead letter channel
         repo.setDeadLetterUri("direct:dead");
         // check faster
-        repo.setRecoveryInterval(500, TimeUnit.MILLISECONDS);
+        repo.setRecoveryInterval(1000, TimeUnit.MILLISECONDS);
 
         super.setUp();
     }
@@ -65,7 +65,7 @@
         template.sendBodyAndHeader("direct:start", "D", "id", 123);
         template.sendBodyAndHeader("direct:start", "E", "id", 123);
 
-        assertMockEndpointsSatisfied();
+        assertMockEndpointsSatisfied(30, TimeUnit.SECONDS);
     }
 
     @Override
