diff --git a/core/src/test/java/tachyon/command/UtilsTest.java b/core/src/test/java/tachyon/command/UtilsTest.java
index 0fb75e5..a02b9fa 100644
--- a/core/src/test/java/tachyon/command/UtilsTest.java
+++ b/core/src/test/java/tachyon/command/UtilsTest.java
@@ -38,7 +38,7 @@
     String expected = "/dir";
     for (String path : paths) {
       String result = Utils.getFilePath(path, new TachyonConf());
-      Assert.assertEquals(result, expected);
+      Assert.assertEquals(expected, result);
     }
   }
 }
