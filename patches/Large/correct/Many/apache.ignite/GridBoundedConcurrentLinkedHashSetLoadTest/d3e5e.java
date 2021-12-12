diff --git a/modules/core/src/test/java/org/apache/ignite/loadtests/hashmap/GridBoundedConcurrentLinkedHashSetLoadTest.java b/modules/core/src/test/java/org/apache/ignite/loadtests/hashmap/GridBoundedConcurrentLinkedHashSetLoadTest.java
index aa82826..4855014 100644
--- a/modules/core/src/test/java/org/apache/ignite/loadtests/hashmap/GridBoundedConcurrentLinkedHashSetLoadTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/loadtests/hashmap/GridBoundedConcurrentLinkedHashSetLoadTest.java
@@ -54,7 +54,7 @@
 
         X.println("Set: " + set);
 
-        final LongAdder execCnt = new LongAdder();
+        final LongAdder8 execCnt = new LongAdder8();
 
         final AtomicBoolean finish = new AtomicBoolean();
 
