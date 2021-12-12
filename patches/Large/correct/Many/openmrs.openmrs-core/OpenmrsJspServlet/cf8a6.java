diff --git a/web/src/main/java/org/openmrs/web/OpenmrsJspServlet.java b/web/src/main/java/org/openmrs/web/OpenmrsJspServlet.java
index a4df15d..0a4c878 100644
--- a/web/src/main/java/org/openmrs/web/OpenmrsJspServlet.java
+++ b/web/src/main/java/org/openmrs/web/OpenmrsJspServlet.java
@@ -51,7 +51,7 @@
 		try {
 			this.destroy();
 		}
-		catch (Throwable ex) {
+		catch (Exception ex) {
 			log.error(ex);
 		}
 	}
@@ -64,7 +64,7 @@
 			field.setAccessible(true);
 			init((ServletConfig) field.get(this));
 		}
-		catch (Throwable ex) {
+		catch (Exception ex) {
 			log.error(ex);
 		}
 	}
