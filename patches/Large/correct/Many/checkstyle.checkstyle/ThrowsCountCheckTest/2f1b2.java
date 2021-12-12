diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/ThrowsCountCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/ThrowsCountCheckTest.java
index e7e8a4f..8934748 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/ThrowsCountCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/ThrowsCountCheckTest.java
@@ -66,6 +66,6 @@
     public void testGetRequiredTokens() {
         ThrowsCountCheck obj = new ThrowsCountCheck();
         int[] expected = {TokenTypes.LITERAL_THROWS};
-        assertArrayEquals(expected, obj.getAcceptableTokens());
+        assertArrayEquals(expected, obj.getRequiredTokens());
     }
 }
