diff --git a/src/main/com/mongodb/DBCollectionImpl.java b/src/main/com/mongodb/DBCollectionImpl.java
index da4912e..4a79690 100644
--- a/src/main/com/mongodb/DBCollectionImpl.java
+++ b/src/main/com/mongodb/DBCollectionImpl.java
@@ -632,7 +632,7 @@
                         }
                         run.add(writeRequest, curIndex);
                         curIndex++;
-                        if (run.size() > maxBatchWriteSize) {
+                        if (run.size() == maxBatchWriteSize) {
                             return runs.remove(run.type);
                         }
                     }
