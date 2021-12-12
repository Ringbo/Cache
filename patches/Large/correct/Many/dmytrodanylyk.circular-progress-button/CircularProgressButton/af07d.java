diff --git a/library/src/main/java/com/dd/CircularProgressButton.java b/library/src/main/java/com/dd/CircularProgressButton.java
index 3d1dd3d..ca605ee 100644
--- a/library/src/main/java/com/dd/CircularProgressButton.java
+++ b/library/src/main/java/com/dd/CircularProgressButton.java
@@ -59,7 +59,7 @@
     }
 
     private int mMaxProgress;
-    private float mProgress;
+    private int mProgress;
 
     private boolean mMorphingInProgress;
 
@@ -537,7 +537,7 @@
         }
     }
 
-    public void setProgress(float progress) {
+    public void setProgress(int progress) {
         mProgress = progress;
 
         if (mMorphingInProgress || getWidth() == 0) {
@@ -575,7 +575,7 @@
         }
     }
 
-    public float getProgress() {
+    public int getProgress() {
         return mProgress;
     }
 
@@ -649,7 +649,7 @@
 
         private boolean mIndeterminateProgressMode;
         private boolean mConfigurationChanged;
-        private float mProgress;
+        private int mProgress;
 
         public SavedState(Parcelable parcel) {
             super(parcel);
@@ -665,7 +665,7 @@
         @Override
         public void writeToParcel(Parcel out, int flags) {
             super.writeToParcel(out, flags);
-            out.writeFloat(mProgress);
+            out.writeInt(mProgress);
             out.writeInt(mIndeterminateProgressMode ? 1 : 0);
             out.writeInt(mConfigurationChanged ? 1 : 0);
         }
