diff --git a/core/java/android/view/accessibility/AccessibilityNodeInfo.java b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
index ad87fcb..d9c9b69 100644
--- a/core/java/android/view/accessibility/AccessibilityNodeInfo.java
+++ b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
@@ -473,7 +473,7 @@
     private CharSequence mClassName;
     private CharSequence mText;
     private CharSequence mContentDescription;
-    private CharSequence mViewIdResourceName;
+    private String mViewIdResourceName;
 
     private final SparseLongArray mChildNodeIds = new SparseLongArray();
     private int mActions;
@@ -1541,7 +1541,7 @@
      *
      * @param viewIdResName The id resource name.
      */
-    public void setViewIdResourceName(CharSequence viewIdResName) {
+    public void setViewIdResourceName(String viewIdResName) {
         enforceNotSealed();
         mViewIdResourceName = viewIdResName;
     }
@@ -1558,7 +1558,7 @@
 
      * @return The id resource name.
      */
-    public CharSequence getViewIdResourceName() {
+    public String getViewIdResourceName() {
         return mViewIdResourceName;
     }
 
@@ -1841,7 +1841,7 @@
         parcel.writeCharSequence(mClassName);
         parcel.writeCharSequence(mText);
         parcel.writeCharSequence(mContentDescription);
-        parcel.writeCharSequence(mViewIdResourceName);
+        parcel.writeString(mViewIdResourceName);
 
         parcel.writeInt(mTextSelectionStart);
         parcel.writeInt(mTextSelectionEnd);
@@ -1923,7 +1923,7 @@
         mClassName = parcel.readCharSequence();
         mText = parcel.readCharSequence();
         mContentDescription = parcel.readCharSequence();
-        mViewIdResourceName = parcel.readCharSequence();
+        mViewIdResourceName = parcel.readString();
 
         mTextSelectionStart = parcel.readInt();
         mTextSelectionEnd = parcel.readInt();
