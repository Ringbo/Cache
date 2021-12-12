diff --git a/telephony/java/android/telephony/CellIdentityLte.java b/telephony/java/android/telephony/CellIdentityLte.java
index 825dcc3..6ca5daf6 100644
--- a/telephony/java/android/telephony/CellIdentityLte.java
+++ b/telephony/java/android/telephony/CellIdentityLte.java
@@ -213,7 +213,7 @@
      * @return a 5 or 6 character string (MCC+MNC), null if any field is unknown
      */
     public String getMobileNetworkOperator() {
-        return (mMncStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
+        return (mMccStr == null || mMncStr == null) ? null : mMccStr + mMncStr;
     }
 
     /**
