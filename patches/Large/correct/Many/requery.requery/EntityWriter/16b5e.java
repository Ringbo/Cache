diff --git a/requery/src/main/java/io/requery/sql/EntityWriter.java b/requery/src/main/java/io/requery/sql/EntityWriter.java
index 59bda29..317523c 100644
--- a/requery/src/main/java/io/requery/sql/EntityWriter.java
+++ b/requery/src/main/java/io/requery/sql/EntityWriter.java
@@ -702,7 +702,7 @@
                     junctionProxy.set(tKey, tValue, PropertyState.MODIFIED);
                     junctionProxy.set(uKey, uValue, PropertyState.MODIFIED);
 
-                    Cascade cascade = !isObservable && mode == Cascade.UPSERT ?
+                    Cascade cascade = isObservable && mode == Cascade.UPSERT ?
                             Cascade.UPSERT : Cascade.INSERT;
                     cascadeWrite(cascade, junction, null);
                 }
