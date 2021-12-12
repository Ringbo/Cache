diff --git a/core/java/com/android/internal/util/WakeupMessage.java b/core/java/com/android/internal/util/WakeupMessage.java
index 7d222c7..46098c5 100644
--- a/core/java/com/android/internal/util/WakeupMessage.java
+++ b/core/java/com/android/internal/util/WakeupMessage.java
@@ -108,7 +108,7 @@
         }
         if (stillScheduled) {
             Message msg = mHandler.obtainMessage(mCmd, mArg1, mArg2, mObj);
-            mHandler.handleMessage(msg);
+            mHandler.dispatchMessage(msg);
             msg.recycle();
         }
     }
