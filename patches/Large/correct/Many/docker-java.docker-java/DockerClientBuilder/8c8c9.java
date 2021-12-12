diff --git a/src/main/java/com/github/dockerjava/core/DockerClientBuilder.java b/src/main/java/com/github/dockerjava/core/DockerClientBuilder.java
index d47120a..155b36b 100644
--- a/src/main/java/com/github/dockerjava/core/DockerClientBuilder.java
+++ b/src/main/java/com/github/dockerjava/core/DockerClientBuilder.java
@@ -49,9 +49,9 @@
 		return this;
 	}
 		
-	public DockerClientBuilder withServiceLoaderClassPath(ClassPath classPath)
+	public DockerClientBuilder withServiceLoaderClassLoader(ClassLoader classLoader)
 	{
-		 serviceLoader = ServiceLoader.load(DockerCmdExecFactory.class, classPath);
+		 serviceLoader = ServiceLoader.load(DockerCmdExecFactory.class, classLoader);
 		 return this;
 	}
 
