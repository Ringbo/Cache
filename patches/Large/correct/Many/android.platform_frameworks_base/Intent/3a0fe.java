diff --git a/core/java/android/content/Intent.java b/core/java/android/content/Intent.java
index 2b60770..bc62b9e 100644
--- a/core/java/android/content/Intent.java
+++ b/core/java/android/content/Intent.java
@@ -9062,7 +9062,7 @@
      * @param extras The new set of extras in the Intent, or null to erase
      * all extras.
      */
-    public @NonNull Intent replaceExtras(@NonNull Bundle extras) {
+    public @NonNull Intent replaceExtras(@Nullable Bundle extras) {
         mExtras = extras != null ? new Bundle(extras) : null;
         return this;
     }
