diff --git a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
index 7f6c825..42985e0 100644
--- a/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
+++ b/src/main/java/com/zaxxer/hikari/util/ConcurrentBag.java
@@ -115,7 +115,7 @@
 
          for (int i = list.size() - 1; i >= 0; i--) {
             final T bagEntry = (T) (weakThreadLocals ? ((WeakReference) list.remove(i)).get() : list.remove(i));
-            if (bagEntry != null & bagEntry.state().compareAndSet(STATE_NOT_IN_USE, STATE_IN_USE)) {
+            if (bagEntry != null && bagEntry.state().compareAndSet(STATE_NOT_IN_USE, STATE_IN_USE)) {
                return bagEntry;
             }
          }
