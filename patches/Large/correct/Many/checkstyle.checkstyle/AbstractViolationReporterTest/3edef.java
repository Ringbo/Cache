diff --git a/src/tests/com/puppycrawl/tools/checkstyle/api/AbstractViolationReporterTest.java b/src/tests/com/puppycrawl/tools/checkstyle/api/AbstractViolationReporterTest.java
index ef8be99..9afa9ed 100644
--- a/src/tests/com/puppycrawl/tools/checkstyle/api/AbstractViolationReporterTest.java
+++ b/src/tests/com/puppycrawl/tools/checkstyle/api/AbstractViolationReporterTest.java
@@ -47,7 +47,7 @@
         LocalizedMessages collector = new LocalizedMessages();
         emptyCheck.setMessages(collector);
 
-        emptyCheck.log(0, "msgKey", null);
+        emptyCheck.log(0, "msgKey");
 
         LocalizedMessage[] messages = collector.getMessages();
         Assert.assertTrue(messages.length == 1);
