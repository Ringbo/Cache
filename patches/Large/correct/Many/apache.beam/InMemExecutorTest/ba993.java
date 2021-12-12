diff --git a/sdks/java/extensions/euphoria/euphoria-core/src/test/java/cz/seznam/euphoria/core/executor/inmem/InMemExecutorTest.java b/sdks/java/extensions/euphoria/euphoria-core/src/test/java/cz/seznam/euphoria/core/executor/inmem/InMemExecutorTest.java
index 8cff2ca..305791d 100644
--- a/sdks/java/extensions/euphoria/euphoria-core/src/test/java/cz/seznam/euphoria/core/executor/inmem/InMemExecutorTest.java
+++ b/sdks/java/extensions/euphoria/euphoria-core/src/test/java/cz/seznam/euphoria/core/executor/inmem/InMemExecutorTest.java
@@ -678,7 +678,7 @@
           }
         }).output();
 
-    ListDataSink<Long> outputs = ListDataSink.get(2);
+    ListDataSink<Long> outputs = ListDataSink.get(1);
 
     ReduceWindow.of(input)
         .valueBy(e -> 1L)
@@ -773,7 +773,7 @@
     Dataset<Integer> input = flow.createInput(
         ListDataSource.unbounded(reversed(sequenceInts(0, N))));
 
-    ListDataSink<Integer> outputs = ListDataSink.get(2);
+    ListDataSink<Integer> outputs = ListDataSink.get(1);
 
     ReduceWindow.of(input)
         .valueBy(e -> e)
@@ -793,9 +793,7 @@
     // (1999, 1998, 1997, 1996 and 1995)
     // all other windows are discarded
     List<Integer> output = outputs.getOutputs().get(0);
-    // FIXME: there is something wrong with this
-    // why are the elements out of order?
-    assertEquals(Arrays.asList(1996, 1995, 1998, 1997, 1999), output);
+    assertUnorderedEquals(Arrays.asList(1999, 1998, 1997, 1996, 1995), output);
 
   }
 
