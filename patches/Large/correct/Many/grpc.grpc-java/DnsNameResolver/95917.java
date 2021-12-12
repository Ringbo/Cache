diff --git a/core/src/main/java/io/grpc/internal/DnsNameResolver.java b/core/src/main/java/io/grpc/internal/DnsNameResolver.java
index e1c1f98..b06502a 100644
--- a/core/src/main/java/io/grpc/internal/DnsNameResolver.java
+++ b/core/src/main/java/io/grpc/internal/DnsNameResolver.java
@@ -341,7 +341,9 @@
         ResolutionResults jdniResults = jndiResovler.resolve(host);
         txtRecords = jdniResults.txtRecords;
         balancerAddresses = jdniResults.balancerAddresses;
-      } catch (Exception e) {
+      } catch (Throwable e) {
+        // JndiResolver.resolve may throw Error that could cause rpc to hang.
+        // Catch and log Throwable and keep using jdkResolver's result to prevent it.
         logger.log(Level.SEVERE, "Failed to resolve TXT results", e);
       }
 
