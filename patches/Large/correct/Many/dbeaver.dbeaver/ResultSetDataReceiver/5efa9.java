diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetDataReceiver.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetDataReceiver.java
index d0a55d3..e182038 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetDataReceiver.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetDataReceiver.java
@@ -45,7 +45,7 @@
     private long offset;
     private long maxRows;
 
-    private Map<DBCAttributeMetaData, List<DBCException>> errors = new HashMap<>();
+    private Map<DBCAttributeMetaData, List<Exception>> errors = new HashMap<>();
 
     ResultSetDataReceiver(ResultSetViewer resultSetViewer)
     {
@@ -102,11 +102,11 @@
                     metaColumns[i].getAttribute(),
                     metaColumns[i].getOrdinalPosition());
             }
-            catch (DBCException e) {
+            catch (Exception e) {
                 // Do not reports the same error multiple times
                 // There are a lot of error could occur during result set fetch
                 // We report certain error only once
-                List<DBCException> errorList = errors.get(metaColumns[i].getMetaAttribute());
+                List<Exception> errorList = errors.get(metaColumns[i].getMetaAttribute());
                 if (errorList == null) {
                     errorList = new ArrayList<>();
                     errors.put(metaColumns[i].getMetaAttribute(), errorList);
