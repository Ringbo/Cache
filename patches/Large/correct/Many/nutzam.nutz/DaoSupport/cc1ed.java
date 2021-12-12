diff --git a/src/org/nutz/dao/impl/DaoSupport.java b/src/org/nutz/dao/impl/DaoSupport.java
index 91e4be6..7076162 100644
--- a/src/org/nutz/dao/impl/DaoSupport.java
+++ b/src/org/nutz/dao/impl/DaoSupport.java
@@ -152,7 +152,7 @@
             if (log.isWarnEnabled())
                 log.warn("Replaced a running dataSource!");
         dataSource = ds;
-        if (expert != null)
+        if (expert == null)
             expert = Jdbcs.getExpert(ds);
         pojoMaker = new NutPojoMaker(expert);
 
