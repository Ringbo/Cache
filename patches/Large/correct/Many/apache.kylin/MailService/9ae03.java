diff --git a/core-common/src/main/java/org/apache/kylin/common/util/MailService.java b/core-common/src/main/java/org/apache/kylin/common/util/MailService.java
index 25bc03c..44e1d9c 100644
--- a/core-common/src/main/java/org/apache/kylin/common/util/MailService.java
+++ b/core-common/src/main/java/org/apache/kylin/common/util/MailService.java
@@ -93,7 +93,7 @@
         if (starttlsEnabled) {
             email.setSslSmtpPort(port);
         } else {
-            email.setSmtpPort(Integer.valueOf(port));
+            email.setSmtpPort(Integer.parseInt(port));
         }
         
         if (username != null && username.trim().length() > 0) {
