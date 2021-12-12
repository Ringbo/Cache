diff --git a/core/java/android/content/IntentFilter.java b/core/java/android/content/IntentFilter.java
index 19329ce..3a17e23 100644
--- a/core/java/android/content/IntentFilter.java
+++ b/core/java/android/content/IntentFilter.java
@@ -1206,7 +1206,7 @@
      * {@link #MATCH_CATEGORY_PORT}, {@link #NO_MATCH_DATA}.
      */
     public final int matchDataAuthority(Uri data) {
-        if (mDataAuthorities == null) {
+        if (mDataAuthorities == null || data == null) {
             return NO_MATCH_DATA;
         }
         final int numDataAuthorities = mDataAuthorities.size();
@@ -1277,7 +1277,7 @@
             }
 
             final ArrayList<PatternMatcher> schemeSpecificParts = mDataSchemeSpecificParts;
-            if (schemeSpecificParts != null) {
+            if (schemeSpecificParts != null && data != null) {
                 match = hasDataSchemeSpecificPart(data.getSchemeSpecificPart())
                         ? MATCH_CATEGORY_SCHEME_SPECIFIC_PART : NO_MATCH_DATA;
             }
