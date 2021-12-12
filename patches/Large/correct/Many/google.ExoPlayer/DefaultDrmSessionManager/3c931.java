diff --git a/library/core/src/main/java/com/google/android/exoplayer2/drm/DefaultDrmSessionManager.java b/library/core/src/main/java/com/google/android/exoplayer2/drm/DefaultDrmSessionManager.java
index 42e0e20..66c9e5c 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/drm/DefaultDrmSessionManager.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/drm/DefaultDrmSessionManager.java
@@ -491,8 +491,9 @@
       return true;
     } else if (C.CENC_TYPE_cbc1.equals(schemeType) || C.CENC_TYPE_cbcs.equals(schemeType)
         || C.CENC_TYPE_cens.equals(schemeType)) {
-      // AES-CBC and pattern encryption are supported on API 24 onwards.
-      return Util.SDK_INT >= 24;
+      // API support for AES-CBC and pattern encryption was added in API 24. However, the
+      // implementation was not stable until API 25.
+      return Util.SDK_INT >= 25;
     }
     // Unknown schemes, assume one of them is supported.
     return true;
