diff --git a/src/org/pentaho/di/core/plugins/PluginLoader.java b/src/org/pentaho/di/core/plugins/PluginLoader.java
index f2465d0..9e0d408 100644
--- a/src/org/pentaho/di/core/plugins/PluginLoader.java
+++ b/src/org/pentaho/di/core/plugins/PluginLoader.java
@@ -116,8 +116,8 @@
 								{
 									boolean isAlsoJar = childFolder.getName().getURI().endsWith(".jar");
 
-									// ignore anything that is not a folder
-									if( childFolder.getType() != FileType.FOLDER ) {
+									// ignore anything that is not a folder or a jar
+									if(!isAlsoJar && childFolder.getType() != FileType.FOLDER) {
 										continue;
 									}
 
@@ -206,12 +206,11 @@
 				{
 					Node libnode = XMLHandler.getSubNodeByNr(libsnode, "library", j);
 					String jarfile = XMLHandler.getTagAttribute(libnode, "name");
-					jarfiles[j] = parent.getChild(jarfile).getURL().getFile();
+					jarfiles[j] = parent.resolveFile(jarfile).getURL().getFile();
 					// System.out.println("jar files=" + jarfiles[j]);
 				}
 
-				String iconFilename = parent.getChild(iconfile).getURL().getFile();
-				// System.out.println("iconfile=" + iconFilename);
+				String iconFilename = parent.resolveFile(iconfile).getURL().getFile();
 				JobPlugin sp = new JobPlugin(JobPlugin.TYPE_PLUGIN, id, description, tooltip, parent
 						.getName().getURI(), jarfiles, iconFilename, classname);
 
