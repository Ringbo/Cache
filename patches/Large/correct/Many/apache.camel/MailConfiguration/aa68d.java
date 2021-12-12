diff --git a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConfiguration.java b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConfiguration.java
index 9e0ace6..60c7968 100644
--- a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConfiguration.java
+++ b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConfiguration.java
@@ -64,7 +64,7 @@
             setHost(value);
         }
 
-        if (getProtocol() != null && isIgnoreUriScheme()) {
+        if (getProtocol() != null && !isIgnoreUriScheme()) {
             String scheme = uri.getScheme();
             if (scheme != null) {
                 setProtocol(scheme);
