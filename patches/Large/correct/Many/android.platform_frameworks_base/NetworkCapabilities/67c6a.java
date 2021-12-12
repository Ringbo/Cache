diff --git a/core/java/android/net/NetworkCapabilities.java b/core/java/android/net/NetworkCapabilities.java
index 0bdfca7..40ef116c 100644
--- a/core/java/android/net/NetworkCapabilities.java
+++ b/core/java/android/net/NetworkCapabilities.java
@@ -1421,7 +1421,7 @@
             appendStringRepresentationOfBitMaskToStringBuilder(sb, mNetworkCapabilities,
                     NetworkCapabilities::capabilityNameOf, "&");
         }
-        if (0 != mNetworkCapabilities) {
+        if (0 != mUnwantedNetworkCapabilities) {
             sb.append(" Unwanted: ");
             appendStringRepresentationOfBitMaskToStringBuilder(sb, mUnwantedNetworkCapabilities,
                     NetworkCapabilities::capabilityNameOf, "&");
