diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/NewlineAtEndOfFileCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/NewlineAtEndOfFileCheckTest.java
index 335d581..95cb6d0 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/NewlineAtEndOfFileCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/NewlineAtEndOfFileCheckTest.java
@@ -170,7 +170,7 @@
         Set<LocalizedMessage> messages = check.process(impossibleFile, Lists.newArrayList("txt"));
         assertTrue(messages.size() == 1);
         Iterator<LocalizedMessage> iter = messages.iterator();
-        assertEquals(iter.next().getMessage(), "Unable to open ''.");
+        assertEquals("Unable to open ''.", iter.next().getMessage());
     }
 
     @Test
@@ -190,10 +190,10 @@
         catch (InvocationTargetException ex) {
             assertTrue(ex.getCause() instanceof IOException);
             if (System.getProperty("os.name").toLowerCase(ENGLISH).startsWith("windows")) {
-                assertEquals(ex.getCause().getMessage(), "Unable to read 2 bytes, got 0");
+                assertEquals("Unable to read 2 bytes, got 0", ex.getCause().getMessage());
             }
             else {
-                assertEquals(ex.getCause().getMessage(), "Unable to read 1 bytes, got 0");
+                assertEquals("Unable to read 1 bytes, got 0", ex.getCause().getMessage());
             }
         }
     }
