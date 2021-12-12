diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/system/EmbeddedServerPortFileWriter.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/system/EmbeddedServerPortFileWriter.java
index 539cf1b..3fbbe8d 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/system/EmbeddedServerPortFileWriter.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/system/EmbeddedServerPortFileWriter.java
@@ -46,29 +46,31 @@
 
 	private static final String[] PROPERTY_VARIABLES = { "PORTFILE", "portfile" };
 
-	private static final Log logger = LogFactory.getLog(ApplicationPidFileWriter.class);
+	private static final Log logger = LogFactory
+			.getLog(EmbeddedServerPortFileWriter.class);
 
 	private final File file;
 
 	/**
-	 * Create a new {@link ApplicationPidFileWriter} instance using the filename
-	 * 'application.pid'.
+	 * Create a new {@link EmbeddedServerPortFileWriter} instance using the filename
+	 * 'application.port'.
 	 */
 	public EmbeddedServerPortFileWriter() {
 		this.file = new File(DEFAULT_FILE_NAME);
 	}
 
 	/**
-	 * Create a new {@link ApplicationPidFileWriter} instance with a specified filename.
-	 * @param filename the name of file containing pid
+	 * Create a new {@link EmbeddedServerPortFileWriter} instance with a specified
+	 * filename.
+	 * @param filename the name of file containing port
 	 */
 	public EmbeddedServerPortFileWriter(String filename) {
 		this(new File(filename));
 	}
 
 	/**
-	 * Create a new {@link ApplicationPidFileWriter} instance with a specified file.
-	 * @param file the file containing pid
+	 * Create a new {@link EmbeddedServerPortFileWriter} instance with a specified file.
+	 * @param file the file containing port
 	 */
 	public EmbeddedServerPortFileWriter(File file) {
 		Assert.notNull(file, "File must not be null");
@@ -91,7 +93,7 @@
 			portFile.deleteOnExit();
 		}
 		catch (Exception ex) {
-			logger.warn(String.format("Cannot create pid file %s", this.file));
+			logger.warn(String.format("Cannot create port file %s", this.file));
 		}
 	}
 
