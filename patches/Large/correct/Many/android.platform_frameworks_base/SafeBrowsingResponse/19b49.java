diff --git a/core/java/android/webkit/SafeBrowsingResponse.java b/core/java/android/webkit/SafeBrowsingResponse.java
index dc29d42..3540f80 100644
--- a/core/java/android/webkit/SafeBrowsingResponse.java
+++ b/core/java/android/webkit/SafeBrowsingResponse.java
@@ -29,19 +29,19 @@
      *
      * @param allowReporting True if the interstitial should show a reporting checkbox.
      */
-    abstract void showInterstitial(boolean allowReporting);
+    public abstract void showInterstitial(boolean allowReporting);
 
     /**
      * Act as if the user clicked "visit this unsafe site."
      *
      * @param report True to enable Safe Browsing reporting.
      */
-    abstract void proceed(boolean report);
+    public abstract void proceed(boolean report);
 
     /**
      * Act as if the user clicked "back to safety."
      *
      * @param report True to enable Safe Browsing reporting.
      */
-    abstract void backToSafety(boolean report);
+    public abstract void backToSafety(boolean report);
 }
