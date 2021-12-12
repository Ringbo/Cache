diff --git a/h2/src/main/org/h2/table/TableSynonym.java b/h2/src/main/org/h2/table/TableSynonym.java
index b636d43..a6f86c8 100644
--- a/h2/src/main/org/h2/table/TableSynonym.java
+++ b/h2/src/main/org/h2/table/TableSynonym.java
@@ -182,7 +182,7 @@
     }
 
     public boolean isInvalid() {
-        return data.synonymForSchema.findTableOrView(data.session, data.synonymFor) != null;
+        return data.synonymForSchema.findTableOrView(data.session, data.synonymFor) == null;
     }
 
 }
