diff --git a/src/be/ibridge/kettle/trans/TransMeta.java b/src/be/ibridge/kettle/trans/TransMeta.java
index c2f45bf..e0546d8 100644
--- a/src/be/ibridge/kettle/trans/TransMeta.java
+++ b/src/be/ibridge/kettle/trans/TransMeta.java
@@ -4186,7 +4186,7 @@
     public List getUsedVariables()
     {
         // Get the list of Strings.
-        List stringList = getStringList(true, true, true);
+        List stringList = getStringList(true, true, false);
         
         List varList = new ArrayList();
         
