diff --git a/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/DefaultGenerationConfig.java b/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/DefaultGenerationConfig.java
index 6e16ee4..70589ef 100644
--- a/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/DefaultGenerationConfig.java
+++ b/jsonschema2pojo-core/src/main/java/org/jsonschema2pojo/DefaultGenerationConfig.java
@@ -283,11 +283,11 @@
     }
 
     /**
-     * @return <code>true</code>
+     * @return <code>false</code>
      */
     @Override
     public boolean isIncludeDynamicAccessors() {
-        return true;
+        return false;
     }
 
     @Override
