diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreAttribute.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreAttribute.java
index cd09e62..e70911c 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreAttribute.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreAttribute.java
@@ -298,7 +298,7 @@
         @Override
         public PostgreDataType transform(PostgreAttribute object, Object value) {
             if (value instanceof String) {
-                PostgreDataType dataType = object.getDatabase().getDataType(null, (String)value);
+                PostgreDataType dataType = object.getDataSource().getLocalDataType((String)value);
                 if (dataType == null) {
                     throw new IllegalArgumentException("Bad data type name specified: " + value);
                 }
