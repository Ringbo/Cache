diff --git a/core/java/android/net/NetworkCapabilities.java b/core/java/android/net/NetworkCapabilities.java
index 8a5f43d..c41a56c 100644
--- a/core/java/android/net/NetworkCapabilities.java
+++ b/core/java/android/net/NetworkCapabilities.java
@@ -1467,7 +1467,7 @@
             appendStringRepresentationOfBitMaskToStringBuilder(sb, mNetworkCapabilities,
                     NetworkCapabilities::capabilityNameOf, "&");
         }
-        if (0 != mNetworkCapabilities) {
+        if (0 != mUnwantedNetworkCapabilities) {
             sb.append(" Unwanted: ");
             appendStringRepresentationOfBitMaskToStringBuilder(sb, mUnwantedNetworkCapabilities,
                     NetworkCapabilities::capabilityNameOf, "&");
