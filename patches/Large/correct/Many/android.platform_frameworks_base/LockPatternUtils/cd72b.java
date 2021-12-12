diff --git a/core/java/com/android/internal/widget/LockPatternUtils.java b/core/java/com/android/internal/widget/LockPatternUtils.java
index 82ae2f3..60380fb 100644
--- a/core/java/com/android/internal/widget/LockPatternUtils.java
+++ b/core/java/com/android/internal/widget/LockPatternUtils.java
@@ -1074,7 +1074,7 @@
         long deadline = getLong(LOCKOUT_ATTEMPT_DEADLINE, 0L, userId);
         final long timeoutMs = getLong(LOCKOUT_ATTEMPT_TIMEOUT_MS, 0L, userId);
         final long now = SystemClock.elapsedRealtime();
-        if (deadline < now) {
+        if (deadline < now && deadline != 0) {
             // timeout expired
             setLong(LOCKOUT_ATTEMPT_DEADLINE, 0, userId);
             setLong(LOCKOUT_ATTEMPT_TIMEOUT_MS, 0, userId);
