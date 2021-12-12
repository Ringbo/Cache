diff --git a/drools-core/src/main/java/org/drools/core/common/RightTupleSetsImpl.java b/drools-core/src/main/java/org/drools/core/common/RightTupleSetsImpl.java
index d65c74f..169c9c1 100644
--- a/drools-core/src/main/java/org/drools/core/common/RightTupleSetsImpl.java
+++ b/drools-core/src/main/java/org/drools/core/common/RightTupleSetsImpl.java
@@ -188,7 +188,7 @@
             }
             RightTuple rightTuple = tupleSetsImpl.getInsertFirst();
             last.setStagedNext( rightTuple );
-            rightTuple.setStagePrevious( rightTuple );
+            rightTuple.setStagePrevious( last );
             insertSize = insertSize + tupleSetsImpl.insertSize();
         }
     }
@@ -207,7 +207,7 @@
             }
             RightTuple rightTuple = tupleSetsImpl.getDeleteFirst();
             last.setStagedNext( rightTuple );
-            rightTuple.setStagePrevious( rightTuple );
+            rightTuple.setStagePrevious( last );
             deleteSize = deleteSize + tupleSetsImpl.deleteSize();
         }
     }
@@ -226,7 +226,7 @@
             }
             RightTuple rightTuple = tupleSetsImpl.getUpdateFirst();
             last.setStagedNext( rightTuple );
-            rightTuple.setStagePrevious( rightTuple );
+            rightTuple.setStagePrevious( last );
             updateSize = updateSize + tupleSetsImpl.updateSize();
         }
     }
