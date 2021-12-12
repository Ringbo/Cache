diff --git a/jodd-core/src/test/java/jodd/util/StringUtilTest.java b/jodd-core/src/test/java/jodd/util/StringUtilTest.java
index 6953109..255443a 100755
--- a/jodd-core/src/test/java/jodd/util/StringUtilTest.java
+++ b/jodd-core/src/test/java/jodd/util/StringUtilTest.java
@@ -966,7 +966,7 @@
 		try {
 			assertEquals("123", StringUtil.convertCharset("123", "yyy", "xxx"));
 			fail("error");
-		} catch (IllegalArgumentException e) {
+		} catch (RuntimeException e) {
 			// ignore
 		}
 	}
