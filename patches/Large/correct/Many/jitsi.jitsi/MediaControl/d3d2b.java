diff --git a/src/net/java/sip/communicator/impl/media/MediaControl.java b/src/net/java/sip/communicator/impl/media/MediaControl.java
index f864283..9854ea0 100644
--- a/src/net/java/sip/communicator/impl/media/MediaControl.java
+++ b/src/net/java/sip/communicator/impl/media/MediaControl.java
@@ -169,6 +169,7 @@
      * Returns the duration of the output data source. Usually this will be 
      * DURATION_UNKNOWN, but if the current data source is set to an audio
      * file, then this value will be of some use.
+     * @return the output duration
      */
     public javax.media.Time getOutputDuration()
     {
@@ -497,13 +498,14 @@
 
             //Changing buffer size. The default buffer size (for javasound)
             //is 125 milliseconds - 1/8 sec. On MacOS this leeds to exception and
-            // no audio capture. 130 value of buffer fix the problem.
+            // no audio capture. 30 value of buffer fix the problem and is ok
+            // when using some pstn gateways
             Control ctl = (Control)
                 dataSource.getControl("javax.media.control.BufferControl");
 
             if(ctl != null)
             {
-                ((BufferControl)ctl).setBufferLength(130);//buffers in
+                ((BufferControl)ctl).setBufferLength(30);//buffers in
             }
 
             sourceProcessor = Manager.createProcessor(dataSource);
@@ -907,7 +909,7 @@
     private VideoFormat assertSize(VideoFormat sourceFormat)
     {
         int width, height;
-        Dimension size = ( (VideoFormat) sourceFormat).getSize();
+        Dimension size = sourceFormat.getSize();
         Format jpegFmt = new Format(VideoFormat.JPEG_RTP);
         Format h263Fmt = new Format(VideoFormat.H263_RTP);
         if (sourceFormat.matches(jpegFmt))
