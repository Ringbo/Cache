diff --git a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
index 65d8824..23a25ee 100644
--- a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
+++ b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
@@ -310,7 +310,7 @@
         assertEquals("sample-tag-key", aws.getTagKey());
         assertEquals("sample-tag-value", aws.getTagValue());
 
-        assertFalse("reuse-address", networkConfig.isReuseAddress());
+        assertTrue("reuse-address", networkConfig.isReuseAddress());
     }
 
 //    @Test
