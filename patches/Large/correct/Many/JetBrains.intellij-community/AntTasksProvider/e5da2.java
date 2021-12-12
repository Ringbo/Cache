diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/AntTasksProvider.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/AntTasksProvider.java
index 5efefbf..1cbfccd 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/AntTasksProvider.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/AntTasksProvider.java
@@ -111,7 +111,7 @@
           for (VirtualFile jar : jars) {
             urls.add(VfsUtil.convertToURL(PathUtil.getLocalFile(jar).getUrl()));
           }
-          final ClassLoader loader = new UrlClassLoader(urls, null);
+          final ClassLoader loader = new UrlClassLoader(urls, null, false, false, true);
           final ReflectedProject antProject = ReflectedProject.getProject(loader);
 
           final Map<String, Class> result = new HashMap<String, Class>();
