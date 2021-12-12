diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout3Test.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout3Test.java
index 67b45a2..4a46086 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout3Test.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout3Test.java
@@ -68,7 +68,7 @@
 
                 from("direct:b").to("mock:B").setBody(constant("B"));
 
-                from("direct:c").delay(500).to("mock:C").setBody(constant("C"));
+                from("direct:c").delay(1000).to("mock:C").setBody(constant("C"));
                 // END SNIPPET: e1
             }
         };
