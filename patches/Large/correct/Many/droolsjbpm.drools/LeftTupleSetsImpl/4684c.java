diff --git a/drools-core/src/main/java/org/drools/core/common/LeftTupleSetsImpl.java b/drools-core/src/main/java/org/drools/core/common/LeftTupleSetsImpl.java
index c30af56..6cab54d 100644
--- a/drools-core/src/main/java/org/drools/core/common/LeftTupleSetsImpl.java
+++ b/drools-core/src/main/java/org/drools/core/common/LeftTupleSetsImpl.java
@@ -190,7 +190,7 @@
                 }
                 LeftTuple leftTuple = tupleSetsImpl.getInsertFirst();
                 last.setStagedNext( leftTuple );
-                leftTuple.setStagePrevious( leftTuple );
+                leftTuple.setStagePrevious( last );
                 insertSize = insertSize + tupleSetsImpl.insertSize();
             }
             tupleSetsImpl.insertSize = 0;
@@ -213,7 +213,7 @@
                 }
                 LeftTuple leftTuple = tupleSets.getDeleteFirst();
                 last.setStagedNext( leftTuple );
-                leftTuple.setStagePrevious( leftTuple );
+                leftTuple.setStagePrevious( last );
                 deleteSize = deleteSize + tupleSetsImpl.deleteSize();
             }
             tupleSetsImpl.deleteFirst = null;
@@ -236,7 +236,7 @@
                 }
                 LeftTuple leftTuple = tupleSetsImpl.getUpdateFirst();
                 last.setStagedNext( leftTuple );
-                leftTuple.setStagePrevious( leftTuple );
+                leftTuple.setStagePrevious( last );
                 updateSize = updateSize + tupleSetsImpl.updateSize();
             }
             tupleSetsImpl.updateFirst = null;
