diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreTrigger.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreTrigger.java
index f457d01..feffeb4 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreTrigger.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreTrigger.java
@@ -89,7 +89,7 @@
         } else {
             actionTiming = DBSActionTiming.AFTER;
         }
-        List<DBSManipulationType> mt = new ArrayList<>();
+        List<DBSManipulationType> mt = new ArrayList<>(1);
         if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_INSERT)) {
             mt.add(DBSManipulationType.INSERT);
         }
