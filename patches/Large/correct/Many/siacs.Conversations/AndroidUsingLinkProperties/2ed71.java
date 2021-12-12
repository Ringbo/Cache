diff --git a/src/main/java/eu/siacs/conversations/utils/AndroidUsingLinkProperties.java b/src/main/java/eu/siacs/conversations/utils/AndroidUsingLinkProperties.java
index c184d72..4e137a7 100644
--- a/src/main/java/eu/siacs/conversations/utils/AndroidUsingLinkProperties.java
+++ b/src/main/java/eu/siacs/conversations/utils/AndroidUsingLinkProperties.java
@@ -56,9 +56,9 @@
         List<String> out = new ArrayList<>();
         for(InetAddress addr : in) {
             if (addr instanceof Inet4Address) {
-                out.add(0, addr.toString());
+                out.add(0, addr.getHostAddress());
             } else {
-                out.add(addr.toString());
+                out.add(addr.getHostAddress());
             }
         }
         return out;
