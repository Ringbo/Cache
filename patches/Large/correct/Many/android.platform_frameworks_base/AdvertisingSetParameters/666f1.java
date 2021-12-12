diff --git a/core/java/android/bluetooth/le/AdvertisingSetParameters.java b/core/java/android/bluetooth/le/AdvertisingSetParameters.java
index 31d8f48..71c4484 100644
--- a/core/java/android/bluetooth/le/AdvertisingSetParameters.java
+++ b/core/java/android/bluetooth/le/AdvertisingSetParameters.java
@@ -242,7 +242,7 @@
          * non-connectable.
          * Legacy advertisements can be both connectable and scannable. Non-legacy
          * advertisements can be only scannable or only connectable.
-         * @param connectable Controls whether the advertisment type will be
+         * @param connectable Controls whether the advertisement type will be
          * connectable (true) or non-connectable (false).
          */
         public Builder setConnectable(boolean connectable) {
@@ -254,7 +254,7 @@
          * Set whether the advertisement type should be scannable.
          * Legacy advertisements can be both connectable and scannable. Non-legacy
          * advertisements can be only scannable or only connectable.
-         * @param scannable Controls whether the advertisment type will be
+         * @param scannable Controls whether the advertisement type will be
          * scannable (true) or non-scannable (false).
          */
         public Builder setScannable(boolean scannable) {
@@ -386,6 +386,7 @@
 
         /**
          * Build the {@link AdvertisingSetParameters} object.
+         * @throws IllegalStateException if invalid combination of parameters is used.
          */
         public AdvertisingSetParameters build() {
             if (isLegacy) {
@@ -394,22 +395,22 @@
                 }
 
                 if (connectable == true && scannable == false) {
-                    throw new IllegalArgumentException(
+                    throw new IllegalStateException(
                         "Legacy advertisement can't be connectable and non-scannable");
                 }
 
                 if (includeTxPower) {
-                    throw new IllegalArgumentException(
+                    throw new IllegalStateException(
                         "Legacy advertising can't include TX power level in header");
                 }
             } else {
                 if (connectable && scannable) {
-                    throw new IllegalArgumentException(
+                    throw new IllegalStateException(
                         "Advertising can't be both connectable and scannable");
                 }
 
                 if (isAnonymous && connectable) {
-                    throw new IllegalArgumentException(
+                    throw new IllegalStateException(
                         "Advertising can't be both connectable and anonymous");
                 }
             }
