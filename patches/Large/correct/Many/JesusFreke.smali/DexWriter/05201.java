diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/DexWriter.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/DexWriter.java
index 7378673..6033f86 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/DexWriter.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/DexWriter.java
@@ -666,7 +666,7 @@
             for (MethodKey method: methods) {
                 int offset = classSection.getAnnotationSetRefListOffset(method);
                 if (offset != DexWriter.NO_OFFSET) {
-                    methodAnnotations++;
+                    parameterAnnotations++;
                     tempBuffer.putInt(methodSection.getMethodIndex(method));
                     tempBuffer.putInt(offset);
                 }
