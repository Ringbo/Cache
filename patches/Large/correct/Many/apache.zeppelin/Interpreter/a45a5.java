diff --git a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/interpreter/Interpreter.java b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/interpreter/Interpreter.java
index 58dcb64..3f7d35a 100644
--- a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/interpreter/Interpreter.java
+++ b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/interpreter/Interpreter.java
@@ -156,7 +156,7 @@
       }
     }
 
-    return property;
+    return p;
   }
 
   public String getProperty(String key) {
