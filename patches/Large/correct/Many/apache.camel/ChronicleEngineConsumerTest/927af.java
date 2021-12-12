diff --git a/components/camel-chronicle/src/test/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumerTest.java b/components/camel-chronicle/src/test/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumerTest.java
index ccb6298..b6ee450 100644
--- a/components/camel-chronicle/src/test/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumerTest.java
+++ b/components/camel-chronicle/src/test/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumerTest.java
@@ -58,17 +58,17 @@
         mock.assertIsSatisfied();
 
         assertEquals(
-            mock.getExchanges().get(0).getIn().getHeader(ChronicleEngineConstants.MAP_EVENT_TYPE),
-            ChronicleEngineMapEventType.INSERT);
+            ChronicleEngineMapEventType.INSERT,
+            mock.getExchanges().get(0).getIn().getHeader(ChronicleEngineConstants.MAP_EVENT_TYPE));
         assertEquals(
-            mock.getExchanges().get(0).getIn().getBody(String.class),
-            "val-1");
+            "val-1",
+            mock.getExchanges().get(0).getIn().getBody(String.class));
         assertEquals(
-            mock.getExchanges().get(1).getIn().getHeader(ChronicleEngineConstants.MAP_EVENT_TYPE),
-            ChronicleEngineMapEventType.REMOVE);
+            ChronicleEngineMapEventType.REMOVE,
+            mock.getExchanges().get(1).getIn().getHeader(ChronicleEngineConstants.MAP_EVENT_TYPE));
         assertEquals(
-            mock.getExchanges().get(1).getIn().getHeader(ChronicleEngineConstants.OLD_VALUE),
-            "val-2");
+            "val-2",
+            mock.getExchanges().get(1).getIn().getHeader(ChronicleEngineConstants.OLD_VALUE));
     }
 
     @Test
