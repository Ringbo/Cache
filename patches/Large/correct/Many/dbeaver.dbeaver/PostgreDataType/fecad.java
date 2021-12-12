diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
index 6538483..b152e3e 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
@@ -109,19 +109,19 @@
         this.typeType = PostgreTypeType.b;
         try {
             String typTypeStr = JDBCUtils.safeGetString(dbResult, "typtype");
-            if (typTypeStr != null) {
+            if (typTypeStr != null && !typTypeStr.isEmpty()) {
                 this.typeType = PostgreTypeType.valueOf(typTypeStr.toLowerCase(Locale.ENGLISH));
             }
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             log.debug(e);
         }
         this.typeCategory = PostgreTypeCategory.X;
         try {
             String typCategoryStr = JDBCUtils.safeGetString(dbResult, "typcategory");
-            if (typCategoryStr != null) {
+            if (typCategoryStr != null && !typCategoryStr.isEmpty()) {
                 this.typeCategory = PostgreTypeCategory.valueOf(typCategoryStr.toUpperCase(Locale.ENGLISH));
             }
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             log.debug(e);
         }
 
@@ -141,12 +141,12 @@
         this.analyzeFunc = JDBCUtils.safeGetString(dbResult, "typanalyze");
         try {
             this.align = PostgreTypeAlign.valueOf(JDBCUtils.safeGetString(dbResult, "typalign"));
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             log.debug(e);
         }
         try {
             this.storage = PostgreTypeStorage.valueOf(JDBCUtils.safeGetString(dbResult, "typstorage"));
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             log.debug(e);
         }
         this.isNotNull = JDBCUtils.safeGetBoolean(dbResult, "typnotnull");
