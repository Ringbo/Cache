diff --git a/hbase-common/src/test/java/org/apache/hadoop/hbase/ClassFinder.java b/hbase-common/src/test/java/org/apache/hadoop/hbase/ClassFinder.java
index 08799ba..703d15d 100644
--- a/hbase-common/src/test/java/org/apache/hadoop/hbase/ClassFinder.java
+++ b/hbase-common/src/test/java/org/apache/hadoop/hbase/ClassFinder.java
@@ -133,7 +133,7 @@
     try {
       jarFile = new JarInputStream(new FileInputStream(jarFileName));
     } catch (IOException ioEx) {
-      LOG.error("Failed to look for classes in " + jarFileName + ": " + ioEx);
+      LOG.warn("Failed to look for classes in " + jarFileName + ": " + ioEx);
       throw ioEx;
     }
 
@@ -147,7 +147,7 @@
           if (!proceedOnExceptions) {
             throw ioEx;
           }
-          LOG.error("Failed to get next entry from " + jarFileName + ": " + ioEx);
+          LOG.warn("Failed to get next entry from " + jarFileName + ": " + ioEx);
           break;
         }
         if (entry == null) {
@@ -172,7 +172,7 @@
         Class<?> c = makeClass(className, proceedOnExceptions);
         if (c != null) {
           if (!classes.add(c)) {
-            LOG.error("Ignoring duplicate class " + className);
+            LOG.warn("Ignoring duplicate class " + className);
           }
         }
       }
@@ -186,13 +186,13 @@
       boolean proceedOnExceptions) throws ClassNotFoundException, LinkageError {
     Set<Class<?>> classes = new HashSet<Class<?>>();
     if (!baseDirectory.exists()) {
-      LOG.error("Failed to find " + baseDirectory.getAbsolutePath());
+      LOG.warn("Failed to find " + baseDirectory.getAbsolutePath());
       return classes;
     }
 
     File[] files = baseDirectory.listFiles(this.fileFilter);
     if (files == null) {
-      LOG.error("Failed to get files from " + baseDirectory.getAbsolutePath());
+      LOG.warn("Failed to get files from " + baseDirectory.getAbsolutePath());
       return classes;
     }
 
@@ -207,7 +207,7 @@
         Class<?> c = makeClass(className, proceedOnExceptions);
         if (c != null) {
           if (!classes.add(c)) {
-            LOG.error("Ignoring duplicate class " + className);
+            LOG.warn("Ignoring duplicate class " + className);
           }
         }
       }
