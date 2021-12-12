diff --git a/guava-testlib/src/com/google/common/collect/testing/google/MultisetNavigationTester.java b/guava-testlib/src/com/google/common/collect/testing/google/MultisetNavigationTester.java
index efb2e64..aaca5bb 100644
--- a/guava-testlib/src/com/google/common/collect/testing/google/MultisetNavigationTester.java
+++ b/guava-testlib/src/com/google/common/collect/testing/google/MultisetNavigationTester.java
@@ -453,7 +453,7 @@
     }
   }
 
-  private int totalSize(Iterable<? extends Entry<?>> entries) {
+  private static int totalSize(Iterable<? extends Entry<?>> entries) {
     int sum = 0;
     for (Entry<?> entry : entries) {
       sum += entry.getCount();
