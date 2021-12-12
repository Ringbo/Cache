diff --git a/rxjava-core/src/test/java/rx/operators/OperationTakeWhileTest.java b/rxjava-core/src/test/java/rx/operators/OperationTakeWhileTest.java
index 08c6d8e..830dd59 100644
--- a/rxjava-core/src/test/java/rx/operators/OperationTakeWhileTest.java
+++ b/rxjava-core/src/test/java/rx/operators/OperationTakeWhileTest.java
@@ -119,7 +119,7 @@
             public Boolean call(String s) {
                 return false;
             }
-        })).toBlockingObservable().last();
+        })).toBlockingObservable().lastOrDefault("");
     }
 
     @Test
