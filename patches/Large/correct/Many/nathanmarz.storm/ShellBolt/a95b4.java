diff --git a/src/jvm/backtype/storm/task/ShellBolt.java b/src/jvm/backtype/storm/task/ShellBolt.java
index 72dfd66..041f987 100644
--- a/src/jvm/backtype/storm/task/ShellBolt.java
+++ b/src/jvm/backtype/storm/task/ShellBolt.java
@@ -92,7 +92,7 @@
             sendToSubprocess(JSONValue.toJSONString(stormConf));
             sendToSubprocess(context.toJSONString());
         } catch (IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error when launching multilang subprocess", e);
         }
     }
 
@@ -173,7 +173,7 @@
               }
             }
         } catch(IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error during multilang processing", e);
         }
     }
 
