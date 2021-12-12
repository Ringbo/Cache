diff --git a/src/test/java/com/netflix/simianarmy/aws/janitor/rule/snapshot/TestNoGeneratedAMIRule.java b/src/test/java/com/netflix/simianarmy/aws/janitor/rule/snapshot/TestNoGeneratedAMIRule.java
index d8dbeac..0556c99 100644
--- a/src/test/java/com/netflix/simianarmy/aws/janitor/rule/snapshot/TestNoGeneratedAMIRule.java
+++ b/src/test/java/com/netflix/simianarmy/aws/janitor/rule/snapshot/TestNoGeneratedAMIRule.java
@@ -77,7 +77,7 @@
                 .withLaunchTime(new Date(now.minusDays(ageThreshold + 1).getMillis()));
         ((AWSResource) resource).setAWSResourceState("completed");
         int retentionDays = 4;
-        DateTime userDate = new DateTime(now.plusDays(3).toDateMidnight());
+        DateTime userDate = new DateTime(now.plusDays(3).withTimeAtStartOfDay());
         resource.setTag(JanitorMonkey.JANITOR_TAG,
                 NoGeneratedAMIRule.TERMINATION_DATE_FORMATTER.print(userDate));
         NoGeneratedAMIRule rule = new NoGeneratedAMIRule(new TestMonkeyCalendar(),
