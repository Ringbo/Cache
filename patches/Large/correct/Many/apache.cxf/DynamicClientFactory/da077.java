diff --git a/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/DynamicClientFactory.java b/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/DynamicClientFactory.java
index 3d52b54..a8ea9e8 100644
--- a/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/DynamicClientFactory.java
+++ b/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/DynamicClientFactory.java
@@ -313,7 +313,7 @@
         }
         File classes = new File(tmpdir, stem + "-classes");
         if (!classes.mkdir()) {
-            throw new IllegalStateException("Unable to create working directory " + src.getPath());
+            throw new IllegalStateException("Unable to create working directory " + classes.getPath());
         }
         StringBuilder classPath = new StringBuilder();
         try {
