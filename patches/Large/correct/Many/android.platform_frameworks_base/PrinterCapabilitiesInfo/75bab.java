diff --git a/core/java/android/print/PrinterCapabilitiesInfo.java b/core/java/android/print/PrinterCapabilitiesInfo.java
index af41654..01c23f6 100644
--- a/core/java/android/print/PrinterCapabilitiesInfo.java
+++ b/core/java/android/print/PrinterCapabilitiesInfo.java
@@ -233,7 +233,7 @@
 
         mDuplexModes = parcel.readInt();
         enforceValidMask(mDuplexModes,
-                (currentMode) -> PrintAttributes.enforceValidColorMode(currentMode));
+                (currentMode) -> PrintAttributes.enforceValidDuplexMode(currentMode));
 
         readDefaults(parcel);
         Preconditions.checkArgument(mMediaSizes.size() > mDefaults[PROPERTY_MEDIA_SIZE]);
