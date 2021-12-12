diff --git a/src/main/com/mongodb/DBCursor.java b/src/main/com/mongodb/DBCursor.java
index e8f6ef2..f9b883a 100644
--- a/src/main/com/mongodb/DBCursor.java
+++ b/src/main/com/mongodb/DBCursor.java
@@ -335,7 +335,7 @@
         if ( _orderBy != null && _orderBy.keySet().size() > 0 )
             return true;
         
-        if ( _hint != null )
+        if ( _hint != null || _snapshot )
             return true;
         
         return _explain;
