diff --git a/java/org/apache/naming/resources/WARDirContext.java b/java/org/apache/naming/resources/WARDirContext.java
index 8106fd1..264be9f 100644
--- a/java/org/apache/naming/resources/WARDirContext.java
+++ b/java/org/apache/naming/resources/WARDirContext.java
@@ -990,7 +990,7 @@
                     return is;
                 }
             } catch (ZipException e) {
-                throw new IOException(e.getMessage());
+                throw new IOException(e.getMessage(), e);
             }
             return super.streamContent();
         }
