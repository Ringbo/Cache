diff --git a/library/src/main/java/com/dd/CircularProgressButton.java b/library/src/main/java/com/dd/CircularProgressButton.java
index 861f869..6c32c27 100644
--- a/library/src/main/java/com/dd/CircularProgressButton.java
+++ b/library/src/main/java/com/dd/CircularProgressButton.java
@@ -56,7 +56,7 @@
     }
 
     private int mMaxProgress;
-    private int mProgress;
+    private float mProgress;
 
     private boolean mMorphingInProgress;
 
@@ -533,7 +533,7 @@
         }
     }
 
-    public void setProgress(int progress) {
+    public void setProgress(float progress) {
         mProgress = progress;
 
         if (mMorphingInProgress || getWidth() == 0) {
@@ -571,7 +571,7 @@
         }
     }
 
-    public int getProgress() {
+    public float getProgress() {
         return mProgress;
     }
 
@@ -621,7 +621,7 @@
 
         private boolean mIndeterminateProgressMode;
         private boolean mConfigurationChanged;
-        private int mProgress;
+        private float mProgress;
 
         public SavedState(Parcelable parcel) {
             super(parcel);
@@ -637,7 +637,7 @@
         @Override
         public void writeToParcel(Parcel out, int flags) {
             super.writeToParcel(out, flags);
-            out.writeInt(mProgress);
+            out.writeFloat(mProgress);
             out.writeInt(mIndeterminateProgressMode ? 1 : 0);
             out.writeInt(mConfigurationChanged ? 1 : 0);
         }
