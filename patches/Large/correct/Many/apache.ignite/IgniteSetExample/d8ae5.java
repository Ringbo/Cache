diff --git a/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteSetExample.java b/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteSetExample.java
index c82e708..2976ccb 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteSetExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteSetExample.java
@@ -149,7 +149,7 @@
         try {
             set.contains("1");
         }
-        catch (IgniteException expected) {
+        catch (IllegalStateException expected) {
             System.out.println("Expected exception - " + expected.getMessage());
         }
     }
