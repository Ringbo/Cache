diff --git a/src/org/geometerplus/fbreader/formats/PluginCollection.java b/src/org/geometerplus/fbreader/formats/PluginCollection.java
index 6883278..4896086 100644
--- a/src/org/geometerplus/fbreader/formats/PluginCollection.java
+++ b/src/org/geometerplus/fbreader/formats/PluginCollection.java
@@ -47,7 +47,7 @@
 			ourInstance = new PluginCollection();
 
 			// This code can not be moved to constructor because nativePlugins() is a native method
-			for (FormatPlugin p : ourInstance.nativePlugins()) {
+			for (NativeFormatPlugin p : ourInstance.nativePlugins()) {
 				ourInstance.addPlugin(p);
 			}
 		}
@@ -114,5 +114,5 @@
 		}
 	}
 
-	private native FormatPlugin[] nativePlugins();
+	private native NativeFormatPlugin[] nativePlugins();
 }
