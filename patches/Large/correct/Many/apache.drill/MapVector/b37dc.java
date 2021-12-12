diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java b/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
index 8fb56e6..d8bd525 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
@@ -336,7 +336,7 @@
         v = TypeHelper.getNewVector(fieldDef, allocator);
         put(fieldDef.getLastName(), v);
       }
-      if (fmd.getValueCount() == 0) {
+      if (fmd.getValueCount() == 0 && (!fmd.hasGroupCount() || fmd.getGroupCount() == 0)) {
         v.clear();
       } else {
         v.load(fmd, buf.slice(bufOffset, fmd.getBufferLength()));
