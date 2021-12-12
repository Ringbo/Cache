diff --git a/fml/common/cpw/mods/fml/common/registry/LanguageRegistry.java b/fml/common/cpw/mods/fml/common/registry/LanguageRegistry.java
index 76dbafd..80930eb 100644
--- a/fml/common/cpw/mods/fml/common/registry/LanguageRegistry.java
+++ b/fml/common/cpw/mods/fml/common/registry/LanguageRegistry.java
@@ -46,7 +46,7 @@
             throw new IllegalArgumentException(String.format("Illegal object for naming %s",objectToName));
         }
         objectName+=".name";
-        addStringLocalization(lang, lang, name);
+        addStringLocalization(objectName, lang, name);
     }
 
     public void loadLanguageTable(Properties languagePack, String lang)
