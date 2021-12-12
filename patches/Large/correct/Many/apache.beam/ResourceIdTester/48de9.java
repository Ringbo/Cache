diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/io/fs/ResourceIdTester.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/io/fs/ResourceIdTester.java
index 8ceaeed..d196553 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/io/fs/ResourceIdTester.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/io/fs/ResourceIdTester.java
@@ -108,7 +108,7 @@
     try {
       ResourceId badFile = baseDirectory.resolve("file/", RESOLVE_FILE);
       fail(String.format("Resolving badFile %s should have failed", badFile));
-    } catch (Throwable t) {
+    } catch (IllegalArgumentException e) {
       // expected
     }
 
@@ -116,7 +116,7 @@
     try {
       baseDirectory.resolve("file2", RESOLVE_FILE);
       fail(String.format("Should not be able to resolve against file resource %s", file));
-    } catch (Throwable t) {
+    } catch (IllegalArgumentException e) {
       // expected
     }
   }
