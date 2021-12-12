diff --git a/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
index 65b2cda..bc7f764 100644
--- a/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
+++ b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
@@ -1570,7 +1570,7 @@
         reporter.warning(
             "Duplicate record field " + fieldName,
             sourceName,
-            n.getLineno(), "", n.getCharno());
+            n.getLineno(), "", fieldNameNode.getCharno());
       }
     }
 
