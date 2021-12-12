diff --git a/src/be/ibridge/kettle/trans/Trans.java b/src/be/ibridge/kettle/trans/Trans.java
index 32c1046..9ca93b0 100644
--- a/src/be/ibridge/kettle/trans/Trans.java
+++ b/src/be/ibridge/kettle/trans/Trans.java
@@ -1951,7 +1951,7 @@
         }
         catch(Exception e)
         {
-            throw new KettleException("There was an error during transformation split");
+            throw new KettleException("There was an error during transformation split", e);
         }
     }
 }
\ No newline at end of file
