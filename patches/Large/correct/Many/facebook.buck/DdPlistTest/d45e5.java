diff --git a/test/com/facebook/buck/ddplist/DdPlistTest.java b/test/com/facebook/buck/ddplist/DdPlistTest.java
index a063d76..53a98d9 100644
--- a/test/com/facebook/buck/ddplist/DdPlistTest.java
+++ b/test/com/facebook/buck/ddplist/DdPlistTest.java
@@ -38,10 +38,10 @@
   }
 
   @Test
-  public void testASCIIWriting() throws Exception {
+  public void testXMLWriting() throws Exception {
     InputStream in = getClass().getResourceAsStream("test-files/test1.plist");
     NSDictionary x = (NSDictionary) PropertyListParser.parse(in);
-    PropertyListParser.saveAsASCII(x, outputFile);
+    PropertyListParser.saveAsXML(x, outputFile);
     NSDictionary y = (NSDictionary) PropertyListParser.parse(outputFile);
     assertEquals(x, y);
   }
