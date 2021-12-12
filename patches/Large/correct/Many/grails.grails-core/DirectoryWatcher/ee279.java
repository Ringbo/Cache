diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/DirectoryWatcher.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/DirectoryWatcher.java
index 3211c0f..aa314ed 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/DirectoryWatcher.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/DirectoryWatcher.java
@@ -46,7 +46,7 @@
         AbstractDirectoryWatcher directoryWatcherDelegate;
         try {
 			directoryWatcherDelegate = (AbstractDirectoryWatcher) Class.forName("org.codehaus.groovy.grails.compiler.WatchServiceDirectoryWatcher").newInstance();
-		} catch (Exception e) {
+		} catch (Throwable e) {
 			LOG.info("Exception while trying to load WatchServiceDirectoryWatcher (this is probably Java 6 and WatchService isn't available). Falling back to PollingDirectoryWatcher.", e);
 	        directoryWatcherDelegate = new PollingDirectoryWatcher();
 		}
