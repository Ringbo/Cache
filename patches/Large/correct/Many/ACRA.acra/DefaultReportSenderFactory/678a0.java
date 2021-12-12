diff --git a/src/main/java/org/acra/sender/DefaultReportSenderFactory.java b/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
index 1bfae9d..a5dad5c 100644
--- a/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
+++ b/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
@@ -37,7 +37,7 @@
             return new NullSender();
         } else if (config.formUri() != null && !"".equals(config.formUri())) {
             // If formUri is set, instantiate a sender for a generic HTTP POST form with default mapping.
-            ACRA.log.w(LOG_TAG, context.getPackageName() + " reports will be sent by Http.");
+            ACRA.log.i(LOG_TAG, context.getPackageName() + " reports will be sent by Http.");
             return new HttpSenderFactory().create(context, config);
         } else {
             return new NullSender();
