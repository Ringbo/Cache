diff --git a/xml/impl/src/com/intellij/xml/impl/schema/SchemaDefinitionsSearch.java b/xml/impl/src/com/intellij/xml/impl/schema/SchemaDefinitionsSearch.java
index c2a7e85..3572c1b 100644
--- a/xml/impl/src/com/intellij/xml/impl/schema/SchemaDefinitionsSearch.java
+++ b/xml/impl/src/com/intellij/xml/impl/schema/SchemaDefinitionsSearch.java
@@ -122,7 +122,7 @@
         }
       }
     }
-    return false;
+    return true;
   }
 
   public static boolean isElementWithSomeEmbeddedType(XmlTagImpl xml) {
