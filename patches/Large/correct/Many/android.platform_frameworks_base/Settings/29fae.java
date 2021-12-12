diff --git a/services/core/java/com/android/server/pm/Settings.java b/services/core/java/com/android/server/pm/Settings.java
index bb92611..69aeae6 100644
--- a/services/core/java/com/android/server/pm/Settings.java
+++ b/services/core/java/com/android/server/pm/Settings.java
@@ -1944,7 +1944,8 @@
                     // TODO: check whether this is okay! as it is very
                     // similar to how preferred-activities are treated
                     readPersistentPreferredActivitiesLPw(parser, 0);
-                } else if (tagName.equals(TAG_FORWARDING_INTENT_FILTERS)) {
+                } else if (tagName.equals(TAG_FORWARDING_INTENT_FILTERS)
+                        || tagName.equals(TAG_CROSS_PROFILE_INTENT_FILTERS)) {
                     // TODO: check whether this is okay! as it is very
                     // similar to how preferred-activities are treated
                     readCrossProfileIntentFiltersLPw(parser, 0);
