diff --git a/eureka-client/src/main/java/com/netflix/discovery/shared/resolver/aws/DnsTxtRecordClusterResolver.java b/eureka-client/src/main/java/com/netflix/discovery/shared/resolver/aws/DnsTxtRecordClusterResolver.java
index 413f2f8..17047c0 100644
--- a/eureka-client/src/main/java/com/netflix/discovery/shared/resolver/aws/DnsTxtRecordClusterResolver.java
+++ b/eureka-client/src/main/java/com/netflix/discovery/shared/resolver/aws/DnsTxtRecordClusterResolver.java
@@ -133,7 +133,7 @@
                 }
             }
             return endpoints;
-        } catch (NamingException e) {
+        } catch (Exception e) {
             throw new ClusterResolverException("Cannot resolve Eureka cluster addresses for root: " + rootClusterDNS, e);
         }
     }
