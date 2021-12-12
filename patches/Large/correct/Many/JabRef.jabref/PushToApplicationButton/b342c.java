diff --git a/src/main/java/net/sf/jabref/external/push/PushToApplicationButton.java b/src/main/java/net/sf/jabref/external/push/PushToApplicationButton.java
index 9ffd5f4..4d4e327 100644
--- a/src/main/java/net/sf/jabref/external/push/PushToApplicationButton.java
+++ b/src/main/java/net/sf/jabref/external/push/PushToApplicationButton.java
@@ -284,7 +284,7 @@
         }
 
         public void setTitle(String appName) {
-            putValue(Action.NAME, Localization.lang("Push entries to external application (%0)", appName));
+            putValue(Action.NAME, Localization.menuTitle("Push entries to external application (%0)", appName));
         }
 
         @Override
