diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/MutableExceptionCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/MutableExceptionCheckTest.java
index f7056ed..4cb1fdf 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/MutableExceptionCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/MutableExceptionCheckTest.java
@@ -65,6 +65,6 @@
     public void testGetRequiredTokens() {
         MutableExceptionCheck obj = new MutableExceptionCheck();
         int[] expected = {TokenTypes.CLASS_DEF, TokenTypes.VARIABLE_DEF};
-        assertArrayEquals(expected, obj.getAcceptableTokens());
+        assertArrayEquals(expected, obj.getRequiredTokens());
     }
 }
