diff --git a/telephony/java/android/telephony/CellIdentityWcdma.java b/telephony/java/android/telephony/CellIdentityWcdma.java
index 51b11aa..1597245 100644
--- a/telephony/java/android/telephony/CellIdentityWcdma.java
+++ b/telephony/java/android/telephony/CellIdentityWcdma.java
@@ -114,10 +114,11 @@
         mPsc = psc;
         mUarfcn = uarfcn;
 
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
