diff --git a/telephony/java/com/android/internal/telephony/DcParamObject.java b/telephony/java/com/android/internal/telephony/DcParamObject.java
index 139939c..fc6b610 100644
--- a/telephony/java/com/android/internal/telephony/DcParamObject.java
+++ b/telephony/java/com/android/internal/telephony/DcParamObject.java
@@ -36,7 +36,7 @@
     }
 
     public void writeToParcel(Parcel dest, int flags) {
-        dest.writeLong(mSubId);
+        dest.writeInt(mSubId);
     }
 
     private void readFromParcel(Parcel in) {
