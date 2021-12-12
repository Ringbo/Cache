diff --git a/src/main/org/codehaus/groovy/tools/FileSystemCompiler.java b/src/main/org/codehaus/groovy/tools/FileSystemCompiler.java
index 6f234ff..c393f3c 100644
--- a/src/main/org/codehaus/groovy/tools/FileSystemCompiler.java
+++ b/src/main/org/codehaus/groovy/tools/FileSystemCompiler.java
@@ -296,7 +296,7 @@
                             " you are possibly victim to"+
                             " http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6325169. "+
                             " this is no bug in Groovy.";
-                        throw new IOException(msg,ioe);
+                        throw new IOException(msg);
                     } else {
                         throw ioe;
                     }
