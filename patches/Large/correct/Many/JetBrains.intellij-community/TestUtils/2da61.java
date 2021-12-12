diff --git a/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java b/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
index 0731b4f..db8fd97 100644
--- a/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
+++ b/plugins/groovy/test/org/jetbrains/plugins/groovy/util/TestUtils.java
@@ -173,7 +173,7 @@
     input.add(content);
 
     Assert.assertTrue("No data found in source file", input.size() > 0);
-    Assert.assertNotNull("Test output points to null", input.size() > 1);
+    Assert.assertTrue("Test output points to null", input.size() > 1);
 
     return input;
   }
