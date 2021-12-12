diff --git a/stetho/src/main/java/com/facebook/stetho/inspector/elements/android/TextViewDescriptor.java b/stetho/src/main/java/com/facebook/stetho/inspector/elements/android/TextViewDescriptor.java
index 1390f58..f0e3c0d 100644
--- a/stetho/src/main/java/com/facebook/stetho/inspector/elements/android/TextViewDescriptor.java
+++ b/stetho/src/main/java/com/facebook/stetho/inspector/elements/android/TextViewDescriptor.java
@@ -42,7 +42,7 @@
   @Override
   protected void onGetAttributes(TextView element, AttributeAccumulator attributes) {
     CharSequence text = element.getText();
-    if (text.length() != 0) {
+    if (text != null && text.length() != 0) {
       attributes.store(TEXT_ATTRIBUTE_NAME, text.toString());
     }
   }
