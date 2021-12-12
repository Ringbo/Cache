diff --git a/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/util/TypeUtil.java b/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/util/TypeUtil.java
index 57f88c8..8ba69ec 100644
--- a/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/util/TypeUtil.java
+++ b/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/util/TypeUtil.java
@@ -41,7 +41,7 @@
 
             return buildClass(_package, c, 0);
         } catch (ParseException e) {
-            throw new GenerationException(e);
+            throw new GenerationException("Couldn't parse type: " + typeDefinition, e);
         }
     }
 
