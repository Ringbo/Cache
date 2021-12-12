diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/ChatActivity.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/ChatActivity.java
index 0ed6166..5c2fb39 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/ChatActivity.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/ChatActivity.java
@@ -745,7 +745,7 @@
         bindGlobalCounter(new ValueChangedListener<Integer>() {
             @Override
             public void onChanged(Integer val, Value<Integer> valueModel) {
-                if (val > 0) {
+                if (val != null && val > 0) {
                     counter.setText(Integer.toString(val));
                     showView(counter);
                 } else {
