diff --git a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/io/CommunicationsManager.java b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/io/CommunicationsManager.java
index 21834ec..2cf6893 100644
--- a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/io/CommunicationsManager.java
+++ b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/io/CommunicationsManager.java
@@ -95,7 +95,7 @@
                          final String subject, final String to,
                          final String cc, final String bcc) {
         try {
-            if (isMailSenderDefined() || StringUtils.isBlank(text) || StringUtils.isBlank(from)
+            if (!isMailSenderDefined() || StringUtils.isBlank(text) || StringUtils.isBlank(from)
                     || StringUtils.isBlank(subject) || StringUtils.isBlank(to)) {
                 LOGGER.warn("Could not send email to [{}] because either no address/subject/text is found or email settings are not configured.", to);
                 return false;
