diff --git a/core/src/test/java/cucumber/runtime/RuntimeOptionsTest.java b/core/src/test/java/cucumber/runtime/RuntimeOptionsTest.java
index 1204816..bc7f4ec 100644
--- a/core/src/test/java/cucumber/runtime/RuntimeOptionsTest.java
+++ b/core/src/test/java/cucumber/runtime/RuntimeOptionsTest.java
@@ -70,7 +70,7 @@
         String someName = "someName";
         RuntimeOptions options = new RuntimeOptions(new Properties(), "--name", someName);
         Pattern actualPattern = (Pattern) options.filters.iterator().next();
-        assertEquals(actualPattern.pattern(), someName);
+        assertEquals(someName, actualPattern.pattern());
     }
 
     @Test
@@ -78,7 +78,7 @@
         String someName = "someName";
         RuntimeOptions options = new RuntimeOptions(new Properties(), "-n", someName);
         Pattern actualPattern = (Pattern) options.filters.iterator().next();
-        assertEquals(actualPattern.pattern(), someName);
+        assertEquals(someName, actualPattern.pattern());
     }
 
     @Test
