diff --git a/h2o-algos/src/main/java/hex/DataInfo.java b/h2o-algos/src/main/java/hex/DataInfo.java
index 3735192..0555390 100644
--- a/h2o-algos/src/main/java/hex/DataInfo.java
+++ b/h2o-algos/src/main/java/hex/DataInfo.java
@@ -585,7 +585,7 @@
     }
     // generic numbers
     for (int cid = 0; cid < _nums; ++cid) {
-      Chunk c = chunks[_cats + _nums + cid];
+      Chunk c = chunks[_cats + cid];
       for (int r = c.nextNZ(-1); r < c._len; r = c.nextNZ(r)) {
         Row row = rows[r];
         if (c.isNA(r)) row.good = _skipMissing;
