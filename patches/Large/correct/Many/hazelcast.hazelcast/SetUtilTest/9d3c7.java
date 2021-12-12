diff --git a/hazelcast/src/test/java/com/hazelcast/util/SetUtilTest.java b/hazelcast/src/test/java/com/hazelcast/util/SetUtilTest.java
index 36a7a2a..d304d29 100644
--- a/hazelcast/src/test/java/com/hazelcast/util/SetUtilTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/util/SetUtilTest.java
@@ -37,7 +37,7 @@
 
     @Test
     public void testConstructor() {
-        assertUtilityConstructor(BitSetUtils.class);
+        assertUtilityConstructor(SetUtil.class);
     }
 
     @Test
