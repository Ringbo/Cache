diff --git a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConsumer.java b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConsumer.java
index 99a206d..065a4ef 100644
--- a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConsumer.java
+++ b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConsumer.java
@@ -218,7 +218,7 @@
 
     private void peekMessage(Message mail) {
         // this only applies to IMAP messages which has a setPeek method
-        if (mail.getClass().getName().startsWith("IMAP")) {
+        if (mail.getClass().getSimpleName().startsWith("IMAP")) {
             try {
                 LOG.trace("Calling setPeek(true) on mail message {}", mail);
                 IntrospectionSupport.setProperty(mail, "peek", true);
