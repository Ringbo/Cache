diff --git a/services/core/java/com/android/server/broadcastradio/hal2/TunerSession.java b/services/core/java/com/android/server/broadcastradio/hal2/TunerSession.java
index 8ed646a..0efa09a 100644
--- a/services/core/java/com/android/server/broadcastradio/hal2/TunerSession.java
+++ b/services/core/java/com/android/server/broadcastradio/hal2/TunerSession.java
@@ -212,7 +212,7 @@
             MutableInt halResult = new MutableInt(Result.UNKNOWN_ERROR);
             MutableBoolean flagState = new MutableBoolean(false);
             try {
-                mHwSession.getConfigFlag(flag, (int result, boolean value) -> {
+                mHwSession.isConfigFlagSet(flag, (int result, boolean value) -> {
                     halResult.value = result;
                     flagState.value = value;
                 });
