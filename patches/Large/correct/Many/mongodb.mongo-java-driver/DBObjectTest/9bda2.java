diff --git a/src/test/com/mongodb/DBObjectTest.java b/src/test/com/mongodb/DBObjectTest.java
index 8728e03..e1d469d 100644
--- a/src/test/com/mongodb/DBObjectTest.java
+++ b/src/test/com/mongodb/DBObjectTest.java
@@ -153,7 +153,7 @@
             _colTest.save(dbObject);
         }
         catch (IllegalArgumentException e) {
-            if (e.getMessage().equals("fields stored in the db can't have . in them")) {
+            if (e.getMessage().startsWith("fields stored in the db can't have . in them")) {
                 thrown = true;
             }
         }
