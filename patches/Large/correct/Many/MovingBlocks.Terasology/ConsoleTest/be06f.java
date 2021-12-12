diff --git a/engine-tests/src/test/java/org/terasology/logic/console/ConsoleTest.java b/engine-tests/src/test/java/org/terasology/logic/console/ConsoleTest.java
index 19ee256..a18639f 100644
--- a/engine-tests/src/test/java/org/terasology/logic/console/ConsoleTest.java
+++ b/engine-tests/src/test/java/org/terasology/logic/console/ConsoleTest.java
@@ -24,7 +24,7 @@
 
 public class ConsoleTest extends TerasologyTestingEnvironment {
 
-    private final String MSG_TXT = "Test message";
+    private final String MESSAGE_TEXT = "Test message";
 
     @Test
     public void testClearCommand() {
@@ -40,28 +40,28 @@
 
     @Test
     public void testAddMessage() {
-        getConsole().addMessage(MSG_TXT);
+        getConsole().addMessage(MESSAGE_TEXT );
 
         checkMessage(getConsole().getMessages().iterator(), true);
     }
 
     @Test
     public void testAddConsoleMessage() {
-        getConsole().addMessage(new Message(MSG_TXT));
+        getConsole().addMessage(new Message(MESSAGE_TEXT ));
 
         checkMessage(getConsole().getMessages().iterator(), true);
     }
 
     @Test
     public void testAddInlineMessage() {
-        getConsole().addMessage(MSG_TXT, false);
+        getConsole().addMessage(MESSAGE_TEXT, false);
 
         checkMessage(getConsole().getMessages().iterator(), false);
     }
 
     @Test
     public void testAddInlineMessage2() {
-        getConsole().addMessage(new Message(MSG_TXT, false));
+        getConsole().addMessage(new Message(MESSAGE_TEXT, false));
 
         checkMessage(getConsole().getMessages().iterator(), false);
     }
@@ -70,7 +70,7 @@
         Assert.assertNotNull(it);
         Assert.assertTrue(it.hasNext());
         final Message message = it.next();
-        Assert.assertEquals(MSG_TXT, message.getMessage());
+        Assert.assertEquals(MESSAGE_TEXT, message.getMessage());
         Assert.assertEquals(hasNewLine, message.hasNewLine());
         Assert.assertFalse(it.hasNext());
     }
