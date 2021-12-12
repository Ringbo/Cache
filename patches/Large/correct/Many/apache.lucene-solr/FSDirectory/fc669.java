diff --git a/src/java/org/apache/lucene/store/FSDirectory.java b/src/java/org/apache/lucene/store/FSDirectory.java
index f82ecc2..b5678c0 100644
--- a/src/java/org/apache/lucene/store/FSDirectory.java
+++ b/src/java/org/apache/lucene/store/FSDirectory.java
@@ -65,7 +65,7 @@
                            FSDirectory.class.getName());
       IMPL = Class.forName(name);
     } catch (ClassNotFoundException e) {
-      throw new RuntimeException("cannot load FSDirectory class: " + e.getMessage());
+      throw new RuntimeException("cannot load FSDirectory class: " + e.toString());
     }
   }
 
@@ -115,7 +115,7 @@
         try {
           dir = (FSDirectory)IMPL.newInstance();
         } catch (Exception e) {
-          throw new RuntimeException("cannot load FSDirectory class: " + e.getMessage());
+          throw new RuntimeException("cannot load FSDirectory class: " + e.toString());
         }
         dir.init(file, create);
         DIRECTORIES.put(file, dir);
@@ -262,14 +262,14 @@
           try {
             in.close();
           } catch (IOException e) {
-            throw new RuntimeException("Cannot close input stream: " + e.getMessage());
+            throw new RuntimeException("Cannot close input stream: " + e.toString());
           }
         }
         if (out != null) {
           try {
             out.close();
           } catch (IOException e) {
-            throw new RuntimeException("Cannot close output stream: " + e.getMessage());
+            throw new RuntimeException("Cannot close output stream: " + e.toString());
           }
         }
       }
