diff --git a/src/java/org/jivesoftware/openfire/lockout/LockOutManager.java b/src/java/org/jivesoftware/openfire/lockout/LockOutManager.java
index 5b205b8..982b358 100644
--- a/src/java/org/jivesoftware/openfire/lockout/LockOutManager.java
+++ b/src/java/org/jivesoftware/openfire/lockout/LockOutManager.java
@@ -130,7 +130,7 @@
         if (username == null) {
             throw new UnsupportedOperationException("Null username not allowed!");
         }
-        if (!provider.shouldNotBeCached()) {
+        if (provider.shouldNotBeCached()) {
             return provider.getDisabledStatus(username);
         }
         LockOutFlag flag = lockOutCache.get(username);
