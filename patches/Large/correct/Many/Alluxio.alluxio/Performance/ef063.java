diff --git a/core/src/main/java/tachyon/examples/Performance.java b/core/src/main/java/tachyon/examples/Performance.java
index 3e80eb8..411c7b0 100644
--- a/core/src/main/java/tachyon/examples/Performance.java
+++ b/core/src/main/java/tachyon/examples/Performance.java
@@ -52,7 +52,7 @@
 
   public static void createFiles() throws IOException {
     long startTimeMs = CommonUtils.getCurrentMs();
-    for (int k = 0; k < THREADS; k ++) {
+    for (int k = 0; k < FILES; k++) {
       int fileId = MTC.createFile(FILE_NAME + (k + BASE_FILE_NUMBER));
       CommonUtils.printTimeTakenMs(startTimeMs, LOG, "user_createFiles with fileId " + fileId);
     }
@@ -109,12 +109,12 @@
         for (int times = mLeft; times < mRight; times ++) {
           long startTimeMs = System.currentTimeMillis();
           if (!mMemoryOnly) {
-            file = new RandomAccessFile(FOLDER + (mWorkerId + BASE_FILE_NUMBER), "rw");
+            file = new RandomAccessFile(FOLDER + (times + BASE_FILE_NUMBER), "rw");
             dst = file.getChannel().map(MapMode.READ_WRITE, 0, FILE_BYTES);
           }
           dst.order(ByteOrder.nativeOrder());
           for (int k = 0; k < BLOCKS_PER_FILE; k ++) {
-            mBuf.array()[0] = (byte) (k + mWorkerId);
+            mBuf.putInt(0, k + mWorkerId);
             dst.put(mBuf.array());
           }
           dst.clear();
@@ -134,7 +134,7 @@
         for (int times = mLeft; times < mRight; times ++) {
           long startTimeMs = System.currentTimeMillis();
           if (!mMemoryOnly) {
-            file = new RandomAccessFile(FOLDER + (mWorkerId + BASE_FILE_NUMBER), "rw");
+            file = new RandomAccessFile(FOLDER + (times + BASE_FILE_NUMBER), "rw");
             dst = file.getChannel().map(MapMode.READ_WRITE, 0, FILE_BYTES);
           }
           dst.order(ByteOrder.nativeOrder());
@@ -180,10 +180,10 @@
       mBuf.flip();
       for (int pId = mLeft; pId < mRight; pId ++) {
         long startTimeMs = System.currentTimeMillis();
-        TachyonFile file = mTC.getFile(FILE_NAME + (mWorkerId + BASE_FILE_NUMBER));
+        TachyonFile file = mTC.getFile(FILE_NAME + (pId + BASE_FILE_NUMBER));
         OutStream os = file.getOutStream(WriteType.MUST_CACHE);
         for (int k = 0; k < BLOCKS_PER_FILE; k ++) {
-          mBuf.array()[0] = (byte) (k + mWorkerId);
+          mBuf.putInt(0, k + mWorkerId);
           os.write(mBuf.array());
         }
         os.close();
@@ -216,10 +216,10 @@
         LOG.info("Verifying the reading data...");
 
         for (int pId = mLeft; pId < mRight; pId ++) {
-          TachyonFile file = mTC.getFile(FILE_NAME + mWorkerId);
+          TachyonFile file = mTC.getFile(FILE_NAME + (pId + BASE_FILE_NUMBER));
           buf = file.readByteBuffer(0);
           IntBuffer intBuf;
-          intBuf = buf.DATA.asIntBuffer();
+          intBuf = buf.DATA.order(ByteOrder.nativeOrder()).asIntBuffer();
           int tmp;
           for (int i = 0; i < BLOCKS_PER_FILE; i ++) {
             for (int k = 0; k < BLOCK_SIZE_BYTES / 4; k ++) {
@@ -238,7 +238,7 @@
       if (TACHYON_STREAMING_READ) {
         for (int pId = mLeft; pId < mRight; pId ++) {
           long startTimeMs = System.currentTimeMillis();
-          TachyonFile file = mTC.getFile(FILE_NAME + (mWorkerId + BASE_FILE_NUMBER));
+          TachyonFile file = mTC.getFile(FILE_NAME + (pId + BASE_FILE_NUMBER));
           InputStream is = file.getInStream(ReadType.CACHE);
           long len = BLOCKS_PER_FILE * BLOCK_SIZE_BYTES;
 
@@ -253,7 +253,7 @@
       } else {
         for (int pId = mLeft; pId < mRight; pId ++) {
           long startTimeMs = System.currentTimeMillis();
-          TachyonFile file = mTC.getFile(FILE_NAME + (mWorkerId + BASE_FILE_NUMBER));
+          TachyonFile file = mTC.getFile(FILE_NAME + (pId + BASE_FILE_NUMBER));
           buf = file.readByteBuffer(0);
           for (int i = 0; i < BLOCKS_PER_FILE; i ++) {
             buf.DATA.get(mBuf.array());
@@ -261,7 +261,7 @@
           sum += mBuf.get(pId % 16);
 
           if (DEBUG_MODE) {
-            buf.DATA.flip();
+            buf.DATA.order(ByteOrder.nativeOrder()).flip();
             CommonUtils.printByteBuffer(LOG, buf.DATA);
           }
           buf.DATA.clear();
@@ -323,10 +323,10 @@
       if (mWrite) {
         for (int times = mLeft; times < mRight; times ++) {
           long startTimeMs = System.currentTimeMillis();
-          String filePath = FILE_NAME + (mWorkerId + BASE_FILE_NUMBER);
+          String filePath = FILE_NAME + (times + BASE_FILE_NUMBER);
           OutputStream os = mHdfsFs.create(new Path(filePath));
           for (int k = 0; k < BLOCKS_PER_FILE; k ++) {
-            mBuf.array()[0] = (byte) (k + mWorkerId);
+            mBuf.putInt(0, k + mWorkerId);
             os.write(mBuf.array());
           }
           os.close();
@@ -335,7 +335,7 @@
       } else {
         for (int times = mLeft; times < mRight; times ++) {
           long startTimeMs = System.currentTimeMillis();
-          String filePath = FILE_NAME + (mWorkerId + BASE_FILE_NUMBER);
+          String filePath = FILE_NAME + (times + BASE_FILE_NUMBER);
           InputStream is = mHdfsFs.open(new Path(filePath));
           long len = BLOCKS_PER_FILE * BLOCK_SIZE_BYTES;
 
