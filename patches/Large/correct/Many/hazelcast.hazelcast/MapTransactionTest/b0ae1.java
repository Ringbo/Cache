diff --git a/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java b/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
index 5c51100..866c716 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
@@ -581,7 +581,7 @@
                     final TransactionalMap<Object, Object> txMap = context.getMap("default");
                     txMap.put("5", "5");
                     assertEquals(3, txMap.keySet().size());
-                    assertEquals(3, map2.keySet().size());
+                    assertEquals(2, map2.keySet().size());
 
                     throw new DummyUncheckedHazelcastTestException();
                 }
