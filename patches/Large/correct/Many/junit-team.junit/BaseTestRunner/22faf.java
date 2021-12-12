diff --git a/junit/runner/BaseTestRunner.java b/junit/runner/BaseTestRunner.java
index d3fe31c..edfcb89 100644
--- a/junit/runner/BaseTestRunner.java
+++ b/junit/runner/BaseTestRunner.java
@@ -56,14 +56,15 @@
 	public static void savePreferences() throws IOException {
 		FileOutputStream fos= new FileOutputStream(getPreferencesFile());
 		try {
-			getPreferences().store(fos, "");
+			// calling of the deprecated save method to enable compiling under 1.1.7
+			getPreferences().save(fos, "");
 		} finally {
 			fos.close();
 		}
 	}
 
 	public static void setPreference(String key, String value) {
-		getPreferences().setProperty(key, value);
+		getPreferences().put(key, value);
 	}
 
 	public synchronized void endTest(Test test) {
