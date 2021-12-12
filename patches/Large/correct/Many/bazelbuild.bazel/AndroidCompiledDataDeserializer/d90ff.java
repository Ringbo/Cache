diff --git a/src/tools/android/java/com/google/devtools/build/android/AndroidCompiledDataDeserializer.java b/src/tools/android/java/com/google/devtools/build/android/AndroidCompiledDataDeserializer.java
index 70bcb68..6abf81a 100644
--- a/src/tools/android/java/com/google/devtools/build/android/AndroidCompiledDataDeserializer.java
+++ b/src/tools/android/java/com/google/devtools/build/android/AndroidCompiledDataDeserializer.java
@@ -252,7 +252,7 @@
     Preconditions.checkArgument(alignedSize <= Integer.MAX_VALUE);
 
     byte[] tableBytes = new byte[(int) alignedSize];
-    resourceTableStream.read(tableBytes, 0, (int) alignedSize);
+    resourceTableStream.readFully(tableBytes, 0, (int) alignedSize);
     ResourceTable resourceTable = ResourceTable.parseFrom(tableBytes);
 
     readPackages(consumers, resourceTable);
