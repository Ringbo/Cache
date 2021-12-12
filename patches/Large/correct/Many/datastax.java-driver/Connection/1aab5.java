diff --git a/driver-core/src/main/java/com/datastax/driver/core/Connection.java b/driver-core/src/main/java/com/datastax/driver/core/Connection.java
index 2f9cc79..de83635 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/Connection.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/Connection.java
@@ -154,7 +154,7 @@
                         case READY:
                             break;
                         case ERROR:
-                            throw new AuthenticationException(address, (((ErrorMessage)response).error).getMessage());
+                            throw new AuthenticationException(address, (((ErrorMessage)authResponse).error).getMessage());
                         default:
                             throw defunct(new TransportException(address, String.format("Unexpected %s response message from server to a CREDENTIALS message", authResponse.type)));
                     }
