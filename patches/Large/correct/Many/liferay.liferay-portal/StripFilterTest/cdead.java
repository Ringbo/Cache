diff --git a/portal-impl/test/com/liferay/portal/servlet/filters/strip/StripFilterTest.java b/portal-impl/test/com/liferay/portal/servlet/filters/strip/StripFilterTest.java
index 24f1e75..b596b80 100644
--- a/portal-impl/test/com/liferay/portal/servlet/filters/strip/StripFilterTest.java
+++ b/portal-impl/test/com/liferay/portal/servlet/filters/strip/StripFilterTest.java
@@ -277,7 +277,7 @@
 		CharBuffer charBuffer = CharBuffer.allocate(0);
 		StringWriter stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals("", stringWriter.toString());
 		assertEquals(0, charBuffer.position());
@@ -287,7 +287,7 @@
 		charBuffer = CharBuffer.wrap("abc \t\r\n");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals("", stringWriter.toString());
 		assertEquals(0, charBuffer.position());
@@ -297,7 +297,7 @@
 		charBuffer = CharBuffer.wrap(" ");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals(" ", stringWriter.toString());
 		assertEquals(1, charBuffer.position());
@@ -305,7 +305,7 @@
 		charBuffer = CharBuffer.wrap("\t");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals(" ", stringWriter.toString());
 		assertEquals(1, charBuffer.position());
@@ -313,7 +313,7 @@
 		charBuffer = CharBuffer.wrap("\r");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals(" ", stringWriter.toString());
 		assertEquals(1, charBuffer.position());
@@ -321,7 +321,7 @@
 		charBuffer = CharBuffer.wrap("\n");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals(" ", stringWriter.toString());
 		assertEquals(1, charBuffer.position());
@@ -331,7 +331,7 @@
 		charBuffer = CharBuffer.wrap(" \t\r\n");
 		stringWriter = new StringWriter();
 
-		stripFilter.skipWhiteSpace(charBuffer, stringWriter);
+		stripFilter.skipWhiteSpace(charBuffer, stringWriter, true);
 
 		assertEquals(" ", stringWriter.toString());
 		assertEquals(4, charBuffer.position());
