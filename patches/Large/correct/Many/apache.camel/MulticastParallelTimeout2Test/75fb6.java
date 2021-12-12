diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
index 8986641..93d0377 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
@@ -66,7 +66,7 @@
 
                 from("direct:a").to("mock:A").setBody(constant("A"));
 
-                from("direct:b").delay(500).to("mock:B").setBody(constant("B"));
+                from("direct:b").delay(1000).to("mock:B").setBody(constant("B"));
 
                 from("direct:c").to("mock:C").setBody(constant("C"));
                 // END SNIPPET: e1
