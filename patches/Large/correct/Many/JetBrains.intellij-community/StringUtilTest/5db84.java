diff --git a/platform/util/testSrc/com/intellij/util/text/StringUtilTest.java b/platform/util/testSrc/com/intellij/util/text/StringUtilTest.java
index 0fd8dbb..fef119f 100644
--- a/platform/util/testSrc/com/intellij/util/text/StringUtilTest.java
+++ b/platform/util/testSrc/com/intellij/util/text/StringUtilTest.java
@@ -87,6 +87,6 @@
     Collections.sort(strings2, c);
     assertEquals(Arrays.asList("T1", "t1", "t001", "T2", "t2", "T002"), strings2);
     assertEquals(1 ,StringUtil.naturalCompare("7403515080361171695", "07403515080361171694"));
-    assertEquals(14, StringUtil.naturalCompare("_firstField", "myField1"));
+    assertEquals(-14, StringUtil.naturalCompare("_firstField", "myField1"));
   }
 }
