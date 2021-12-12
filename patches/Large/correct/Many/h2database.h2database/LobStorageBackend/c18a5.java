diff --git a/h2/src/main/org/h2/store/LobStorageBackend.java b/h2/src/main/org/h2/store/LobStorageBackend.java
index a3c0d6f..9b082dd 100644
--- a/h2/src/main/org/h2/store/LobStorageBackend.java
+++ b/h2/src/main/org/h2/store/LobStorageBackend.java
@@ -616,7 +616,7 @@
 
         public LobInputStream(long lob, long byteCount) {
             this.lob = lob;
-            remainingBytes = byteCount;
+            this.remainingBytes = byteCount;
             this.length = byteCount;
         }
 
@@ -670,10 +670,10 @@
 
         @Override
         public int available() throws IOException {
-            if (length > Integer.MAX_VALUE) {
+            if (remainingBytes > Integer.MAX_VALUE) {
                 return Integer.MAX_VALUE;
             }
-            return MathUtils.convertLongToInt(length);
+            return MathUtils.convertLongToInt(remainingBytes);
         }
 
         @Override
