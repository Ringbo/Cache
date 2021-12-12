diff --git a/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java b/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
index db8fd97..482ca7c 100644
--- a/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
+++ b/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
@@ -144,6 +144,12 @@
     return text.substring(0, index) + text.substring(index + END_MARKER.length());
   }
 
+  /**
+   * Reads input file which consists at least of two sections separated with "-----" line
+   * @param filePath file to read
+   * @return a list of sections read from the file
+   * @throws RuntimeException if any IO problem occurs
+   */
   public static List<String> readInput(String filePath) {
     String content;
     try {
@@ -211,7 +217,7 @@
     }
 
     if (missedVariants.size() > 0) {
-      Assert.assertTrue("Some completion variants are missed " + missedVariants, false);
+      Assert.fail("Some completion variants are missed " + missedVariants);
     }
   }
 
