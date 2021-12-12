diff --git a/cas-server-core/src/main/java/org/jasig/cas/services/UnauthorizedServiceForPrincipalException.java b/cas-server-core/src/main/java/org/jasig/cas/services/UnauthorizedServiceForPrincipalException.java
index 1cf21f4..58d4f09d 100644
--- a/cas-server-core/src/main/java/org/jasig/cas/services/UnauthorizedServiceForPrincipalException.java
+++ b/cas-server-core/src/main/java/org/jasig/cas/services/UnauthorizedServiceForPrincipalException.java
@@ -28,7 +28,7 @@
  * @author Misagh Moayyed mmoayyed@unicon.net
  * @since 4.1
  */
-public class UnauthorizedServiceForPrincipalException extends UnauthorizedServiceException {
+public final class UnauthorizedServiceForPrincipalException extends UnauthorizedServiceException {
 
     private static final long serialVersionUID = 8909291297815558561L;
 
@@ -39,7 +39,7 @@
      * Instantiates a new unauthorized sso service exception.
      */
     public UnauthorizedServiceForPrincipalException() {
-        this(CODE);
+        super(CODE, "");
     }
 
     /**
