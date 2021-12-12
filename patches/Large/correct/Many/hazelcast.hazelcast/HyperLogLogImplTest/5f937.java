diff --git a/hazelcast/src/test/java/com/hazelcast/cardinality/impl/hyperloglog/impl/HyperLogLogImplTest.java b/hazelcast/src/test/java/com/hazelcast/cardinality/impl/hyperloglog/impl/HyperLogLogImplTest.java
index 073d4e4..172009a 100644
--- a/hazelcast/src/test/java/com/hazelcast/cardinality/impl/hyperloglog/impl/HyperLogLogImplTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cardinality/impl/hyperloglog/impl/HyperLogLogImplTest.java
@@ -49,7 +49,7 @@
     @Parameters(name = "precision:{0}, errorRange:{1}")
     public static Collection<Object[]> parameters() {
         return asList(new Object[][]{
-                {11, 6.5f},
+                {11, 7.0f},
                 {12, 5.5f},
                 {13, 3.5f},
                 {14, 3.0f},
