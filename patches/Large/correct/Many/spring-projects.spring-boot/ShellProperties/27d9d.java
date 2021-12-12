diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/ShellProperties.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/ShellProperties.java
index 84fb11f..957253d 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/ShellProperties.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/ShellProperties.java
@@ -236,12 +236,12 @@
 		/**
 		 * SSH port.
 		 */
-		private String port = "2000";
+		private Integer port = 2000;
 
 		@Override
 		protected void applyToCrshShellConfig(Properties config) {
 			if (this.enabled) {
-				config.put("crash.ssh.port", this.port);
+				config.put("crash.ssh.port", String.valueOf(this.port));
 				if (this.keyPath != null) {
 					config.put("crash.ssh.keypath", this.keyPath);
 				}
@@ -267,10 +267,10 @@
 
 		public void setPort(Integer port) {
 			Assert.notNull(port, "port must not be null");
-			this.port = port.toString();
+			this.port = port;
 		}
 
-		public String getPort() {
+		public Integer getPort() {
 			return this.port;
 		}
 
@@ -291,12 +291,12 @@
 		/**
 		 * Telnet port.
 		 */
-		private String port = "5000";
+		private Integer port = 5000;
 
 		@Override
 		protected void applyToCrshShellConfig(Properties config) {
 			if (this.enabled) {
-				config.put("crash.telnet.port", this.port);
+				config.put("crash.telnet.port", String.valueOf(this.port));
 			}
 		}
 
@@ -310,10 +310,10 @@
 
 		public void setPort(Integer port) {
 			Assert.notNull(port, "port must not be null");
-			this.port = port.toString();
+			this.port = port;
 		}
 
-		public String getPort() {
+		public Integer getPort() {
 			return this.port;
 		}
 
