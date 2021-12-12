diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/VectorColumnSetInfo.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/VectorColumnSetInfo.java
index d9c16dc..8c4b6ea 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/VectorColumnSetInfo.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/VectorColumnSetInfo.java
@@ -126,7 +126,8 @@
       doubleIndices[doubleIndicesIndex] = addIndex;
       indexLookup[addIndex].setDouble(doubleIndicesIndex);
       ++doubleIndicesIndex;
-    } else if (VectorizationContext.isStringFamily(outputType)) {
+    } else if (VectorizationContext.isStringFamily(outputType) ||
+        outputType.equalsIgnoreCase("binary")) {
       stringIndices[stringIndicesIndex]= addIndex;
       indexLookup[addIndex].setString(stringIndicesIndex);
       ++stringIndicesIndex;
