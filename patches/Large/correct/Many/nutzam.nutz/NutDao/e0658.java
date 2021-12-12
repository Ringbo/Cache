diff --git a/src/org/nutz/dao/impl/NutDao.java b/src/org/nutz/dao/impl/NutDao.java
index da2483d..54fe052 100644
--- a/src/org/nutz/dao/impl/NutDao.java
+++ b/src/org/nutz/dao/impl/NutDao.java
@@ -1075,7 +1075,7 @@
         if (en.getPkType() == PkType.NAME) {
             MappingField mf = en.getNameField();
             Object val = mf.getValue(obj);
-            if (val == null && fetch(obj.getClass(), Cnd.where(mf.getName(), "=", val)) == null) {
+            if (val == null || fetch(obj.getClass(), Cnd.where(mf.getName(), "=", val)) == null) {
                 insert(t, insertFieldFilter);
             } else {
                 update(t, updateFieldFilter);
