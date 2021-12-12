diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfoTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfoTest.java
index 7f23234..240dc6c 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfoTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfoTest.java
@@ -303,7 +303,7 @@
 
     @Test
     public void testCoverage() {
-        assertEquals(JavadocTagInfo.VERSION.getType(), JavadocTagInfo.Type.BLOCK);
+        assertEquals(JavadocTagInfo.Type.BLOCK, JavadocTagInfo.VERSION.getType());
 
         assertEquals("text [@version] name [version] type [BLOCK]", JavadocTagInfo.VERSION.toString());
 
