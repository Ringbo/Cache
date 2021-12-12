diff --git a/realm/src/main/java/io/realm/RealmTableOrViewList.java b/realm/src/main/java/io/realm/RealmTableOrViewList.java
index 7c480f7..b8a91b1 100644
--- a/realm/src/main/java/io/realm/RealmTableOrViewList.java
+++ b/realm/src/main/java/io/realm/RealmTableOrViewList.java
@@ -296,7 +296,7 @@
             case DOUBLE:
                 return table.averageDouble(columnIndex);
             case FLOAT:
-                return table.averageDouble(columnIndex);
+                return table.averageFloat(columnIndex);
             default:
                 throw new RuntimeException("Wrong type");
         }
