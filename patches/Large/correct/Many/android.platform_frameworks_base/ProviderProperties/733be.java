diff --git a/location/java/com/android/internal/location/ProviderProperties.java b/location/java/com/android/internal/location/ProviderProperties.java
index 08aed80..def96f0 100644
--- a/location/java/com/android/internal/location/ProviderProperties.java
+++ b/location/java/com/android/internal/location/ProviderProperties.java
@@ -145,7 +145,7 @@
         parcel.writeInt(mHasMonetaryCost ? 1 : 0);
         parcel.writeInt(mSupportsAltitude ? 1 : 0);
         parcel.writeInt(mSupportsSpeed ? 1 : 0);
-        parcel.writeInt(mSupportsSpeed ? 1 : 0);
+        parcel.writeInt(mSupportsBearing ? 1 : 0);
         parcel.writeInt(mPowerRequirement);
         parcel.writeInt(mAccuracy);
     }
