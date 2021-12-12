diff --git a/javamelody-core/src/main/java/net/bull/javamelody/UpdateChecker.java b/javamelody-core/src/main/java/net/bull/javamelody/UpdateChecker.java
index 5dfbdf9..cf007e9 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/UpdateChecker.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/UpdateChecker.java
@@ -123,7 +123,7 @@
 		}
 		final String javamelodyVersion = properties.getProperty("version");
 		if (javamelodyVersion != null
-				&& javamelodyVersion.compareTo(Parameters.JAVAMELODY_VERSION) < 0) {
+				&& javamelodyVersion.compareTo(Parameters.JAVAMELODY_VERSION) > 0) {
 			setNewJavamelodyVersion(javamelodyVersion);
 		}
 	}
