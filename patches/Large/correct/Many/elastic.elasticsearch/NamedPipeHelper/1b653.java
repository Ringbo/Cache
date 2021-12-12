diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelper.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelper.java
index ccce5fe..d41a6e1 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelper.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelper.java
@@ -278,7 +278,7 @@
 
         private final Path file;
 
-        public PrivilegedInputPipeOpener(Path file) {
+        PrivilegedInputPipeOpener(Path file) {
             this.file = file;
         }
 
@@ -300,7 +300,7 @@
 
         private final Path file;
 
-        public PrivilegedOutputPipeOpener(Path file) {
+        PrivilegedOutputPipeOpener(Path file) {
             this.file = file;
         }
 
