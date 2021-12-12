diff --git a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
index d195b67..9822563 100755
--- a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
+++ b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
@@ -186,7 +186,7 @@
          if (bagEntry.getState() != STATE_NOT_IN_USE || handoffQueue.offer(bagEntry)) {
             return;
          }
-         else if ((i & 0x100) == 0x100) {
+         else if ((i & 0xff) == 0xff) {
             parkNanos(MICROSECONDS.toNanos(10));
          }
          else {
