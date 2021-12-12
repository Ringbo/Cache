diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedMethod.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedMethod.java
index 75dbccb..d0f0a68 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedMethod.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedMethod.java
@@ -86,7 +86,7 @@
 
         this.name = reader.getString(reader.readSmallUint(methodIdItemOffset + NAME_OFFSET));
 
-        this.returnType = reader.getString(reader.readSmallUint(protoIdItemOffset + RETURN_TYPE_OFFSET));
+        this.returnType = reader.getType(reader.readSmallUint(protoIdItemOffset + RETURN_TYPE_OFFSET));
         this.parametersOffset = reader.readSmallUint(protoIdItemOffset + PARAMETERS_OFFSET);
     }
 
