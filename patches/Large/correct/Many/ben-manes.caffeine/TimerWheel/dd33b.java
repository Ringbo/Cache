diff --git a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/TimerWheel.java b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/TimerWheel.java
index 68402eb..79c0494 100644
--- a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/TimerWheel.java
+++ b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/TimerWheel.java
@@ -125,7 +125,7 @@
     Node<K, V>[] timerWheel = wheel[index];
 
     int start, end;
-    if ((currentTimeNanos - previousTimeNanos) > SPANS[index + 1]) {
+    if ((currentTimeNanos - previousTimeNanos) >= SPANS[index + 1]) {
       end = timerWheel.length;
       start = 0;
     } else {
