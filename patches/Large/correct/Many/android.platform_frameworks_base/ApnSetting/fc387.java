diff --git a/telephony/java/android/telephony/data/ApnSetting.java b/telephony/java/android/telephony/data/ApnSetting.java
index 9388ed1..0e4a7ad 100644
--- a/telephony/java/android/telephony/data/ApnSetting.java
+++ b/telephony/java/android/telephony/data/ApnSetting.java
@@ -810,7 +810,7 @@
             version = 1;
         }
 
-        String[] a = data.split("\\s*,\\s*");
+        String[] a = data.split("\\s*,\\s*", -1);
         if (a.length < 14) {
             return null;
         }
