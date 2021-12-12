diff --git a/test/unit/voldemort/store/rebalancing/RedirectingStoreTest.java b/test/unit/voldemort/store/rebalancing/RedirectingStoreTest.java
index a7e72c2..ffc43bb 100644
--- a/test/unit/voldemort/store/rebalancing/RedirectingStoreTest.java
+++ b/test/unit/voldemort/store/rebalancing/RedirectingStoreTest.java
@@ -99,7 +99,8 @@
             ByteArray key = new ByteArray(ByteUtils.getBytes("" + i, "UTF-8"));
             byte[] value = ByteUtils.getBytes("value-" + i, "UTF-8");
 
-            Store<ByteArray, byte[]> store = server1.getStoreRepository().getLocalStore(storeName);
+            Store<ByteArray, byte[]> store = server1.getStoreRepository()
+                                                    .getStorageEngine(storeName);
             store.put(key,
                       Versioned.value(value,
                                       new VectorClock().incremented(0, System.currentTimeMillis())));
@@ -113,7 +114,7 @@
 
         RedirectingStore rebalancingStore = new RedirectingStore(0,
                                                                  server0.getStoreRepository()
-                                                                        .getLocalStore(storeName),
+                                                                        .getStorageEngine(storeName),
                                                                  metadata,
                                                                  new SocketPool(100,
                                                                                 100,
@@ -159,7 +160,8 @@
             ByteArray key = new ByteArray(ByteUtils.getBytes("" + i, "UTF-8"));
             byte[] value = ByteUtils.getBytes("value-" + i, "UTF-8");
 
-            Store<ByteArray, byte[]> store = server1.getStoreRepository().getLocalStore(storeName);
+            Store<ByteArray, byte[]> store = server1.getStoreRepository()
+                                                    .getStorageEngine(storeName);
             store.put(key,
                       Versioned.value(value,
                                       new VectorClock().incremented(0, System.currentTimeMillis())));
@@ -181,7 +183,7 @@
 
         RedirectingStore rebalancingStore = new RedirectingStore(0,
                                                                  server0.getStoreRepository()
-                                                                        .getLocalStore(storeName),
+                                                                        .getStorageEngine(storeName),
                                                                  metadata,
                                                                  new SocketPool(100,
                                                                                 100,
