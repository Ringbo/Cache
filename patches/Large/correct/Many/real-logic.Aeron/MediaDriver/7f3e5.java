diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/MediaDriver.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/MediaDriver.java
index 538f48b..5555ced 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/MediaDriver.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/MediaDriver.java
@@ -554,7 +554,7 @@
                         {
                             if (!errorLog.record(throwable))
                             {
-                                System.err.println("Error Log is full, consider increasing " + ERROR_BUFFER_LENGTH);
+                                System.err.println("Error Log is full, consider increasing " + ERROR_BUFFER_LENGTH_PROP_NAME);
                                 throwable.printStackTrace();
                             }
                         };
