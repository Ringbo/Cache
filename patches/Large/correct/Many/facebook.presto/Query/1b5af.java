diff --git a/presto-main/src/main/java/com/facebook/presto/server/protocol/Query.java b/presto-main/src/main/java/com/facebook/presto/server/protocol/Query.java
index fc9a7f4..b240777 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/protocol/Query.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/protocol/Query.java
@@ -416,7 +416,7 @@
                 }
 
                 Page page = serde.deserialize(serializedPage);
-                bytes += page.getSizeInBytes();
+                bytes += page.getLogicalSizeInBytes();
                 rows += page.getPositionCount();
                 pages.add(new RowIterable(session.toConnectorSession(), types, page));
             }
