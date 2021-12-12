diff --git a/telephony/java/android/telephony/CellIdentityWcdma.java b/telephony/java/android/telephony/CellIdentityWcdma.java
index e74b570..e4bb4f2 100644
--- a/telephony/java/android/telephony/CellIdentityWcdma.java
+++ b/telephony/java/android/telephony/CellIdentityWcdma.java
@@ -208,7 +208,7 @@
      * @return a 5 or 6 character string (MCC+MNC), null if any field is unknown
      */
     public String getMobileNetworkOperator() {
-        return (mMncStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
+        return (mMccStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
     }
 
     /**
