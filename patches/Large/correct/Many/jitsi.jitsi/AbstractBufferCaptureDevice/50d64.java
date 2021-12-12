diff --git a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractBufferCaptureDevice.java b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractBufferCaptureDevice.java
index 56ede98..0148475 100644
--- a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractBufferCaptureDevice.java
+++ b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractBufferCaptureDevice.java
@@ -476,13 +476,15 @@
      * Gets the <tt>AbstractBufferStream</tt>s through which this
      * <tt>AbstractBufferCaptureDevice</tt> gives access to its media data.
      *
-     * @param clz the <tt>Class</tt> of <tt>AbstractBufferStream</tt> which is
-     * to be the element type of the returned array
-     * @return an array of the <tt>AbstractBufferStream</tt>s through which this
+     * @param <SourceStreamT> the type of <tt>SourceStream</tt> which is to be
+     * the element type of the returned array
+     * @param clz the <tt>Class</tt> of <tt>SourceStream</tt> which is to be the
+     * element type of the returned array
+     * @return an array of the <tt>SourceStream</tt>s through which this
      * <tt>AbstractBufferCaptureDevice</tt> gives access to its media data
      */
-    public synchronized AbstractBufferStreamT[] getStreams(
-            Class<AbstractBufferStreamT> clz)
+    public synchronized <SourceStreamT> SourceStreamT[] getStreams(
+            Class<SourceStreamT> clz)
     {
         if (streams == null)
         {
@@ -515,8 +517,8 @@
 
         int streamCount = (streams == null) ? 0 : streams.length;
         @SuppressWarnings("unchecked")
-        AbstractBufferStreamT[] clone
-            = (AbstractBufferStreamT[]) Array.newInstance(clz, streamCount);
+        SourceStreamT[] clone
+            = (SourceStreamT[]) Array.newInstance(clz, streamCount);
 
         if (streamCount != 0)
             System.arraycopy(streams, 0, clone, 0, streamCount);
