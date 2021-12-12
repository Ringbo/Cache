diff --git a/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java b/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
index 109eede..fd71a6e 100644
--- a/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
+++ b/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
@@ -197,7 +197,7 @@
   }
 
   private void startSettingsActivity() {
-    final Intent intent = new Intent(this, SettingsActivity.class)
+    final Intent intent = new Intent(this, SettingsNewActivity.class)
       .putExtra(IntentKey.LOGIN_REASON, LoginReason.DEFAULT);
     startActivity(intent);
   }
