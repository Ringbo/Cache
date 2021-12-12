diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/AuditEventDefaultFormatterTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/AuditEventDefaultFormatterTest.java
index e22c977..e29f811 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/AuditEventDefaultFormatterTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/AuditEventDefaultFormatterTest.java
@@ -44,7 +44,7 @@
         when(mock.getColumn()).thenReturn(1);
         when(mock.getMessage()).thenReturn("Mocked message.");
         when(mock.getFileName()).thenReturn("InputMockFile.java");
-        final AuditEvemtFormatter formatter = new AuditEventDefaultFormatter();
+        final AuditEventFormatter formatter = new AuditEventDefaultFormatter();
 
         final String expected = "[WARN] InputMockFile.java:1:1: Mocked message. [TestModule]";
 
@@ -60,7 +60,7 @@
         when(mock.getColumn()).thenReturn(1);
         when(mock.getMessage()).thenReturn("Mocked message.");
         when(mock.getFileName()).thenReturn("InputMockFile.java");
-        final AuditEvemtFormatter formatter = new AuditEventDefaultFormatter();
+        final AuditEventFormatter formatter = new AuditEventDefaultFormatter();
 
         final String expected = "[WARN] InputMockFile.java:1:1: Mocked message. [TestModule]";
 
@@ -76,7 +76,7 @@
         when(mock.getColumn()).thenReturn(1);
         when(mock.getMessage()).thenReturn("Mocked message.");
         when(mock.getFileName()).thenReturn("InputMockFile.java");
-        final AuditEvemtFormatter formatter = new AuditEventDefaultFormatter();
+        final AuditEventFormatter formatter = new AuditEventDefaultFormatter();
 
         final String expected = "[WARN] InputMockFile.java:1:1: Mocked message. [TestModule]";
 
@@ -92,7 +92,7 @@
         when(mock.getColumn()).thenReturn(1);
         when(mock.getMessage()).thenReturn("Mocked message.");
         when(mock.getFileName()).thenReturn("InputMockFile.java");
-        final AuditEvemtFormatter formatter = new AuditEventDefaultFormatter();
+        final AuditEventFormatter formatter = new AuditEventDefaultFormatter();
 
         final String expected = "[WARN] InputMockFile.java:1:1: Mocked message. [TestModule]";
 
