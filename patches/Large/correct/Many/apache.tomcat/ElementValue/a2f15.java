diff --git a/java/org/apache/tomcat/util/bcel/classfile/ElementValue.java b/java/org/apache/tomcat/util/bcel/classfile/ElementValue.java
index 436ebad..301146e 100644
--- a/java/org/apache/tomcat/util/bcel/classfile/ElementValue.java
+++ b/java/org/apache/tomcat/util/bcel/classfile/ElementValue.java
@@ -117,7 +117,7 @@
             }
             return new ArrayElementValue(ARRAY, evalues, cpool);
         default:
-            throw new RuntimeException(
+            throw new ClassFormatException(
                     "Unexpected element value kind in annotation: " + type);
         }
     }
