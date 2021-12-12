diff --git a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/cache/replication/CacheReplicationTest.java b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/cache/replication/CacheReplicationTest.java
index 09c9be6..b2e32a0 100644
--- a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/cache/replication/CacheReplicationTest.java
+++ b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/cache/replication/CacheReplicationTest.java
@@ -53,7 +53,7 @@
         template.sendBody("direct:addRoute", "Am I replicated?");
 
         // give some time to make replication
-        Thread.sleep(200);
+        Thread.sleep(300);
 
         template.sendBody("direct:getRoute1", "Will I get replicated cache");
         template.sendBody("direct:getRoute2", "Will I get replicated cache");
