diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/utils/TokenUtilsTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/utils/TokenUtilsTest.java
index b87d296..36c7bb8 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/utils/TokenUtilsTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/utils/TokenUtilsTest.java
@@ -94,7 +94,7 @@
             }
 
             TokenUtils.getTokenName(id);
-            fail();
+            fail("IllegalArgumentException is expected");
         }
         catch (IllegalArgumentException expected) {
             // restoring original value, to let other tests pass
