diff --git a/backends/gdx-backend-moe/src/com/badlogic/gdx/backends/iosmoe/IOSPreferences.java b/backends/gdx-backend-moe/src/com/badlogic/gdx/backends/iosmoe/IOSPreferences.java
index ffb0def..e065313 100755
--- a/backends/gdx-backend-moe/src/com/badlogic/gdx/backends/iosmoe/IOSPreferences.java
+++ b/backends/gdx-backend-moe/src/com/badlogic/gdx/backends/iosmoe/IOSPreferences.java
@@ -52,7 +52,7 @@
 
 	@Override
 	public Preferences putLong (String key, long val) {
-		nsDictionary.put(convertKey(key), NSNumber.numberWithLong(val));
+		nsDictionary.put(convertKey(key), NSNumber.numberWithLongLong(val));
 		return this;
 	}
 
@@ -106,7 +106,7 @@
 	public long getLong (String key) {
 		NSNumber value = (NSNumber)nsDictionary.get(convertKey(key));
 		if (value == null) return 0L;
-		return value.longValue();
+		return value.longLongValue();
 	}
 
 	@Override
@@ -118,7 +118,8 @@
 
 	@Override
 	public String getString (String key) {
-		NSString value = (NSString)nsDictionary.get(convertKey(key));
+		//Implicit mapping from NSString to String apparently?
+		Object value = nsDictionary.get(convertKey(key));
 		if (value == null) return "";
 		return value.toString();
 	}
@@ -179,7 +180,7 @@
 	}
 
 	private NSString convertKey (String key) {
-		return NSString.stringWithString(key);
+		return NSString.alloc().initWithString(key);
 	}
 
 	@Override
@@ -188,6 +189,6 @@
 		if (!nsDictionary.writeToFileAtomically(file.getAbsolutePath(), false)) {
 			Gdx.app.debug("IOSPreferences", "Failed to write NSDictionary to file " + file);
 		}
-		pool.dealloc();
+		pool.drain();
 	}
 }
