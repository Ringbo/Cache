diff --git a/jetCheck/test/jetCheck/GeneratorTest.java b/jetCheck/test/jetCheck/GeneratorTest.java
index e7f2f63..35122b4 100644
--- a/jetCheck/test/jetCheck/GeneratorTest.java
+++ b/jetCheck/test/jetCheck/GeneratorTest.java
@@ -61,7 +61,7 @@
   public void testSortedDoublesNonDescending() {
     PropertyFailure<List<Double>> failure = checkFalsified(listsOf(doubles()),
                                                            l -> isSorted(l.stream().sorted().collect(Collectors.toList())),
-                                                           58);
+                                                           28);
     assertEquals(2, failure.getMinimalCounterexample().getExampleValue().size());
   }
 
