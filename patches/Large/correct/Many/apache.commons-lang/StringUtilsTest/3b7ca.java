diff --git a/src/test/org/apache/commons/lang/StringUtilsTest.java b/src/test/org/apache/commons/lang/StringUtilsTest.java
index f63a334..49021af 100644
--- a/src/test/org/apache/commons/lang/StringUtilsTest.java
+++ b/src/test/org/apache/commons/lang/StringUtilsTest.java
@@ -1082,7 +1082,7 @@
         try {
             StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"});
             fail("Should be a circular reference");
-        } catch (IllegalArgumentException e) {}
+        } catch (IllegalStateException e) {}
 
         //JAVADOC TESTS END
 
