diff --git a/java/org/apache/juli/ClassLoaderLogManager.java b/java/org/apache/juli/ClassLoaderLogManager.java
index 1fdce3b..5421497 100644
--- a/java/org/apache/juli/ClassLoaderLogManager.java
+++ b/java/org/apache/juli/ClassLoaderLogManager.java
@@ -488,7 +488,9 @@
         } finally {
             try {
                 is.close();
-            } catch (Throwable t) {}
+            } catch (IOException ioe) {
+                // Ignore
+            }
         }
         
         // Create handlers for the root logger of this classloader
