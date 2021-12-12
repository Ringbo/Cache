diff --git a/aeron-driver/src/test/java/io/aeron/driver/DriverConductorTest.java b/aeron-driver/src/test/java/io/aeron/driver/DriverConductorTest.java
index 9939a61..0dbc4b2 100644
--- a/aeron-driver/src/test/java/io/aeron/driver/DriverConductorTest.java
+++ b/aeron-driver/src/test/java/io/aeron/driver/DriverConductorTest.java
@@ -110,9 +110,9 @@
         // System GC required in order to ensure that the direct byte buffers get cleaned and avoid OOM.
         System.gc();
 
-        when(mockRawLogFactory.newNetworkPublication(anyString(), anyInt(), anyInt(), anyInt(), anyInt()))
+        when(mockRawLogFactory.newNetworkPublication(anyString(), anyInt(), anyInt(), anyLong(), anyInt()))
             .thenReturn(LogBufferHelper.newTestLogBuffers(TERM_BUFFER_LENGTH));
-        when(mockRawLogFactory.newNetworkedImage(anyString(), anyInt(), anyInt(), anyInt(), eq(TERM_BUFFER_LENGTH)))
+        when(mockRawLogFactory.newNetworkedImage(anyString(), anyInt(), anyInt(), anyLong(), eq(TERM_BUFFER_LENGTH)))
             .thenReturn(LogBufferHelper.newTestLogBuffers(TERM_BUFFER_LENGTH));
         when(mockRawLogFactory.newDirectPublication(anyInt(), anyInt(), anyLong(), anyInt()))
             .thenReturn(LogBufferHelper.newTestLogBuffers(TERM_BUFFER_LENGTH));
