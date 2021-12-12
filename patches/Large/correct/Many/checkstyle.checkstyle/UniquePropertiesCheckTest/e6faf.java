diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
index c5ba375..89230f6 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
@@ -81,7 +81,7 @@
         final int stringNumber =
                 UniquePropertiesCheck.getLineNumber(testStrings,
                         "some key");
-        Assert.assertEquals(stringNumber, 0);
+        Assert.assertEquals(0, stringNumber);
     }
 
     /**
@@ -97,12 +97,12 @@
         final SortedSet<LocalizedMessage> messages =
                 check.process(file, Collections.<String>emptyList());
         Assert.assertEquals("Wrong messages count: " + messages.size(),
-                messages.size(), 1);
+                1, messages.size());
         final LocalizedMessage message = messages.iterator().next();
         final String retrievedMessage = messages.iterator().next().getKey();
         Assert.assertEquals("Message key '" + retrievedMessage
-                + "' is not valid", retrievedMessage,
-                "unable.open.cause");
+                + "' is not valid", "unable.open.cause",
+                retrievedMessage);
         Assert.assertEquals("Message '" + message.getMessage()
                 + "' is not valid", message.getMessage(),
                 getCheckMessage(IO_EXCEPTION_KEY, fileName, getFileNotFoundDetail(file)));
