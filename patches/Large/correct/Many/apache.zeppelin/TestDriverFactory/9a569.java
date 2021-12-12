diff --git a/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/driver/TestDriverFactory.java b/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/driver/TestDriverFactory.java
index 0fcc19e..4b52403 100644
--- a/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/driver/TestDriverFactory.java
+++ b/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/driver/TestDriverFactory.java
@@ -29,7 +29,7 @@
 	}
 	
 	public Collection<String> getAllConfigurationNames(){		
-		return uris.keySet();
+		return drivers.keySet();
 	}
 	
 	public String getDefaultConfigurationName(){
