diff --git a/core/java/android/net/LocalSocketImpl.java b/core/java/android/net/LocalSocketImpl.java
index 8e129cb..3b43c36 100644
--- a/core/java/android/net/LocalSocketImpl.java
+++ b/core/java/android/net/LocalSocketImpl.java
@@ -147,7 +147,7 @@
         public void flush() throws IOException {
             FileDescriptor myFd = fd;
             if (myFd == null) throw new IOException("socket closed");
-            while(pending_native(fd) > 0) {
+            while(pending_native(myFd) > 0) {
                 try {
                     Thread.sleep(10);
                 } catch (InterruptedException ie) {
