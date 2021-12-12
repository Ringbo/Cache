diff --git a/jOOQ/src/main/java/org/jooq/conf/MiniJAXB.java b/jOOQ/src/main/java/org/jooq/conf/MiniJAXB.java
index 01341f6..f002624 100644
--- a/jOOQ/src/main/java/org/jooq/conf/MiniJAXB.java
+++ b/jOOQ/src/main/java/org/jooq/conf/MiniJAXB.java
@@ -235,7 +235,7 @@
                 Reflect.on(result).set(childName, adapter.unmarshal(childElement.getTextContent().trim()));
             }
             else {
-                Reflect.on(result).set(childElementName, Convert.convert(childElement.getTextContent().trim(), childType));
+                Reflect.on(result).set(childName, Convert.convert(childElement.getTextContent().trim(), childType));
             }
         }
     }
