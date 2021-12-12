diff --git a/smack-core/src/main/java/org/jivesoftware/smack/proxy/Socks5ProxySocketConnection.java b/smack-core/src/main/java/org/jivesoftware/smack/proxy/Socks5ProxySocketConnection.java
index 053c1a6..33c887e 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/proxy/Socks5ProxySocketConnection.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/proxy/Socks5ProxySocketConnection.java
@@ -137,7 +137,7 @@
                     System.arraycopy(userBytes, 0, buf, index, 
                         user.length());
                     index += user.length();
-                    byte[] passwordBytes = user.getBytes(StringUtils.UTF8);
+                    byte[] passwordBytes = passwd.getBytes(StringUtils.UTF8);
                     buf[index++] = (byte) (passwordBytes.length);
                     System.arraycopy(passwordBytes, 0, buf, index, 
                         passwd.length());
