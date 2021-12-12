diff --git a/src/org/nutz/mvc/WhaleFilter.java b/src/org/nutz/mvc/WhaleFilter.java
index 46d6944..4d96f1a 100644
--- a/src/org/nutz/mvc/WhaleFilter.java
+++ b/src/org/nutz/mvc/WhaleFilter.java
@@ -80,7 +80,7 @@
     
     public void init(InputStream ins) throws Exception {
         props.load(ins);
-        if (props.contains("log.adapter")) {
+        if (props.containsKey("log.adapter")) {
             LogAdapter la = (LogAdapter) Class.forName(props.getProperty("log.adapter")).newInstance();
             Logs.setAdapter(la);
         }
