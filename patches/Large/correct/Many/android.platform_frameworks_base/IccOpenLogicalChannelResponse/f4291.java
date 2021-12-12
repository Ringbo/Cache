diff --git a/telephony/java/android/telephony/IccOpenLogicalChannelResponse.java b/telephony/java/android/telephony/IccOpenLogicalChannelResponse.java
index bb5e277..e9db030 100644
--- a/telephony/java/android/telephony/IccOpenLogicalChannelResponse.java
+++ b/telephony/java/android/telephony/IccOpenLogicalChannelResponse.java
@@ -93,7 +93,7 @@
     public void writeToParcel(Parcel out, int flags) {
         out.writeInt(mChannel);
         out.writeInt(mStatus);
-        if (mSelectResponse != null & mSelectResponse.length > 0) {
+        if (mSelectResponse != null && mSelectResponse.length > 0) {
             out.writeInt(mSelectResponse.length);
             out.writeByteArray(mSelectResponse);
         } else {
