diff --git a/core/java/android/content/RestrictionEntry.java b/core/java/android/content/RestrictionEntry.java
index ab049ec..0473475 100644
--- a/core/java/android/content/RestrictionEntry.java
+++ b/core/java/android/content/RestrictionEntry.java
@@ -456,7 +456,7 @@
         if (o == this) return true;
         if (!(o instanceof RestrictionEntry)) return false;
         final RestrictionEntry other = (RestrictionEntry) o;
-        if (mType != other.mType || mKey.equals(other.mKey)) {
+        if (mType != other.mType || !mKey.equals(other.mKey)) {
             return false;
         }
         if (mCurrentValues == null && other.mCurrentValues == null
