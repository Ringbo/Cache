diff --git a/src/com/ichi2/anki/Utils.java b/src/com/ichi2/anki/Utils.java
index e6edd2e..57641b2 100644
--- a/src/com/ichi2/anki/Utils.java
+++ b/src/com/ichi2/anki/Utils.java
@@ -522,7 +522,7 @@
         BufferedWriter buff;
         try {
             buff = writeToFile ?  
-                    new BufferedWriter(new FileWriter("/sdcard/payloadAndroid.txt", true), 8192) : null;
+                    new BufferedWriter(new FileWriter("/sdcard/payloadAndroid.txt"), 8192) : null;
             try {
                 printJSONObject(jsonObject, "-", buff);
             } finally {
