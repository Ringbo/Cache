diff --git a/src/android/ClickReceiver.java b/src/android/ClickReceiver.java
index 46cc487..404fd06 100644
--- a/src/android/ClickReceiver.java
+++ b/src/android/ClickReceiver.java
@@ -80,7 +80,7 @@
             return;
 
         try {
-            data.put("text", input.getString(action));
+            data.put("text", input.getCharSequence(action));
         } catch (JSONException e) {
             e.printStackTrace();
         }
