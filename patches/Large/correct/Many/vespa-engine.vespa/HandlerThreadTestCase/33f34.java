diff --git a/logserver/src/test/java/com/yahoo/logserver/handlers/HandlerThreadTestCase.java b/logserver/src/test/java/com/yahoo/logserver/handlers/HandlerThreadTestCase.java
index 16c1c78..930b6e7 100644
--- a/logserver/src/test/java/com/yahoo/logserver/handlers/HandlerThreadTestCase.java
+++ b/logserver/src/test/java/com/yahoo/logserver/handlers/HandlerThreadTestCase.java
@@ -49,14 +49,14 @@
         final LogMessage msg3 = LogMessage.parseNativeFormat(msgstr3);
         thread.handle(msg1);
         while ((h1.messages.size() < 1) || (h2.messages.size() < 1) || (h3.messages.size() < 1)) {
-            thread.sleep(10);
+            Thread.sleep(10);
         }
         assertEquals(h1.messages.size(), 1);
         assertEquals(h2.messages.size(), 1);
         assertEquals(h3.messages.size(), 1);
         thread.handle(new ArrayList<LogMessage>() {{add(msg1); add(msg2); add(msg3); }});
         while ((h1.messages.size() < 4) || (h2.messages.size() < 4) || (h3.messages.size() < 4)) {
-            thread.sleep(10);
+            Thread.sleep(10);
         }
         assertEquals(h1.messages.size(), 4);
         assertEquals(h2.messages.size(), 4);
@@ -86,7 +86,7 @@
         final LogMessage msg1 = LogMessage.parseNativeFormat(msgstr1);
         thread.handle(msg1);
         while (h1.messages.size() < 1) {
-            thread.sleep(10);
+            Thread.sleep(10);
         }
         assertEquals(h1.messages.size(), 1);
         thread.interrupt();
