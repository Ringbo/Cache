diff --git a/src/net/java/sip/communicator/impl/neomedia/protocol/TranscodingDataSource.java b/src/net/java/sip/communicator/impl/neomedia/protocol/TranscodingDataSource.java
index a16f36e..d78ed0a 100644
--- a/src/net/java/sip/communicator/impl/neomedia/protocol/TranscodingDataSource.java
+++ b/src/net/java/sip/communicator/impl/neomedia/protocol/TranscodingDataSource.java
@@ -17,10 +17,10 @@
 import net.java.sip.communicator.impl.neomedia.*;
 
 /**
- * Represents a <tt>DataSource</tt> which transcodes the tracks of a
- * specific input <tt>DataSource</tt> into a specific output
- * <tt>Format</tt>. The transcoding is attempted only for tracks which
- * actually support it for the specified output <tt>Format</tt>.
+ * Represents a <tt>DataSource</tt> which transcodes the tracks of a specific
+ * input <tt>DataSource</tt> into a specific output <tt>Format</tt>. The
+ * transcoding is attempted only for tracks which actually support it for the
+ * specified output <tt>Format</tt>.
  * 
  * @author Lubomir Marinov
  */
@@ -29,39 +29,38 @@
 {
 
     /**
-     * The <tt>DataSource</tt> which has its tracks transcoded by this
-     * instance.
+     * The <tt>DataSource</tt> which has its tracks transcoded by this instance.
      */
     private final DataSource inputDataSource;
 
     /**
      * The <tt>DataSource</tt> which contains the transcoded tracks of
-     * <tt>inputDataSource</tt> and which is wrapped by this instance. It is
-     * the output of <tt>transcodingProcessor</tt>.
+     * <tt>inputDataSource</tt> and which is wrapped by this instance. It is the
+     * output of <tt>transcodingProcessor</tt>.
      */
     private DataSource outputDataSource;
 
     /**
-     * The <tt>Format</tt> in which the tracks of
-     * <tt>inputDataSource</tt> are transcoded.
+     * The <tt>Format</tt> in which the tracks of <tt>inputDataSource</tt> are
+     * transcoded.
      */
     private final Format outputFormat;
 
     /**
-     * The <tt>Processor</tt> which carries out the actual transcoding of
-     * the tracks of <tt>inputDataSource</tt>.
+     * The <tt>Processor</tt> which carries out the actual transcoding of the
+     * tracks of <tt>inputDataSource</tt>.
      */
     private Processor transcodingProcessor;
 
     /**
-     * Initializes a new <tt>TranscodingDataSource</tt> instance to
-     * transcode the tracks of a specific <tt>DataSource</tt> into a
-     * specific output <tt>Format</tt>.
+     * Initializes a new <tt>TranscodingDataSource</tt> instance to transcode
+     * the tracks of a specific <tt>DataSource</tt> into a specific output
+     * <tt>Format</tt>.
      * 
      * @param inputDataSource the <tt>DataSource</tt> which is to have its
      *            tracks transcoded in a specific outptu <tt>Format</tt>
-     * @param outputFormat the <tt>Format</tt> in which the new instance is
-     *            to transcode the tracks of <tt>inputDataSource</tt>
+     * @param outputFormat the <tt>Format</tt> in which the new instance is to
+     * transcode the tracks of <tt>inputDataSource</tt>
      */
     public TranscodingDataSource(
         DataSource inputDataSource,
@@ -73,13 +72,17 @@
         this.outputFormat = outputFormat;
     }
 
-    /*
-     * Implements DataSource#connect(). Sets up the very transcoding process and
-     * just does not start it i.e. creates a Processor on the inputDataSource,
-     * sets outputFormat on its tracks (which support a Format compatible with
-     * outputFormat) and connects to its output DataSource.
+    /**
+     * Implements {@link DataSource#connect()}. Sets up the very transcoding
+     * process and just does not start it i.e. creates a <tt>Processor</tt> on
+     * the <tt>inputDataSource</tt>, sets <tt>outputFormat</tt> on its tracks
+     * (which support a <tt>Format</tt> compatible with <tt>outputFormat</tt>)
+     * and connects to its <tt>output DataSource</tt>.
+     *
+     * @throws IOException if creating the transcoding <tt>Processor</tt>,
+     * setting its <tt>Format</tt> or connecting to it fails
      */
-    public void connect()
+    public synchronized void connect()
         throws IOException
     {
         if (outputDataSource != null)
@@ -149,12 +152,13 @@
         this.outputDataSource = outputDataSource;
     }
 
-    /*
-     * Implements DataSource#disconnect(). Stops and undoes the whole setup of
-     * the very transcoding process i.e. disconnects from the output DataSource
-     * of the transcodingProcessor and disposes of the transcodingProcessor.
+    /**
+     * Implements {@link DataSource#disconnect()}. Stops and undoes the whole
+     * setup of the very transcoding process i.e. disconnects from the output
+     * <tt>DataSource</tt> of the transcodingProcessor and disposes of the
+     * <tt>transcodingProcessor</tt>.
      */
-    public void disconnect()
+    public synchronized void disconnect()
     {
         if (outputDataSource == null)
             return;
@@ -177,11 +181,14 @@
         outputDataSource = null;
     }
 
-    /*
-     * Implements DataSource#getContentType(). Delegates to the actual output of
-     * the transcoding.
+    /**
+     * Implements {@link DataSource#getContentType()}. Delegates to the actual
+     * output of the transcoding.
+     *
+     * @return a <tt>String</tt> value which describes the type of the content
+     * made available by this <tt>DataSource</tt>
      */
-    public String getContentType()
+    public synchronized String getContentType()
     {
         return
             (outputDataSource == null)
@@ -189,11 +196,17 @@
                 : outputDataSource.getContentType();
     }
 
-    /*
-     * Implements DataSource#getControl(String). Delegates to the actual output
-     * of the transcoding.
+    /**
+     * Implements {@link DataSource#getControl(String)}. Delegates to the actual
+     * output of the transcoding.
+     *
+     * @param controlType a <tt>String</tt> value which names the type of the
+     * control to be retrieved
+     * @return an <tt>Object</tt> which represents the control of this instance
+     * with the specified type if such a control is available; otherwise,
+     * <tt>null</tt>
      */
-    public Object getControl(String controlType)
+    public synchronized Object getControl(String controlType)
     {
         /*
          * The Javadoc of DataSource#getControl(String) says it's an error to
@@ -203,11 +216,14 @@
         return outputDataSource.getControl(controlType);
     }
 
-    /*
-     * Implements DataSource#getControls(). Delegates to the actual output of
-     * the transcoding.
+    /**
+     * Implements {@link DataSource#getControls()}. Delegates to the actual
+     * output of the transcoding.
+     *
+     * @return an array of <tt>Object</tt>s which represent the controls
+     * available for this instance
      */
-    public Object[] getControls()
+    public synchronized Object[] getControls()
     {
         return
             (outputDataSource == null)
@@ -215,11 +231,14 @@
                 : outputDataSource.getControls();
     }
 
-    /*
-     * Implements DataSource#getDuration(). Delegates to the actual output of
-     * the transcoding.
+    /**
+     * Implements {@link DataSource#getDuration()}. Delegates to the actual
+     * output of the transcoding.
+     *
+     * @return a <tt>Time</tt> value which describes the duration of the content
+     * made available by this instance
      */
-    public Time getDuration()
+    public synchronized Time getDuration()
     {
         return
             (outputDataSource == null)
@@ -229,13 +248,13 @@
 
     /**
      * Gets the output streams that this instance provides. Some of them may be
-     * the result of transcoding the tracks of the input <tt>DataSource</tt>
-     * of this instance in the output <tt>Format</tt> of this instance.
+     * the result of transcoding the tracks of the input <tt>DataSource</tt> of
+     * this instance in the output <tt>Format</tt> of this instance.
      * 
      * @return an array of <tt>SourceStream</tt>s which represents the
      *         collection of output streams that this instance provides
      */
-    public SourceStream[] getStreams()
+    public synchronized SourceStream[] getStreams()
     {
         if (outputDataSource instanceof PushBufferDataSource)
             return ((PushBufferDataSource) outputDataSource).getStreams();
@@ -248,11 +267,13 @@
         return new SourceStream[0];
     }
 
-    /*
-     * Implements DataSource#start(). Starts the actual transcoding process
-     * already set up with #connect().
+    /**
+     * Implements {@link DataSource#start()}. Starts the actual transcoding
+     * process already set up with {@link #connect()}.
+     *
+     * @throws IOException if starting the transcoding fails
      */
-    public void start()
+    public synchronized void start()
         throws IOException
     {
         /*
@@ -264,11 +285,13 @@
         transcodingProcessor.start();
     }
 
-    /*
-     * Implements DataSource#stop(). Stops the actual transcoding process if it
-     * has already been set up with #connect().
+    /**
+     * Implements {@link DataSource#stop()}. Stops the actual transcoding
+     * process if it has already been set up with {@link #connect()}.
+     *
+     * @throws IOException if stopping the transcoding fails
      */
-    public void stop()
+    public synchronized void stop()
         throws IOException
     {
         if (outputDataSource != null)
