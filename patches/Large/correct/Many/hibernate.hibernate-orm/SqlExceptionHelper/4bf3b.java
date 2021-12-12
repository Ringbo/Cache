diff --git a/hibernate-core/src/main/java/org/hibernate/engine/jdbc/spi/SqlExceptionHelper.java b/hibernate-core/src/main/java/org/hibernate/engine/jdbc/spi/SqlExceptionHelper.java
index 7aa4768..8a27415 100644
--- a/hibernate-core/src/main/java/org/hibernate/engine/jdbc/spi/SqlExceptionHelper.java
+++ b/hibernate-core/src/main/java/org/hibernate/engine/jdbc/spi/SqlExceptionHelper.java
@@ -248,7 +248,7 @@
 	public void walkWarnings(
 			SQLWarning warning,
 			WarningHandler handler) {
-		if ( warning == null || handler.doProcess() ) {
+		if ( warning == null || !handler.doProcess() ) {
 			return;
 		}
 		handler.prepare( warning );
