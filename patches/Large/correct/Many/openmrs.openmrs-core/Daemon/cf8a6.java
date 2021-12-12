diff --git a/api/src/main/java/org/openmrs/api/context/Daemon.java b/api/src/main/java/org/openmrs/api/context/Daemon.java
index 6a0fac7..0e73116 100644
--- a/api/src/main/java/org/openmrs/api/context/Daemon.java
+++ b/api/src/main/java/org/openmrs/api/context/Daemon.java
@@ -112,7 +112,7 @@
 	 * @should not be called from other methods other than TimerSchedulerTask
 	 * @should not throw error if called from a TimerSchedulerTask class
 	 */
-	public static void executeScheduledTask(final Task task) throws Throwable {
+	public static void executeScheduledTask(final Task task) throws Exception {
 		
 		// quick check to make sure we're only being called by ourselves
 		//Class<?> callerClass = Reflection.getCallerClass(0);
@@ -323,14 +323,14 @@
 		/**
 		 * The exception thrown (if any) by the method called in {@link #run()}
 		 */
-		protected Throwable exceptionThrown = null;
+		protected Exception exceptionThrown = null;
 		
 		/**
 		 * Gets the exception thrown (if any) by the method called in {@link #run()}
 		 *
 		 * @return the thrown exception (if any).
 		 */
-		public Throwable getExceptionThrown() {
+		public Exception getExceptionThrown() {
 			return exceptionThrown;
 		}
 	}
