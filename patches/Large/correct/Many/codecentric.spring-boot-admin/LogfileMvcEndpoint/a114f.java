diff --git a/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/actuate/LogfileMvcEndpoint.java b/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/actuate/LogfileMvcEndpoint.java
index b4c0451..d9af042 100644
--- a/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/actuate/LogfileMvcEndpoint.java
+++ b/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/actuate/LogfileMvcEndpoint.java
@@ -109,12 +109,12 @@
 
 	@RequestMapping(method = RequestMethod.HEAD)
 	@ResponseBody
-	public ResponseEntity<Void> available() {
+	public ResponseEntity<Object> available() {
 		if (isAvailable()) {
-			return new ResponseEntity<Void>(HttpStatus.OK);
+			return new ResponseEntity<Object>(HttpStatus.OK);
 		}
 		else {
-			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
+			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
 		}
 	}
 
