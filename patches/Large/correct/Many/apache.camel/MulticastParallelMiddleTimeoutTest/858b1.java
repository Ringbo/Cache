diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelMiddleTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelMiddleTimeoutTest.java
index 6ca567b..f63d193 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelMiddleTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelMiddleTimeoutTest.java
@@ -61,7 +61,7 @@
 
                 from("direct:a").setBody(constant("A"));
 
-                from("direct:b").delay(3000).setBody(constant("B"));
+                from("direct:b").delay(4000).setBody(constant("B"));
 
                 from("direct:c").delay(500).setBody(constant("C"));
             }
