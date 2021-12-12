diff --git a/sharding-core/src/test/java/io/shardingsphere/core/keygen/DefaultKeyGeneratorTest.java b/sharding-core/src/test/java/io/shardingsphere/core/keygen/DefaultKeyGeneratorTest.java
index 4c8cc70..a479e3e 100644
--- a/sharding-core/src/test/java/io/shardingsphere/core/keygen/DefaultKeyGeneratorTest.java
+++ b/sharding-core/src/test/java/io/shardingsphere/core/keygen/DefaultKeyGeneratorTest.java
@@ -159,6 +159,6 @@
         Field maxTolerateTimeDifferenceMillisecondsField = DefaultKeyGenerator.class.getDeclaredField("maxTolerateTimeDifferenceMilliseconds");
         maxTolerateTimeDifferenceMillisecondsField.setAccessible(true);
         assertThat(maxTolerateTimeDifferenceMillisecondsField.getInt(DefaultKeyGenerator.class), is(1));
-        DefaultKeyGenerator.setMaxTolerateTimeDifferenceMilliseconds(0);
+        DefaultKeyGenerator.setMaxTolerateTimeDifferenceMilliseconds(10);
     }
 }
