diff --git a/telephony/java/android/telephony/data/ApnSetting.java b/telephony/java/android/telephony/data/ApnSetting.java
index 5dc0cff..c2c93da 100644
--- a/telephony/java/android/telephony/data/ApnSetting.java
+++ b/telephony/java/android/telephony/data/ApnSetting.java
@@ -811,7 +811,7 @@
             version = 1;
         }
 
-        String[] a = data.split("\\s*,\\s*");
+        String[] a = data.split("\\s*,\\s*", -1);
         if (a.length < 14) {
             return null;
         }
