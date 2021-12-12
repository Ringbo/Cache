diff --git a/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerRow.java b/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerRow.java
index 44ce2b9..46acf3f 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerRow.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerRow.java
@@ -417,7 +417,7 @@
   }
 
   @Override public int bufferLen() {
-    return 4 * 5 + 2 * 8 + getRowSpace();
+    return 4 * 6 + 2 * 8 + getRowSpace();
   }
 
   @Override public String toString() {
