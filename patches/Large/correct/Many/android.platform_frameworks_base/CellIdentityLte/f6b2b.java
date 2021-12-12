diff --git a/telephony/java/android/telephony/CellIdentityLte.java b/telephony/java/android/telephony/CellIdentityLte.java
index 74d2966..fd837fc 100644
--- a/telephony/java/android/telephony/CellIdentityLte.java
+++ b/telephony/java/android/telephony/CellIdentityLte.java
@@ -114,10 +114,11 @@
         mTac = tac;
         mEarfcn = earfcn;
 
+        // Only allow INT_MAX if unknown string mcc/mnc
         if (mccStr == null || mccStr.matches("^[0-9]{3}$")) {
             mMccStr = mccStr;
-        } else if (mccStr.isEmpty()) {
-            // If the mccStr parsed from Parcel is empty, set it as null.
+        } else if (mccStr.isEmpty() || mccStr.equals(String.valueOf(Integer.MAX_VALUE))) {
+            // If the mccStr is empty or unknown, set it as null.
             mMccStr = null;
         } else {
             throw new IllegalArgumentException("invalid MCC format");
@@ -125,8 +126,8 @@
 
         if (mncStr == null || mncStr.matches("^[0-9]{2,3}$")) {
             mMncStr = mncStr;
-        } else if (mncStr.isEmpty()) {
-            // If the mncStr parsed from Parcel is empty, set it as null.
+        } else if (mncStr.isEmpty() || mncStr.equals(String.valueOf(Integer.MAX_VALUE))) {
+            // If the mncStr is empty or unknown, set it as null.
             mMncStr = null;
         } else {
             throw new IllegalArgumentException("invalid MNC format");
