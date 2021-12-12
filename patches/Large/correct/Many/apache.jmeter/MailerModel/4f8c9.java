diff --git a/src/components/org/apache/jmeter/reporters/MailerModel.java b/src/components/org/apache/jmeter/reporters/MailerModel.java
index 7045c8c..7a34f15 100644
--- a/src/components/org/apache/jmeter/reporters/MailerModel.java
+++ b/src/components/org/apache/jmeter/reporters/MailerModel.java
@@ -231,7 +231,9 @@
 
                 try {
                     sendMail(getFromAddress(), addressList, getSuccessSubject(), "URL Restarted: "
-                            + sample.getSampleLabel(), getSmtpHost());
+                            + sample.getSampleLabel(), getSmtpHost(),
+                            getSmtpPort(), getLogin(), getPassword(),
+                            getMailAuthType());
                 } catch (Exception e) {
                     log.error("Problem sending mail", e);
                 }
@@ -314,6 +316,12 @@
      *            the message-body.
      * @param smtpHost
      *            the smtp-server used to send the mail.
+     * @param smtpPort the smtp-server port used to send the mail.
+     * @param user the login used to authenticate
+     * @param password the password used to authenticate
+     * @param mailAuthType {@link MailAuthType} Security policy
+     * @throws AddressException
+     * @throws MessagingException
      */
     public void sendMail(String from, List<String> vEmails, String subject,
             String attText, String smtpHost, 
@@ -381,6 +389,11 @@
         Transport.send(msg);
     }
 
+    /**
+     * Send a Test Mail to check configuration
+     * @throws AddressException
+     * @throws MessagingException
+     */
     public synchronized void sendTestMail() throws AddressException, MessagingException {
         String to = getToAddress();
         String from = getFromAddress();
