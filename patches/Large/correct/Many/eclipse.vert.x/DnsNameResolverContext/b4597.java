diff --git a/src/main/java/io/vertx/core/dns/impl/fix/DnsNameResolverContext.java b/src/main/java/io/vertx/core/dns/impl/fix/DnsNameResolverContext.java
index 46e9285..76c0c96 100644
--- a/src/main/java/io/vertx/core/dns/impl/fix/DnsNameResolverContext.java
+++ b/src/main/java/io/vertx/core/dns/impl/fix/DnsNameResolverContext.java
@@ -469,7 +469,7 @@
         return null;
       }
 
-      return name.substring(0, name.length() - 1);
+      return name.toString();
     } finally {
       buf.resetReaderIndex();
     }
