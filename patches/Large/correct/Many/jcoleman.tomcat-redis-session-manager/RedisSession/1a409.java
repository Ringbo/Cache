diff --git a/src/main/java/com/radiadesign/catalina/session/RedisSession.java b/src/main/java/com/radiadesign/catalina/session/RedisSession.java
index fde1fdf..2f5a297 100644
--- a/src/main/java/com/radiadesign/catalina/session/RedisSession.java
+++ b/src/main/java/com/radiadesign/catalina/session/RedisSession.java
@@ -14,13 +14,13 @@
 
   protected static Boolean manualDirtyTrackingSupportEnabled = false;
 
-  public void setManualDirtyTrackingSupportEnabled(Boolean enabled) {
+  public static void setManualDirtyTrackingSupportEnabled(Boolean enabled) {
     manualDirtyTrackingSupportEnabled = enabled;
   }
 
   protected static String manualDirtyTrackingAttributeKey = "__changed__";
 
-  public void setManualDirtyTrackingAttributeKey(String key) {
+  public static void setManualDirtyTrackingAttributeKey(String key) {
     manualDirtyTrackingAttributeKey = key;
   }
 
