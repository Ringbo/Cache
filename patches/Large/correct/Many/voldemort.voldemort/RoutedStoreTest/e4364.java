diff --git a/test/unit/voldemort/store/routed/RoutedStoreTest.java b/test/unit/voldemort/store/routed/RoutedStoreTest.java
index 9c00181..f24b726 100644
--- a/test/unit/voldemort/store/routed/RoutedStoreTest.java
+++ b/test/unit/voldemort/store/routed/RoutedStoreTest.java
@@ -334,7 +334,7 @@
         // read repair on the last node in the code path that is only executed
         // if there are failures.
         Iterables.get(cluster.getNodes(), 1).getStatus().setUnavailable();
-        Iterables.getLast(cluster.getNodes()).getStatus().setUnavailable();
+        Iterables.getLast(cluster.getNodes()).getStatus().setAvailable();
         List<Versioned<byte[]>> versioneds = store.get(aKey);
         assertEquals(1, versioneds.size());
         assertEquals(new ByteArray(anotherValue), new ByteArray(versioneds.get(0).getValue()));
