diff --git a/java/org/apache/tomcat/util/bcel/classfile/Utility.java b/java/org/apache/tomcat/util/bcel/classfile/Utility.java
index b3eb339..3c2f7d0 100644
--- a/java/org/apache/tomcat/util/bcel/classfile/Utility.java
+++ b/java/org/apache/tomcat/util/bcel/classfile/Utility.java
@@ -345,7 +345,7 @@
             }
             break;
         default:
-            throw new RuntimeException(
+            throw new ClassFormatException(
                     "Unexpected element value kind in annotation: " + type);
         }
     }
@@ -446,7 +446,7 @@
             swallowMethodParameters(file);
             break;
         default: // Never reached
-            throw new IllegalStateException("Unrecognized attribute type tag parsed: " + tag);
+            throw new ClassFormatException("Unrecognized attribute type tag parsed: " + tag);
         }
     }
 
