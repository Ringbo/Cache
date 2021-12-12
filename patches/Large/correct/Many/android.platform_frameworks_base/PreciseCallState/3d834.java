diff --git a/telephony/java/android/telephony/PreciseCallState.java b/telephony/java/android/telephony/PreciseCallState.java
index 59f3e1f..19e1931 100644
--- a/telephony/java/android/telephony/PreciseCallState.java
+++ b/telephony/java/android/telephony/PreciseCallState.java
@@ -287,11 +287,11 @@
             return false;
         }
         PreciseCallState other = (PreciseCallState) obj;
-        return (mRingingCallState != other.mRingingCallState &&
-            mForegroundCallState != other.mForegroundCallState &&
-            mBackgroundCallState != other.mBackgroundCallState &&
-            mDisconnectCause != other.mDisconnectCause &&
-            mPreciseDisconnectCause != other.mPreciseDisconnectCause);
+        return (mRingingCallState == other.mRingingCallState
+                && mForegroundCallState == other.mForegroundCallState
+                && mBackgroundCallState == other.mBackgroundCallState
+                && mDisconnectCause == other.mDisconnectCause
+                && mPreciseDisconnectCause == other.mPreciseDisconnectCause);
     }
 
     @Override
