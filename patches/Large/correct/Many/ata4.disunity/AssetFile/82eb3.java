diff --git a/disunity-core/src/main/java/info/ata4/unity/asset/AssetFile.java b/disunity-core/src/main/java/info/ata4/unity/asset/AssetFile.java
index 91e0246..87a36ab 100644
--- a/disunity-core/src/main/java/info/ata4/unity/asset/AssetFile.java
+++ b/disunity-core/src/main/java/info/ata4/unity/asset/AssetFile.java
@@ -423,10 +423,10 @@
     }
 
     public boolean isStandalone() {
-        return typeTreeStruct.embedded();
+        return !typeTreeStruct.embedded();
     }
     
     public void setStandalone() {
-        typeTreeStruct.embedded(false);
+        typeTreeStruct.embedded(true);
     }
 }
