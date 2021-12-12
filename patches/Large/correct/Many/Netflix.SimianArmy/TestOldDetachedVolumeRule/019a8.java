diff --git a/src/test/java/com/netflix/simianarmy/aws/janitor/rule/volume/TestOldDetachedVolumeRule.java b/src/test/java/com/netflix/simianarmy/aws/janitor/rule/volume/TestOldDetachedVolumeRule.java
index e1130b0..2c292d9 100644
--- a/src/test/java/com/netflix/simianarmy/aws/janitor/rule/volume/TestOldDetachedVolumeRule.java
+++ b/src/test/java/com/netflix/simianarmy/aws/janitor/rule/volume/TestOldDetachedVolumeRule.java
@@ -95,7 +95,7 @@
                 .withLaunchTime(new Date(now.minusDays(ageThreshold + 1).getMillis()));
         ((AWSResource) resource).setAWSResourceState("available");
         int retentionDays = 4;
-        DateTime userDate = new DateTime(now.plusDays(3).toDateMidnight());
+        DateTime userDate = new DateTime(now.plusDays(3).withTimeAtStartOfDay());
         resource.setTag(JanitorMonkey.JANITOR_TAG,
                 OldDetachedVolumeRule.TERMINATION_DATE_FORMATTER.print(userDate));
         OldDetachedVolumeRule rule = new OldDetachedVolumeRule(new TestMonkeyCalendar(),
