diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
index a5ba440..81f285a 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
@@ -64,7 +64,7 @@
                     .end()
                     .to("mock:result");
 
-                from("direct:a").delay(500).to("mock:A").setBody(constant("A"));
+                from("direct:a").delay(1000).to("mock:A").setBody(constant("A"));
 
                 from("direct:b").to("mock:B").setBody(constant("B"));
 
