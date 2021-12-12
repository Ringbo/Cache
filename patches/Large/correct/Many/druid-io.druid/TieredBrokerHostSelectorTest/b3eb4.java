diff --git a/server/src/test/java/io/druid/server/router/TieredBrokerHostSelectorTest.java b/server/src/test/java/io/druid/server/router/TieredBrokerHostSelectorTest.java
index 5c2320f..c815065 100644
--- a/server/src/test/java/io/druid/server/router/TieredBrokerHostSelectorTest.java
+++ b/server/src/test/java/io/druid/server/router/TieredBrokerHostSelectorTest.java
@@ -82,7 +82,7 @@
           }
         },
         factory,
-        Arrays.asList(new TimeBoundaryTieredBrokerSelectorStrategy(), new PriorityTieredBrokerSelectorStrategy(0, 1))
+        Arrays.asList(new TimeBoundaryTieredBrokerSelectorStrategy(), new PriorityTieredBrokerSelectorStrategy(1, 1))
     );
     EasyMock.expect(factory.createSelector(EasyMock.<String>anyObject())).andReturn(selector).atLeastOnce();
     EasyMock.replay(factory);
