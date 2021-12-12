diff --git a/prettierJS/src/com/intellij/prettierjs/PrettierUtil.java b/prettierJS/src/com/intellij/prettierjs/PrettierUtil.java
index 4560bc5..bd3002f 100644
--- a/prettierJS/src/com/intellij/prettierjs/PrettierUtil.java
+++ b/prettierJS/src/com/intellij/prettierjs/PrettierUtil.java
@@ -163,7 +163,7 @@
         return null;
       }
       return CachedValuesManager.getManager(project).getParameterizedCachedValue(psiFile, CACHE_KEY, param ->
-        CachedValueProvider.Result.create(parseConfigInternal(param.getVirtualFile(), param), param), true, psiFile);
+        CachedValueProvider.Result.create(parseConfigInternal(param.getVirtualFile(), param), param), false, psiFile);
     });
   }
 
