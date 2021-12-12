diff --git a/services/core/java/com/android/server/job/JobStore.java b/services/core/java/com/android/server/job/JobStore.java
index 35628a2..c6913d3 100644
--- a/services/core/java/com/android/server/job/JobStore.java
+++ b/services/core/java/com/android/server/job/JobStore.java
@@ -593,7 +593,7 @@
             if (XML_TAG_PERIODIC.equals(parser.getName())) {
                 try {
                     String val = parser.getAttributeValue(null, "period");
-                    final long periodMillis = Long.valueOf(val);
+                    final long periodMillis = Long.parseLong(val);
                     val = parser.getAttributeValue(null, "flex");
                     final long flexMillis = (val != null) ? Long.valueOf(val) : periodMillis;
                     jobBuilder.setPeriodic(periodMillis, flexMillis);
@@ -718,7 +718,7 @@
         private void maybeBuildBackoffPolicyFromXml(JobInfo.Builder jobBuilder, XmlPullParser parser) {
             String val = parser.getAttributeValue(null, "initial-backoff");
             if (val != null) {
-                long initialBackoff = Long.valueOf(val);
+                long initialBackoff = Long.parseLong(val);
                 val = parser.getAttributeValue(null, "backoff-policy");
                 int backoffPolicy = Integer.parseInt(val);  // Will throw NFE which we catch higher up.
                 jobBuilder.setBackoffCriteria(initialBackoff, backoffPolicy);
@@ -741,14 +741,14 @@
             long latestRunTimeElapsed = JobStatus.NO_LATEST_RUNTIME;
             String val = parser.getAttributeValue(null, "deadline");
             if (val != null) {
-                long latestRuntimeWallclock = Long.valueOf(val);
+                long latestRuntimeWallclock = Long.parseLong(val);
                 long maxDelayElapsed =
                         Math.max(latestRuntimeWallclock - nowWallclock, 0);
                 latestRunTimeElapsed = nowElapsed + maxDelayElapsed;
             }
             val = parser.getAttributeValue(null, "delay");
             if (val != null) {
-                long earliestRuntimeWallclock = Long.valueOf(val);
+                long earliestRuntimeWallclock = Long.parseLong(val);
                 long minDelayElapsed =
                         Math.max(earliestRuntimeWallclock - nowWallclock, 0);
                 earliestRunTimeElapsed = nowElapsed + minDelayElapsed;
