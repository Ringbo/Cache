diff --git a/core/java/android/view/InputEvent.java b/core/java/android/view/InputEvent.java
index 9afd16e..184e0fc 100755
--- a/core/java/android/view/InputEvent.java
+++ b/core/java/android/view/InputEvent.java
@@ -23,7 +23,9 @@
  * Common base class for input events.
  */
 public abstract class InputEvent implements Parcelable {
+    /** @hide */
     protected int mDeviceId;
+    /** @hide */
     protected int mSource;
     
     /** @hide */
@@ -76,7 +78,7 @@
         mSource = source;
     }
     
-    public final int describeContents() {
+    public int describeContents() {
         return 0;
     }
     
