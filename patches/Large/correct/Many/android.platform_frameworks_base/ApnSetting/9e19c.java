diff --git a/telephony/java/com/android/internal/telephony/ApnSetting.java b/telephony/java/com/android/internal/telephony/ApnSetting.java
index 980bb49..ad69fdb 100755
--- a/telephony/java/com/android/internal/telephony/ApnSetting.java
+++ b/telephony/java/com/android/internal/telephony/ApnSetting.java
@@ -181,9 +181,10 @@
     public boolean canHandleType(String type) {
         for (String t : types) {
             // DEFAULT handles all, and HIPRI is handled by DEFAULT
-            if (t.equals(type) || t.equals(Phone.APN_TYPE_ALL) ||
-                    (t.equals(Phone.APN_TYPE_DEFAULT) &&
-                    type.equals(Phone.APN_TYPE_HIPRI))) {
+            if (t.equalsIgnoreCase(type) ||
+                    t.equalsIgnoreCase(Phone.APN_TYPE_ALL) ||
+                    (t.equalsIgnoreCase(Phone.APN_TYPE_DEFAULT) &&
+                    type.equalsIgnoreCase(Phone.APN_TYPE_HIPRI))) {
                 return true;
             }
         }
