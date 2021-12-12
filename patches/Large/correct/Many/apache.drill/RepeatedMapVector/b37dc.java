diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/RepeatedMapVector.java b/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/RepeatedMapVector.java
index 1b01c55..01ca841 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/RepeatedMapVector.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/RepeatedMapVector.java
@@ -462,7 +462,7 @@
         v = TypeHelper.getNewVector(fieldDef, allocator);
         put(fieldDef.getLastName(), v);
       }
-      if (fmd.getValueCount() == 0) {
+      if (fmd.getValueCount() == 0 && (!fmd.hasGroupCount() || fmd.getGroupCount() == 0)) {
         v.clear();
       } else {
         v.load(fmd, buf.slice(bufOffset, fmd.getBufferLength()));
