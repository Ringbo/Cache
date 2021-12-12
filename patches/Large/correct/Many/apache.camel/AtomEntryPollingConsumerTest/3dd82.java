diff --git a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomEntryPollingConsumerTest.java b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomEntryPollingConsumerTest.java
index 7f4cadb..13c9268 100644
--- a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomEntryPollingConsumerTest.java
+++ b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomEntryPollingConsumerTest.java
@@ -39,7 +39,7 @@
 
     public void testResult3() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result3");
-        mock.expectedMessageCount(4);
+        mock.expectedMessageCount(2);
         mock.assertIsSatisfied();
     }
 
@@ -50,7 +50,7 @@
 
                 from("atom:file:src/test/data/feed.atom?splitEntries=true&filter=false").to("mock:result2");
 
-                from("atom:file:src/test/data/feed.atom?splitEntries=true&filter=true&lastUpdate=2007-11-13T14:35:00").to("mock:result3");
+                from("atom:file:src/test/data/feed.atom?splitEntries=true&filter=true&lastUpdate=2007-11-13T23:59:00").to("mock:result3");
             }
         };
     }
