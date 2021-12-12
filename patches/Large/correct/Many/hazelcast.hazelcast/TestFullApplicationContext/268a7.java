diff --git a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
index 5d88a0e..c9b4a30 100644
--- a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
+++ b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
@@ -313,7 +313,7 @@
         assertEquals("sample-tag-key", aws.getTagKey());
         assertEquals("sample-tag-value", aws.getTagValue());
 
-        assertFalse("reuse-address", networkConfig.isReuseAddress());
+        assertTrue("reuse-address", networkConfig.isReuseAddress());
     }
 
 //    @Test
