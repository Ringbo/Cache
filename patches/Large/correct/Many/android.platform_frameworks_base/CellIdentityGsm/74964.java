diff --git a/telephony/java/android/telephony/CellIdentityGsm.java b/telephony/java/android/telephony/CellIdentityGsm.java
index c968406..376e6aa 100644
--- a/telephony/java/android/telephony/CellIdentityGsm.java
+++ b/telephony/java/android/telephony/CellIdentityGsm.java
@@ -202,7 +202,7 @@
      * @return a 5 or 6 character string (MCC+MNC), null if any field is unknown
      */
     public String getMobileNetworkOperator() {
-        return (mMncStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
+        return (mMccStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
     }
 
     /**
