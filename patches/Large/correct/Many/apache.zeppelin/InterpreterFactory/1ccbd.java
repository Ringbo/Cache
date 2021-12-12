diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterFactory.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterFactory.java
index b53c2c6..3fed07f 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterFactory.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterFactory.java
@@ -168,7 +168,7 @@
                 cleanCl.put(interpreterDirString, ccl);
               }
             }
-          } catch (ClassNotFoundException e) {
+          } catch (Throwable t) {
             // nothing to do
           }
         }
