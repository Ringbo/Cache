diff --git a/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Pong.java b/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Pong.java
index a6d9841..58ed362 100644
--- a/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Pong.java
+++ b/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Pong.java
@@ -84,7 +84,7 @@
     public static void pingHandler(
         final Publication pongPublication, final DirectBuffer buffer, final int offset, final int length)
     {
-        if (pongPublication.offer(buffer, offset, length) < 0L)
+        if (pongPublication.offer(buffer, offset, length) > 0L)
         {
             return;
         }
