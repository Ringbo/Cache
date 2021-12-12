diff --git a/hsweb-system/hsweb-system-dictionary/hsweb-system-dictionary-local/src/main/java/org/hswebframework/web/dictionary/simple/BoostDictDefineRepository.java b/hsweb-system/hsweb-system-dictionary/hsweb-system-dictionary-local/src/main/java/org/hswebframework/web/dictionary/simple/BoostDictDefineRepository.java
index 6e9033f..b08782d 100644
--- a/hsweb-system/hsweb-system-dictionary/hsweb-system-dictionary-local/src/main/java/org/hswebframework/web/dictionary/simple/BoostDictDefineRepository.java
+++ b/hsweb-system/hsweb-system-dictionary/hsweb-system-dictionary-local/src/main/java/org/hswebframework/web/dictionary/simple/BoostDictDefineRepository.java
@@ -32,8 +32,7 @@
         if (entity == null) {
             return super.getDefine(id);
         }
-        List<EnumDict<String>> items = new ArrayList<>(entity.getItems());
-
+        List<EnumDict<Object>> items = (List) new ArrayList<>(entity.getItems());
 
         return DefaultDictDefine.builder()
                 .id(id)
