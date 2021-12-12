diff --git a/aeron-driver/src/main/java/io/aeron/driver/MediaDriver.java b/aeron-driver/src/main/java/io/aeron/driver/MediaDriver.java
index b52df65..1a6d8a6 100644
--- a/aeron-driver/src/main/java/io/aeron/driver/MediaDriver.java
+++ b/aeron-driver/src/main/java/io/aeron/driver/MediaDriver.java
@@ -538,7 +538,7 @@
                             if (!errorLog.record(throwable))
                             {
                                 System.err.println("Error Log is full, consider increasing " + ERROR_BUFFER_LENGTH_PROP_NAME);
-                                throwable.printStackTrace();
+                                throwable.printStackTrace(System.err);
                             }
                         };
                 }
