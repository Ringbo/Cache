diff --git a/core/java/android/pim/vcard/VCardComposer.java b/core/java/android/pim/vcard/VCardComposer.java
index 33581c9..6476e40 100644
--- a/core/java/android/pim/vcard/VCardComposer.java
+++ b/core/java/android/pim/vcard/VCardComposer.java
@@ -1490,7 +1490,7 @@
             return;
         }
 
-        for (int i = 0; i < Constants.MAX_DATA_COLUMN; i++) {
+        for (int i = 1; i <= Constants.MAX_DATA_COLUMN; i++) {
             String value = contentValues.getAsString("data" + i);
             if (value == null) {
                 value = "";
