diff --git a/hazelcast/src/test/java/com/hazelcast/spi/discovery/DiscoverySpiTest.java b/hazelcast/src/test/java/com/hazelcast/spi/discovery/DiscoverySpiTest.java
index 15abe04..4633686 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/discovery/DiscoverySpiTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/discovery/DiscoverySpiTest.java
@@ -251,14 +251,14 @@
         // without lookup of environment
         assertEquals("value-first", strategy.getOrNull(first));
         assertEquals(Boolean.FALSE, strategy.getOrNull(second));
-        assertEquals(100, ((Long) strategy.getOrNull(third)).longValue());
+        assertEquals(100, ((Integer) strategy.getOrNull(third)).intValue());
         assertNull(strategy.getOrNull(fourth));
 
         // with lookup of environment (workaround to set environment doesn't work on all JDKs)
         if (System.getenv("test.third") != null) {
             assertEquals("value-first", strategy.getOrNull("test", first));
             assertEquals(Boolean.TRUE, strategy.getOrNull("test", second));
-            assertEquals(300, ((Long) strategy.getOrNull("test", third)).longValue());
+            assertEquals(300, ((Integer) strategy.getOrNull("test", third)).intValue());
             assertNull(strategy.getOrNull("test", fourth));
         }
     }
