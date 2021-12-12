diff --git a/src/com/jwetherell/algorithms/sorts/timing/SortsTiming.java b/src/com/jwetherell/algorithms/sorts/timing/SortsTiming.java
index b5ae932..f1b81db 100644
--- a/src/com/jwetherell/algorithms/sorts/timing/SortsTiming.java
+++ b/src/com/jwetherell/algorithms/sorts/timing/SortsTiming.java
@@ -130,7 +130,7 @@
         putOutTheGarbage();
 
         bInsertion = System.nanoTime();
-        result = InsertionSort.sort(sorted.clone());
+        result = testable.sort(sorted.clone());
         if (checkResults && !check(result))
             System.err.println(testable.getName()+" failed.");
         aInsertion = System.nanoTime();
@@ -142,9 +142,9 @@
         putOutTheGarbage();
 
         bInsertion = System.nanoTime();
-        result = InsertionSort.sort(reverse.clone());
+        result = testable.sort(reverse.clone());
         if (checkResults && !check(result))
-            System.err.println(testable.getName()+"InsertionSort.");
+            System.err.println(testable.getName()+" failed.");
         aInsertion = System.nanoTime();
         diff = (aInsertion - bInsertion) / 1000000d / 1000d;
         System.out.println("Reverse sorted: "+testable.getName()+"=" + FORMAT.format(diff) + " secs");
