diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/messages/ServerToClientMessage.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/messages/ServerToClientMessage.java
index 533d72d..7009144 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/messages/ServerToClientMessage.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/messages/ServerToClientMessage.java
@@ -38,7 +38,7 @@
             return new UserData(json);
         else if (TYPE_DOUBLE_CHECK.equals(json))
             return new DoubleCheck(json);
-        else if (TYPE_DEBUG.equals(json))
+        else if (TYPE_DEBUG.equals(type))
             return new Debug(json);
 
         return null;
