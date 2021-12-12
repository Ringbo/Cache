diff --git a/camel-core/src/test/java/org/apache/camel/component/mock/MockEndpointTest.java b/camel-core/src/test/java/org/apache/camel/component/mock/MockEndpointTest.java
index 459df76..860d2cd7 100644
--- a/camel-core/src/test/java/org/apache/camel/component/mock/MockEndpointTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/mock/MockEndpointTest.java
@@ -161,10 +161,10 @@
         });
 
         try {
-            resultEndpoint.assertIsNotSatisfied();
+            resultEndpoint.assertIsSatisfied();
             fail("Should fail");
         } catch (AssertionError e) {
-            assertEquals("mock://result Expected 2 properties with key[bar], received 1 properties. Expected property values: [456]", e.getMessage());
+            assertEquals("mock://result Expected 2 properties with key[foo], received 1 properties. Expected property values: [456]", e.getMessage());
         }
     }
 
