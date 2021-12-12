diff --git a/camel-core/src/test/java/org/apache/camel/processor/WireTapTest.java b/camel-core/src/test/java/org/apache/camel/processor/WireTapTest.java
index 1b475d0..a3390d6 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/WireTapTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/WireTapTest.java
@@ -57,7 +57,7 @@
                 // END SNIPPET: e1
 
                 from("direct:tap")
-                    .delay(100).setBody().constant("Tapped")
+                    .delay(1000).setBody().constant("Tapped")
                     .to("mock:result", "mock:tap");
             }
         };
