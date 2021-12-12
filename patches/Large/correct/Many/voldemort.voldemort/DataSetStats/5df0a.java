diff --git a/src/java/voldemort/store/stats/DataSetStats.java b/src/java/voldemort/store/stats/DataSetStats.java
index d03cdb4..afee95f 100644
--- a/src/java/voldemort/store/stats/DataSetStats.java
+++ b/src/java/voldemort/store/stats/DataSetStats.java
@@ -26,7 +26,7 @@
         if(keySize > this.maxKeySize)
             this.maxKeySize = keySize;
         if(keySize < this.minKeySize)
-            this.maxKeySize = keySize;
+            this.minKeySize = keySize;
         if(valueSize > this.maxValueSize)
             this.maxValueSize = valueSize;
         if(valueSize < this.minValueSize)
