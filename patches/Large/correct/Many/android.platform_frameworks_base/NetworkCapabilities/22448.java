diff --git a/core/java/android/net/NetworkCapabilities.java b/core/java/android/net/NetworkCapabilities.java
index 1a4765b..8e05cfa 100644
--- a/core/java/android/net/NetworkCapabilities.java
+++ b/core/java/android/net/NetworkCapabilities.java
@@ -892,7 +892,7 @@
      *
      * @hide
      */
-    private Set<UidRange> mUids = null;
+    private ArraySet<UidRange> mUids = null;
 
     /**
      * Convenience method to set the UIDs this network applies to to a single UID.
@@ -1178,7 +1178,7 @@
         dest.writeInt(mLinkDownBandwidthKbps);
         dest.writeParcelable((Parcelable) mNetworkSpecifier, flags);
         dest.writeInt(mSignalStrength);
-        dest.writeArraySet(new ArraySet<>(mUids));
+        dest.writeArraySet(mUids);
     }
 
     public static final Creator<NetworkCapabilities> CREATOR =
