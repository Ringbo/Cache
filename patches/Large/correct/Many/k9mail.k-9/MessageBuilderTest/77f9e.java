diff --git a/k9mail/src/test/java/com/fsck/k9/message/MessageBuilderTest.java b/k9mail/src/test/java/com/fsck/k9/message/MessageBuilderTest.java
index 6e6b29b..584c378 100644
--- a/k9mail/src/test/java/com/fsck/k9/message/MessageBuilderTest.java
+++ b/k9mail/src/test/java/com/fsck/k9/message/MessageBuilderTest.java
@@ -65,7 +65,7 @@
 
     public static final Date SENT_DATE = new Date(10000000000L);
     public static final String MESSAGE_HEADERS =
-            "Date: Sun, 26 Apr 1970 18:46:40 +0100\r\n" +
+            "Date: Sun, 26 Apr 1970 17:46:40 +0000\r\n" +
             "From: tester <test@example.org>\r\n" +
             "To: recip 1 <to1@example.org>,recip 2 <to2@example.org>\r\n" +
             "CC: cc recip <cc@example.org>\r\n" +
@@ -256,7 +256,7 @@
 
         b.setSubject(TEST_SUBJECT)
                 .setSentDate(SENT_DATE)
-                .setHideTimeZone(false)
+                .setHideTimeZone(true)
                 .setTo(Arrays.asList(TEST_TO))
                 .setCc(Arrays.asList(TEST_CC))
                 .setBcc(Arrays.asList(TEST_BCC))
