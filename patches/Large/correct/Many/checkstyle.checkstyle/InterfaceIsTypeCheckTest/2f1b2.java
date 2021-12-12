diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/InterfaceIsTypeCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/InterfaceIsTypeCheckTest.java
index 6ee4c32..40fab2f 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/InterfaceIsTypeCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/design/InterfaceIsTypeCheckTest.java
@@ -64,6 +64,6 @@
     public void testGetRequiredTokens() {
         InterfaceIsTypeCheck obj = new InterfaceIsTypeCheck();
         int[] expected = {TokenTypes.INTERFACE_DEF};
-        assertArrayEquals(expected, obj.getAcceptableTokens());
+        assertArrayEquals(expected, obj.getRequiredTokens());
     }
 }
