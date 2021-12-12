diff --git a/src/java/org/apache/cassandra/config/DatabaseDescriptor.java b/src/java/org/apache/cassandra/config/DatabaseDescriptor.java
index 97c868e..4ce2728 100644
--- a/src/java/org/apache/cassandra/config/DatabaseDescriptor.java
+++ b/src/java/org/apache/cassandra/config/DatabaseDescriptor.java
@@ -484,7 +484,7 @@
             try
             {
                 // use 1/8th of available space.  See discussion on #10013 and #10199 on the CL, taking half that for CDC
-                minSize = Ints.checkedCast((guessFileStore(conf.cdc_raw_directory).getTotalSpace() / 1048576) / 8);
+                minSize = Ints.saturatedCast((guessFileStore(conf.cdc_raw_directory).getTotalSpace() / 1048576) / 8);
             }
             catch (IOException e)
             {
