diff --git a/aeron-client/src/main/java/io/aeron/Aeron.java b/aeron-client/src/main/java/io/aeron/Aeron.java
index 2d40c47..2a7a8bf 100644
--- a/aeron-client/src/main/java/io/aeron/Aeron.java
+++ b/aeron-client/src/main/java/io/aeron/Aeron.java
@@ -976,7 +976,7 @@
 
             while (true)
             {
-                while (!cncFile.exists())
+                while (!cncFile.exists() || cncFile.length() <= 0)
                 {
                     if (epochClock.time() > (startTimeMs + driverTimeoutMs()))
                     {
