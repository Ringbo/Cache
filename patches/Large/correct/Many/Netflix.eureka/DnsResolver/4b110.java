diff --git a/eureka-client/src/main/java/com/netflix/discovery/endpoint/DnsResolver.java b/eureka-client/src/main/java/com/netflix/discovery/endpoint/DnsResolver.java
index 678a90c..05b696f 100644
--- a/eureka-client/src/main/java/com/netflix/discovery/endpoint/DnsResolver.java
+++ b/eureka-client/src/main/java/com/netflix/discovery/endpoint/DnsResolver.java
@@ -75,7 +75,7 @@
 
             } while (targetHost == null);
             return targetHost;
-        } catch (NamingException e) {
+        } catch (Exception e) {
             logger.warn("Cannot resolve eureka server address {}; returning original value {}", currentHost, originalHost, e);
             return originalHost;
         }
