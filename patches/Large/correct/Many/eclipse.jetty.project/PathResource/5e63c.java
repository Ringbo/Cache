diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/resource/PathResource.java b/jetty-util/src/main/java/org/eclipse/jetty/util/resource/PathResource.java
index 446585b..8837f9d 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/resource/PathResource.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/resource/PathResource.java
@@ -206,7 +206,7 @@
 		// Note: The org.eclipse.jetty.server.ResourceCache.Content uses #toString() instead of
 		// #getName() for determining the file name for mime type resolution based on the file name 
         // extension.
-		return _path.toString();
+		return path.toString();
 	}
 
     @Override
