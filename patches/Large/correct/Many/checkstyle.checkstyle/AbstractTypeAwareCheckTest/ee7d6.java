diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheckTest.java
index 930cff3..3a23dad 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheckTest.java
@@ -81,7 +81,7 @@
         }
         catch (InvocationTargetException ex) {
             assertTrue(ex.getCause() instanceof IllegalArgumentException);
-            assertEquals(ex.getCause().getMessage(), "ClassInfo's name should be non-null");
+            assertEquals("ClassInfo's name should be non-null", ex.getCause().getMessage());
         }
 
         Constructor<?> tokenConstructor = tokenType.getDeclaredConstructor(String.class, int.class,
