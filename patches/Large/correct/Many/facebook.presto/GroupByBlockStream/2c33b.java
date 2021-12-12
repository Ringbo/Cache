diff --git a/src/main/java/com/facebook/presto/operators/GroupByBlockStream.java b/src/main/java/com/facebook/presto/operators/GroupByBlockStream.java
index aa216aa..ff344d4 100644
--- a/src/main/java/com/facebook/presto/operators/GroupByBlockStream.java
+++ b/src/main/java/com/facebook/presto/operators/GroupByBlockStream.java
@@ -67,7 +67,7 @@
                 }
 
                 // range does not include the current element
-                Range range = Range.create(startPosition, cursor.getPosition()); // todo: martin, change me to getCurrentValueEndPosition() when you add it
+                Range range = Range.create(startPosition, cursor.getCurrentValueEndPosition());
                 return new RunLengthEncodedBlock(key, range);
             }
         };
