diff --git a/media/java/android/media/tv/TvContract.java b/media/java/android/media/tv/TvContract.java
index 8a2ee8e..7d189e4 100644
--- a/media/java/android/media/tv/TvContract.java
+++ b/media/java/android/media/tv/TvContract.java
@@ -128,12 +128,12 @@
     }
 
     /**
-     * Builds a URI that points to all browsable channels from a given TV input.
+     * Builds a URI that points to all channels from a given TV input.
      *
      * @param inputId The ID of the TV input to build a channels URI for.
      */
     public static final Uri buildChannelsUriForInput(String inputId) {
-        return buildChannelsUriForInput(inputId, true);
+        return buildChannelsUriForInput(inputId, false);
     }
 
     /**
@@ -143,6 +143,7 @@
      * @param browsableOnly If set to {@code true} the URI points to only browsable channels. If set
      *            to {@code false} the URI points to all channels regardless of whether they are
      *            browsable or not.
+     * @hide
      */
     public static final Uri buildChannelsUriForInput(String inputId, boolean browsableOnly) {
         return new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY)
@@ -656,6 +657,7 @@
          * </p><p>
          * Type: INTEGER (boolean)
          * </p>
+         * @hide
          */
         public static final String COLUMN_BROWSABLE = "browsable";
 
