diff --git a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
index 211bc92..c6a9b2f 100644
--- a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
+++ b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
@@ -215,7 +215,7 @@
       sharedList.add(bagEntry);
 
       // spin until a thread takes it or none are waiting
-      while (waiters.get() > 0 && bagEntry.getState() != STATE_NOT_IN_USE && !handoffQueue.offer(bagEntry)) {
+      while (waiters.get() > 0 && bagEntry.getState() == STATE_NOT_IN_USE && !handoffQueue.offer(bagEntry)) {
          yield();
       }
    }
